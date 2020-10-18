package com.mycompany.cajero_automatico;

public class Retiro extends ClasePadre{

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas retirar: ");
        Retiro();

        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            
            System.out.print("----------------------------------");
            System.out.print("Retiraste: " + retiro);
            System.out.print("Tu saldo actual es: " + getSaldo());
            System.out.print("----------------------------------");
        } else {
            System.out.print("------------------");
            System.out.print("Saldo insuficiente");
            System.out.print("------------------");
          }
    }
    
}
