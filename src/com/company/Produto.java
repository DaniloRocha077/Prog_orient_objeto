package com.company;

import java.text.DecimalFormat;

public class Produto {
    public long codigo;
    public String nome;
    public String fornecedor;
    public int quantidadedisp;
    public double preco;

    public void imprimir(){
        DecimalFormat formato = new DecimalFormat("#0.00");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Quandidade disponivel: " + quantidadedisp);
        System.out.println("Preço: R$ " + formato.format(preco));
    }
    public int saida(int quant){
        if(quantidadedisp >= quant)
            return 1;
        else
            return 0;
    }
    public int entrada(int quant){
        if(quant > 0)
            return 1;
        else
            return 0;
    }
    public void bonificar(double bonus){
        preco *= bonus/100+1;
    }
}
