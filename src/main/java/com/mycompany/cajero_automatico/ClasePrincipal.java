package com.mycompany.cajero_automatico;

public class ClasePrincipal {
    public static void main(String[] args) {

        ClasePadre mensajero = new Consulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
    }
}
