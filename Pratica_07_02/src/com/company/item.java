package com.company;

public class item {
    private int id;
    private String nome;

    public item(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + " ID - " + this.id;
    }
}
