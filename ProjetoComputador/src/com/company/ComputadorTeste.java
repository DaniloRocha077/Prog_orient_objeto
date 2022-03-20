package com.company;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador computador = new Computador();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a marca do computador: ");
        computador.marca = input.nextLine();
        computador.cor = "Verde";
        computador.modelo = "i5 9400f";
        computador.numeroSerie = 123456;
        System.out.println("Digite o valor do preço: ");
        computador.preco = Double.parseDouble(input.nextLine());
        computador.imprimir();
        computador.calcularValor();
        computador.imprimir();

        System.out.println("-------------------");

        Computador computador1 = new Computador();
        System.out.println("Digite a marca do computador: ");
        computador1.marca = input.nextLine();
        computador1.cor = "Azul";
        computador1.modelo = "Ryzen 5 3300";
        computador1.numeroSerie = 654321;
        System.out.println("Digite o valor do preço: ");
        computador1.preco = Double.parseDouble(input.nextLine());
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();
        computador1.alterarValor(8000);{
            if(computador1.alterarValor() == 1){
                System.out.println("Valor alterado");
            }
            else{
                System.out.println("Valor NÂO alterado");
            }
        }

    }
}