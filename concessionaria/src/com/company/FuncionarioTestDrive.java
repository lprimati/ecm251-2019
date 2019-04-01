package com.company;

public class FuncionarioTestDrive {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Carlos", 1000);
        System.out.println("Salario do mes: " + f1.getsalarioMes(10000));
    }


}
