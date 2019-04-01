package com.company;

public class Vendedor {
    private double porcentagemDeComissao;
    private double salarioBase;
    private String nome;
    private GerenteDeVendas meuGerente;

    public Vendedor(String nome, double salarioBase, GerenteDeVendas meuGerente){
        this.nome = nome;
        this.porcentagemDeComissao = 0.05;
        this.salarioBase = salarioBase;
        this.meuGerente = meuGerente;

    }

    public double getsalarioMes(double totalDeVendas){
        return this.porcentagemDeComissao*totalDeVendas + this.salarioBase;
    }
    public double getComissao(double totalDeVendas){
        return this.porcentagemDeComissao*totalDeVendas;
    }

    public GerenteDeVendas getMeuGerente() {
        return meuGerente;
    }
}

