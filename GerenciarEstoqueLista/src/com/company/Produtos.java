package com.company;

public class Produtos {
    private int codProduto;
    private String nome;
    private String fornecedor;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString(){
        return "Dados do Produto: /n" +
                "Código do Produto: " + codProduto + "/n" +
                "Fornecedor> " + fornecedor;
    }
}
