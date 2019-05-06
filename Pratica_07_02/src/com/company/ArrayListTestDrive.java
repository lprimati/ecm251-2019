package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        List<item> lista = new ArrayList<item>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Informe ID e Nome:");
            int id = scanner.nextInt();
            String nome = scanner.next();
            lista.add(new item(id, nome));
            System.out.println("Continuar?");
            if(scanner.nextInt()== 0 ) break;
        }
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Itens da lista" );
        for (item i: lista){
            System.out.println("item - " + i);
        }
    }
}
