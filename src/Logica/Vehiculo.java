package Logica;

import java.time.LocalDateTime;

public abstract class Vehiculo {
   //protected LocalDateTime horaEntrada;
    protected String placa;
    protected int horaEntrada; // Cambiado a int para simulación

    public Vehiculo() {
    }

    public Vehiculo(String placa, int horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada; 
    }

    public String getPlaca() { 
        return placa; 
    }
    
    public void setPlaca(String placa) { 
        this.placa = placa; 
    }

    public int getHoraEntrada() { 
        return horaEntrada; 
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada; 
    }
    
    
}
  
