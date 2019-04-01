package com.company;

public class GerenteDeVendas {
    private double porcentagemDeComissao;
    private double salarioBase;

    private String nome;

    public GerenteDeVendas(String nome, double salarioBase){
        this.nome = nome;
        this.porcentagemDeComissao = 0.1;
        this.salarioBase = salarioBase;

    }

    public double getsalarioMes(double totalDeVendas){
        return getComissao(totalDeVendas) + this.salarioBase;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemDeComissao*totalDeVendas + this.salarioBase*0.5;
    }
    public boolean aumentarSalarioBaseVendedor(Vendedor vendedor){
        if (vendedor.getMeuGerente().equals(this)){
            return true;
        } else {
            return false;
        }

    }

}
