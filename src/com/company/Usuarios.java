package com.company;
//Lucas Primati Menezes 16.00683-6
//Rodrigo Teixeira 16.04031-7

import java.util.Scanner;

public class Usuarios {
    private String nome;
    private String email;
    private String cpf;
    private String nascimento;
    Scanner scanner;

    private Carteiras minhaCarteira;
    private String pagamento;

    public Usuarios(String nome, String email, String cpf, String nascimento){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public Carteiras getCarteiras(){
        return minhaCarteira;

    }public String Pagamento(Carteiras carteiras, Cartoes cartoes){
        scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.next();

        if(nome.equals("Lucas")){
            this.getCarteiras();
            System.out.println("Digite a senha: ");
            int senha = scanner.nextInt();
            if(senha == 1234){
                System.out.println("Pagamento realizado!");
            }else{
                System.out.println("Senha inválida");
            }
        }else{
            this.getCarteiras();
            System.out.println("Digite o tipo do Cartao: ");
            String cartao = scanner.next();


            if(cartao.equals("Debito")){
                System.out.println("Digite a senha: ");
                int senha = scanner.nextInt();

                if(senha == 1234){
                    System.out.println("Pagamento realizado!");
                }else{
                    System.out.println("Senha inválida");
                }

            }else{
                int senha = scanner.nextInt();
                if(senha == 4321){
                    System.out.println("Pagamento realizado!");
                }else{
                    System.out.println("Senha inválida");
                }
            }

        }
        return this.Pagamento(carteiras, cartoes);

    }




}
