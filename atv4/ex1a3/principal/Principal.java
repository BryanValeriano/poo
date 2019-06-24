package principal;

import lista.*;
import java.lang.Math;

public class Principal {
    public static void main(String[] args) {
        ListaLigada l = new ListaLigada();
        
        System.out.println("Adicionando items aleatorios usando metodo para inserir ordenado");

        for(int i = 0; i < 20; i++) { 
            int x = (int)(Math.random()*100);
            System.out.println(x);
            l.adicionaItemOrdenado(x);
        }
        System.out.println();
        l.imprimeListaLigada();

        l.removeItem(1);
        System.out.println();
        System.out.println("Removendo item 1");
        l.imprimeListaLigada();

        l.removeItem(8);
        System.out.println();
        System.out.println("Removendo item 8");
        l.imprimeListaLigada();

        System.out.println();
        System.out.println("2 existe na lista? " + l.busca(2));
        System.out.println("7 existe na lista? " + l.busca(7));
        System.out.println("1 existe na lista? " + l.busca(1));
        System.out.println("4 existe na lista? " + l.busca(4));
        System.out.println("8 existe na lista? " + l.busca(8));
        
        System.out.println();
        System.out.println("Invertendo a lista");
        l.imprimeListaLigada();

    }


