package Logica;

public class Usuario {
    private final String user = "admin";
    private final String pass = "1234";

    public boolean login(String u, String p) {
        return user.equals(u) && pass.equals(p);
    } 
}
