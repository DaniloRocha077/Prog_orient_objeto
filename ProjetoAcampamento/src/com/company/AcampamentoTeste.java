package com.company;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Acampamento acampamento = new Acampamento();
        System.out.println("Digite o seu nome: ");
        acampamento.nome = input.nextLine();
        System.out.println("Digite a sua idade: ");
        acampamento.idade = Integer.parseInt(input.nextLine());

        acampamento.imprimir();

        acampamento.separarGrupo();

        acampamento.imprimir();
    }
}
