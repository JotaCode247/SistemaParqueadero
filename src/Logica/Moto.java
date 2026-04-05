package Logica;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto() {
    }

    // Constructor actualizado (sin casco y con hora int)
    public Moto(int cilindraje, String placa, int horaEntrada) {
        super(placa, horaEntrada);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje; 
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje; 
    }
}