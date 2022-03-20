package com.company;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;
    public double acresc;

    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de Série: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    public void calcularValor(){
        System.out.println("Calculando novo preço!");
        if (marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        else if (marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
            return;
        }
        else {
            System.out.println("Preço continua o mesmo");
        }
    }
    public int alterarValor(double valor){
        if (valor > 0){
            preco = valor;
            return 1;
        }
        else {
            return 0;
        }
    }
}