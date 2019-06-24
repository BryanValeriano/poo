package teste;

import conversao.*;
import java.util.Scanner;

class Teste {
    public static void main(String[] args) {
        int op;
        double c = 20;
        double f = 50;
        double k = 300;
        double x;

        ConversaoDeTemperatura conv = new ConversaoDeTemperatura();
        Scanner in = new Scanner(System.in);
    
        System.out.println("20 celsius para Fahrenheit " + conv.cToF(c));
        System.out.println("20 celsius para kelvin " + conv.cToK(c));
        System.out.println("50 Fahrenheit para celsius " + conv.fToC(f));
        System.out.println("50 Fahrenheit para kelvin " + conv.fToK(f));
        System.out.println("300 kelvin para celsius " + conv.kToC(k));
        System.out.println("300 kelvin para Fahrenheit " + conv.kToF(k));

        System.out.println("\nEsolha uma conversão e a temperatura"); 
        System.out.println("1 celsius para Fahrenheit"); 
        System.out.println("2 celsius para kelvin"); 
        System.out.println("3 Fahrenheit para celsius"); 
        System.out.println("4 Fahrenheit para kelvin"); 
        System.out.println("5 kelvin para celsius"); 
        System.out.println("6 kelvin para Fahrenheit"); 
        
        op = in.nextInt();
        x = in.nextDouble();
       
        if(op == 1) System.out.println(conv.cToF(x));
        else if(op == 2) System.out.println(conv.cToK(x));
        else if(op == 3) System.out.println(conv.fToC(x));
        else if(op == 4) System.out.println(conv.fToK(x));
        else if(op == 5) System.out.println(conv.kToC(x));
        else if(op == 6) System.out.println(conv.kToF(x));
        else System.out.println("input errado");

    }
}

