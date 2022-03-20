package com.company;

public class ApoliceTeste {

    public static void main(String[] args) {
        // write your code here
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Danilo Rocha");
        apolice.setIdade(34);
        apolice.setValorPremio(1000.00f);

        apolice.imprimir();
    }
}
