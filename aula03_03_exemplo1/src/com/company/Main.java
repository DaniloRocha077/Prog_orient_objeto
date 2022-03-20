package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario = new Usuario();
        usuario.setNome("Carlos Augusto do Santos");
        usuario.setEmail("carlos.santos@fatec.sp.gov.br");
        usuario.setLogin("usucarlos");
        usuario.setSenha("123");

        usuario.provarExistencia();
        System.out.println("Email do usuário: " + usuario.getEmail());
    }
}