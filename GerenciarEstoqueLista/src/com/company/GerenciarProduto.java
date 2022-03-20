package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {

    private List<Produto> produtos = new ArrayList<>();

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
        Produto produ = new Produto();
        System.out.println("Digite o código do Produto: ");
        produ.setCodProduto(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o nome do Produto: ");
        produ.setNomeProduto(input.nextLine());
        System.out.println("Digite o nome do Fornecedor: ");
        produ.setFornecedor(input.nextLine());
        System.out.println("Digite a quantidade: ");
        produ.setQuantidadedisp(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o Preço unitário: ");
        produ.setPreco(Integer.parseInt(input.nextLine()));
        produtos.add(produ);
    }
    public void execRegistarEntrada(){
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o código do produto a ser alterado");
        int codprod = Integer.parseInt(input.nextLine());
        for(Produto prod : produtos){
            if(prod.getCodProduto() == codprod){
                System.out.println("Digite a quantidade comprada: ");
                int quant = Integer.parseInt(input.nextLine());
                if(prod.entrada(quant)==1){
                    System.out.println("Entrada realizada com sucesso");
                }
                else
                    System.out.println("Entrada inválida");
            }
        }
        System.out.println("Produto não encontrato");
    }
    public void execRegistrarSaida(){
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o código do produto a ser retirado");
        int codprod = Integer.parseInt(input.nextLine());
        for(Produto prod : produtos){
            if(prod.getCodProduto() == codprod){
                System.out.println("Digite a quantidade de saída: ");
                int quant = Integer.parseInt(input.nextLine());
                if(prod.saida(quant)==1){
                    System.out.println("Saída realizada com sucesso");
                }
                else
                    System.out.println("Saída não realizada");
            }
        }
        System.out.println("Produto não encontrato");
    }
    public void execBonificar(){
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o código do produto a ser retirado");
        int codprod = Integer.parseInt(input.nextLine());
        for(Produto prod : produtos) {
            if (prod.getCodProduto() == codprod) {
                System.out.println("Digite a % do Bonus: ");
                double bonus = Double.parseDouble(input.nextLine());
                prod.bonificar(bonus);
            }
        }
        System.out.println("Produto não encontrado");
    }
    public void execConsultar(){
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o código do produto a consultar: ");
        int codASerConsultado = Integer.parseInt(input.nextLine());
        for(Produto prod : produtos){
            if(prod.getCodProduto() == codASerConsultado){
                prod.imprimir();
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }
}
