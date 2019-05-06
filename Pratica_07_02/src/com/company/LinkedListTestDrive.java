package com.company;

import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<item> lista = new LinkedList<item>();
        lista.add(new item(1, "XBOX ONE"));
        lista.add(0, new item(2, "Switch"));
        lista.add(new item(3, "PS4"));


        System.out.println("Tamanho:" + lista.size());
        for (item i: lista){
            System.out.println("Item - " + i);
        }

    }
}
