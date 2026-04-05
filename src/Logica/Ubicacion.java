package Logica;

public class Ubicacion {
    private int idUbicacion;
    private boolean disponible;
    private Vehiculo vehiculo;

    public Ubicacion() {
        this.disponible = true;
        this.vehiculo = null;
    }

    public Ubicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
        this.disponible = true;
        this.vehiculo = null;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int id) {
        this.idUbicacion = id; 
    }

    public boolean isDisponible() {
        return disponible; 
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible; 
    }

    public Vehiculo getVehiculo() { 
        return vehiculo;
    }

    public void asignarVehiculo(Vehiculo v) {
        this.vehiculo = v;
        this.disponible = false;
    }

    public void liberarUbicacion() {
        this.vehiculo = null;
        this.disponible = true;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}