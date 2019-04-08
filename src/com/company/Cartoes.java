package com.company;
//Lucas Primati Menezes 16.00683-6
//Rodrigo Teixeira 16.04031-7
public class Cartoes {
    private double taxaConversaoDolar;
    private int idCartao;
    private String label;
    private String emissorCartao;
    private String tipo;
    private String dataEmissao;
    private String validade;
    private int ccv;
    private int senha;
    private int numeroCartao;
    private int numeroConta;


    public Cartoes(int idCartao) {
        this.idCartao = idCartao;
        this.tipo = tipo;
        if (idCartao == 1) {
            this.senha = 1234;
            this.validade = "09/2022";
            this.ccv = 550;
            this.dataEmissao = "09/2019";
            this.emissorCartao = "Meu banco";
            this.label = "MasterCard";
            this.numeroCartao = 30;
            this.numeroConta = 12;
            this.tipo = "Debito";
        } else if(idCartao == 2){
            senha = 4321;
            this.validade = "08/2022";
            this.ccv = 540;
            this.dataEmissao = "08/2019";
            this.emissorCartao = "Meu banco";
            this.label = "MasterCard";
            this.numeroCartao = 27;
            this.numeroConta = 11;
            this.tipo = "Credito";
        }else{
            senha = 4321;
            this.validade = "07/2022";
            this.ccv = 540;
            this.dataEmissao = "07/2019";
            this.emissorCartao = "Meu banco";
            this.label = "MasterCard";
            this.numeroCartao = 14;
            this.numeroConta = 10;
            this.tipo = "Debito";
        }

    }

}

