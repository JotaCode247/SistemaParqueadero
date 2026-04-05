package Logica;

public class Carro extends Vehiculo {
private String tipodeCarro; 

    public Carro() {
    }

    // Constructor actualizado para recibir la hora
    public Carro(String tipodeCarro, String placa, int horaEntrada) {
        super(placa, horaEntrada);
        this.tipodeCarro = tipodeCarro;
    }

    public String getTipodeCarro() { 
        return tipodeCarro; 
    }
    
    public void setTipodeCarro(String tipodeCarro) { 
        this.tipodeCarro = tipodeCarro;
    }
}