package com.company;

public class Acampamento {
    public String nome;
    public char equipe = ' ';
    public int idade;

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Equipe: " + equipe);
        System.out.println("Idade: " + idade);
    }
    public void separarGrupo(){
        if (idade < 10){
            equipe='A';
        }
        if (idade > 10 && idade <=20){
            equipe='B';
        }
        if (idade >20){
            equipe='C';
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}