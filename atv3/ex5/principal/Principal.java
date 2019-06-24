package principal;

import racional.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        MatrizRacional x = new MatrizRacional();     
        MatrizRacional y = new MatrizRacional();     
        x.imprime();
        System.out.println();
        y.imprime();
        System.out.println();
        x.soma(y);
        x.imprime();
    }
}
