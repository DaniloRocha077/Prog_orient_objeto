package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner aluno = new Scanner (System.in);
        System.out.println("digite seu RA: ");
        int ra = aluno.nextInt();
        System.out.println("digite seu nome: ");
        String nome = aluno.next();
        System.out.println("digite seu curso: ");
        String curso = aluno.next();
        System.out.println("Seu RA é " + ra + ", seu nome é " + nome + " e seu curso é " + curso);
    }
}

