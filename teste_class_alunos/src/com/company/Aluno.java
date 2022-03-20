package com.company;

public class Aluno {
    //atributos da classe
    int ra;
    String nome;
    String curso;

    //métodos
    void matricular(){
        System.out.println("Aluno " + nome + " foi matriculado");
    }
    void cancelarMatricula(){
        System.out.println("Matrícula do(a)" +nome + " foi cancelado(a)");
    }
}

