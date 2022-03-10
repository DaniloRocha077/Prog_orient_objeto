package com.company;

import java.util.Scanner;

public class GerenciarProduto {

    public Produto produto = new Produto();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    GerenciarProduto gerenciar = new GerenciarProduto();
        int opcao;
        do{
            //menu
            System.out.println("Menu Principal ");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Registrar Entrada");
            System.out.println("3- Registrar Saída");
            System.out.println("4- Bonificar");
            System.out.println("5- Consultar");
            System.out.println("9- Sair");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execRegistarEntrada();
                    break;
                case 3:
                    gerenciar.execRegistrarSaida();
                    break;
                case 4:
                    gerenciar.execBonificar();
                    break;
                case 5:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Codigo: ");
        produto.codigo = Long.parseLong(input.nextLine());
        System.out.println("Digite seu Nome: ");
        produto.nome = input.nextLine();
        System.out.println("Digite o Fornecedor: ");
        produto.fornecedor = input.nextLine();
        System.out.println("Digite a Quandidade: ");
        produto.quantidadedisp = Integer.parseInt(input.nextLine());
        System.out.println("Digite o Preço: ");
        produto.preco = Double.parseDouble(input.nextLine());
    }
    public void execRegistarEntrada(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Quandidade: ");
        int quant = Integer.parseInt(input.nextLine());
        if(produto.entrada(quant)==1){
            produto.quantidadedisp += quant;
            System.out.println("Entrada realizada com sucesso");
        }
        else{
            System.out.println("A quanditade é inválida ou negativa");
        }

    }
    public void execRegistrarSaida(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Quandidade: ");
        int quant = Integer.parseInt(input.nextLine());
        if(produto.saida(quant)==1){
            produto.quantidadedisp -= quant;
            System.out.println("Saida efetuada com sucesso");
        }
        else{
            System.out.println("A quanditade é inválida ou negativa");
        }
    }
    public void execBonificar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a % do Bonus: ");
        double bonus = Double.parseDouble(input.nextLine());
        produto.bonificar(bonus);
    }
    public void execConsultar(){
        produto.imprimir();
    }
}
