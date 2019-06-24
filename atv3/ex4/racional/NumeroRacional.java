package racional;

import java.lang.Math;

public class NumeroRacional {
    int numerador;
    int denominador;

    public NumeroRacional() {
        this.numerador = (int)(Math.random() * 10);
        this.denominador = (int)(Math.random() * 10) + 1;
        simplificar();
    }

    public NumeroRacional(int numerador, int denominador) {
        if(denominador == 0) {
            System.out.println("Erro! Denominador 0 substituido por 1");
            denominador = 1;
        }

        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public void soma(NumeroRacional x) {
        NumeroRacional tmp = new NumeroRacional(x.numerador, x.denominador);

        this.numerador *= tmp.denominador;
        tmp.numerador *= this.denominador;

        this.denominador *= tmp.denominador;

        this.numerador += tmp.numerador;

        simplificar();
    }
        

    public void simplificar() {
        int a = this.numerador;
        int b = this.denominador;
        int gcd = 1;

        while(a != 0) {
            gcd = a;
            a = b%a;
            b = gcd;
        }

        if(this.numerador == 0) denominador = 1;
        else {
            this.numerador /= gcd;
            this.denominador /= gcd;
        }
    }

    public String toString() {
        String ans = "";
        ans += "" + this.numerador;
        ans += "/";
        ans += "" + this.denominador;
        return ans;
    }
}
