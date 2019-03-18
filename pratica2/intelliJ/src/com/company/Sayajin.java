package com.company;

public class Sayajin {
    String nome;
    double ki;
    boolean odio;
    int nivelDeSuper;


    public void Treinar(){
        if (odio)
                ki = ki *1.2;
        else
            ki = ki * 1.1;
        System.out.println("Depois do treno o poder de luta é: " + ki);

    }

    public String pegarCorDoCabelo(){
        String resultado;
        if(nivelDeSuper == 0)
            resultado = "preto";
        else if(nivelDeSuper > 0 && nivelDeSuper <= 3)
            resultado = "Amarelo";
        else
            resultado = "Azul";
        return resultado;


    }
}
