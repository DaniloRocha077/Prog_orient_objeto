package com.company;

import java.text.DecimalFormat;

public class Produto {
    private int codProduto;
    private String nomeProduto;
    private String fornecedor;
    private Produto prod;
    private int quantidadedisp;
    private double preco;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public int getQuantidadedisp() {
        return quantidadedisp;
    }

    public void setQuantidadedisp(int quantidadedisp) {
        this.quantidadedisp = quantidadedisp;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        DecimalFormat moeda = new DecimalFormat("#0.00");
        System.out.println("Dados do Produto");
        System.out.println("Codigo: " + codProduto);
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Quantidade disponível: " + quantidadedisp);
        System.out.println("Preço: R$ " + moeda.format(preco));
    }
    public int saida(int quant){
        if(quantidadedisp >= quant){
            quantidadedisp -= quant;
            return 1;
        }
        else
            return 0;
    }
    public int entrada(int quant){
        if(quant > 0){
            quantidadedisp += quant;
            return 1;
        }
        else
            return 0;
    }
    public void bonificar(double bonus){
        preco *= bonus/100+1;
    }
}
