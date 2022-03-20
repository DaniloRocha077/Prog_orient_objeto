package com.company;

public class Conta {
    public int numConta;
    public String nomeCliente;
    public double saldo;
    public String nomeBanco;
    public static double cpmf = 0.0038;

    public void imprimir(){
        System.out.println("Num. Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}
