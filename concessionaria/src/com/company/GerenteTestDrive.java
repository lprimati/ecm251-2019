package com.company;

public class GerenteTestDrive {
    public static void main(String[] args){
        GerenteDeVendas g1 = new GerenteDeVendas("Carlos", 1000);
        System.out.println("Salario do mes: " + g1.getsalarioMes(10000));
    }
}
