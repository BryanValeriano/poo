package principal;

import racional.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NumeroRacional x = new NumeroRacional();
        NumeroRacional y = new NumeroRacional(21,49);
        System.out.println(x.toString()); 
        System.out.println(y.toString()); 

        System.out.println("\n" + x.toString() + " + " + y.toString() + " = "); 
        x.soma(y);
        System.out.println(x.toString());

        int a,b,c,d;

        System.out.println("\nDigite o numerador e o denominador da primeira fracao:");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("Digite o numerador e o denominador da segunda fracao:");
        c = in.nextInt();
        d = in.nextInt();

        x = new NumeroRacional(a,b);
        y = new NumeroRacional(c,d);

        System.out.println("\n" + x.toString() + " + " + y.toString() + " = "); 
        x.soma(y);
        System.out.println(x.toString());
    }
}
