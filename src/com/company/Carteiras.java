package com.company;
//Lucas Primati Menezes 16.00683-6
//Rodrigo Teixeira 16.04031-7
public class Carteiras {
    private int idCarteira;
    private String nomeCarteira;
    private int senhaAcesso;
    private boolean cartaoDebito;
    private boolean cartaoCredito;

    public Carteiras(String nomeCarteira, int idCarteira){
        this.nomeCarteira = nomeCarteira;
        this.idCarteira = idCarteira;

        if(idCarteira == 1){
            this.idCarteira = idCarteira;
            this.cartaoDebito = true;
            this.senhaAcesso = 4567;
        }
        else{
            this.idCarteira = idCarteira;
            this.cartaoDebito = true;
            this.cartaoCredito = true;
            this.senhaAcesso = 7654;
        }
    }


}
