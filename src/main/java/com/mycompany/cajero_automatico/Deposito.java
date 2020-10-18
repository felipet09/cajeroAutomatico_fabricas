package com.mycompany.cajero_automatico;

public class Deposito extends ClasePadre{

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        
        System.out.print("----------------------------------");
        System.out.print("Depositaste: " + deposito);
        System.out.print("Tu saldo actual es: " + getSaldo());
        System.out.print("----------------------------------");
    }

}