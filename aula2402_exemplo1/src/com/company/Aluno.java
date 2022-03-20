package com.company;

public class Aluno {
    //atributos da classe
    int ra;
    String nome;
    String curso;

    void matricular(){
        System.out.println("Aluno " + nome + "foi matriculado");
    }
    void cancelarMatricula(){
        System.out.println("Aluno " + nome + " foi cancelado");
    }
}
