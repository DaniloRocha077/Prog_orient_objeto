package com.company;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    //Métodos
    public void imprimir () {
        System.out.println("Nome do Segurado é " + nomeSegurado + " sua idade é " + idade + ", valor do prêmio é " + valorPremio);
    }

    //Métodos getter and setters


    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
}
