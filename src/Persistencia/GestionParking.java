package Persistencia;

import Logica.*;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.Duration;

public class GestionParking {

    private double saldoCaja;
    private ArrayList<Ubicacion> listaUbicaciones;
    private double valorHoraCarro;
    private double valorHoraMoto;
    private ArrayList<Object[]> historialPagos; 

    public GestionParking() {
        this.listaUbicaciones = new ArrayList<>();
        this.historialPagos = new ArrayList<>();
        this.saldoCaja = 0;
    }

    public void abrirParqueadero(double tarifaCarro, double tarifaMoto, int capacidad) {
        this.valorHoraCarro = tarifaCarro;
        this.valorHoraMoto = tarifaMoto;
        this.saldoCaja = 0;
        this.historialPagos = new ArrayList<>(); 
        this.listaUbicaciones = new ArrayList<>(); 

        for (int i = 1; i <= capacidad; i++) {
            this.listaUbicaciones.add(new Ubicacion(i));
        }
    }

    // MODIFICADO: Ahora recibe la hora de entrada capturada del TXT del formulario
    public String ingresarAleatorio(String placa, String tipo, String extra, int horaEntrada) {
        if (listaUbicaciones == null || listaUbicaciones.isEmpty()) {
            return "Error: El parqueadero no ha sido abierto.";
        }

        // Verificar si ya existe el vehículo
        if (buscarVehiculoPorPlaca(placa) != null) {
            return "Error: El vehículo con placa " + placa + " ya está en el sistema.";
        }

        Vehiculo nuevoV;
        try {
            if (tipo.equalsIgnoreCase("Carro")) {
                nuevoV = new Carro(extra, placa, horaEntrada);
            } else {
                int cilindraje = Integer.parseInt(extra);
                nuevoV = new Moto(cilindraje, placa, horaEntrada);
            }
        } catch (NumberFormatException e) {
            return "Error: Datos numéricos inválidos.";
        }

        // Buscar celdas libres
        ArrayList<Ubicacion> disponibles = new ArrayList<>();
        for (Ubicacion u : listaUbicaciones) {
            if (u.isDisponible()) disponibles.add(u);
        }

        if (disponibles.isEmpty()) return "No hay celdas disponibles.";

        // Asignación aleatoria
        Random r = new Random();
        Ubicacion seleccionada = disponibles.get(r.nextInt(disponibles.size()));
        seleccionada.asignarVehiculo(nuevoV);
        
        return "Vehículo asignado a la ubicación #" + seleccionada.getIdUbicacion();
    }

    // MODIFICADO: Este es el método que usará tu botón de "Confirmar Retiro"
    public String registrarSalidaYProcesar(String placa, int horaSalida) {
        Ubicacion u = buscarVehiculoPorPlaca(placa);
        
        if (u == null) return "Error: Vehículo no encontrado.";
        
        Vehiculo v = u.getVehiculo();
        
        // 1. Calcular tiempo (Salida - Entrada)
        int tiempo = horaSalida - v.getHoraEntrada();
        if (tiempo <= 0) tiempo = 1; // Cobro mínimo

        // 2. Calcular total
        double tarifa = (v instanceof Carro) ? valorHoraCarro : valorHoraMoto;
        double total = tiempo * tarifa;

        // 3. Registrar en historial para caja
        Object[] registro = new Object[]{
            u.getIdUbicacion(), 
            v.getPlaca(), 
            (v instanceof Carro ? "Carro" : "Moto"), 
            total
        };
        this.historialPagos.add(registro); 
        this.saldoCaja += total;
        
        // 4. Liberar espacio
        int idCerrado = u.getIdUbicacion();
        u.liberarUbicacion(); 
        
        return "Retiro exitoso. Puesto #" + idCerrado + " libre. Total pagado: $" + total;
    }

    public Ubicacion buscarVehiculoPorPlaca(String placa) {
        if (listaUbicaciones == null) return null;
        for (Ubicacion u : listaUbicaciones) { 
            if (!u.isDisponible() && u.getVehiculo().getPlaca().equalsIgnoreCase(placa)) {
                return u;
            }
        }
        return null;
    }

    // Getters necesarios
    public double getSaldoCaja() { return saldoCaja; }
    public ArrayList<Ubicacion> getListaUbicaciones() { return listaUbicaciones; }
    public double getValorHoraCarro() { return valorHoraCarro; }
    public double getValorHoraMoto() { return valorHoraMoto; }
    public ArrayList<Object[]> getHistorialPagos() { return historialPagos; }
}
