package com.company;

public class concessionariaTestDrive {
    public static void main(String[] args){

        GerenteDeVendas g1 = new GerenteDeVendas("Carlos 2", 6500);
        Vendedor v1 = new Vendedor("João", 1000, g1);

        double totalVendasMes = 10000;

        System.out.println("Vendedor:");
        System.out.println("Comissao: " + v1.getComissao(totalVendasMes));
        System.out.println("Comissao: ");
        System.out.println("Comissao: " + g1.getComissao(totalVendasMes));
        if(g1.aumentarSalarioBaseVendedor(v1)){
            System.out.println("Pode dar aumento!");
        } else {
            System.out.println("Sem aumento!!!!");
        }
    }
}
