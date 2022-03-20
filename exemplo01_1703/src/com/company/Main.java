package com.company;

public class Main {

    public static void main(String[] args) {
	// votor com 10 vlores inteiros
        int x[] = new int[10];
        //tradicional método de perorrer
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
        for(int vx : x){
            System.out.println(vx);
        }
        //matriz 3 x 2 com valores interios
        int matriz[][] = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //percorrer com for each
        for(int[] vetor : matriz){
            for(int valor : vetor){
                System.out.println(valor);
            }
        }
    }
}
