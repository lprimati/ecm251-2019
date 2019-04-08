package com.company;
//Lucas Primati Menezes 16.00683-6
//Rodrigo Teixeira 16.04031-7

import java.util.Scanner;


public class ComprasTeste {


    public static void main(String[] args) {
        Usuarios u1 = new Usuarios("Lucas","lucaspm_12@hotmail.com", "420332038-08","29/09/96");
        Usuarios u2 = new Usuarios("Rodrigo","rodrigo@maua.br","123123123-02","28/12/98");
        Carteiras c1 = new Carteiras("Lucas",1);
        Carteiras c2 = new Carteiras("Rodrigo", 2);
        Cartoes C1 = new Cartoes(1);
        Cartoes C2 = new Cartoes(2);
        Cartoes C3 = new Cartoes(3);
        System.out.println("pagamento: " + u1.Pagamento(c1,C1));

    }

}
