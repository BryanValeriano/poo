package loteria;

import aleatorio.*;

public class NumeroLoteria {
    public int a,b,c;

    public NumeroLoteria() {
        NumeroAleatorio x = new NumeroAleatorio();
        this.a = x.getAleatorio();
        this.b = x.getAleatorio();
        this.c = x.getAleatorio();
    }

    public NumeroLoteria(int[] numeros) {
        this.a = numeros[0];
        this.b = numeros[1];
        this.c = numeros[2];
    }

    public String toString() {
        String x = "";
        x += "" + a;
        x += "" + b;
        x += "" + c;
        return x;
    }

    public boolean ganhou(NumeroLoteria nLoteria) {
        return this.toString().equals(nLoteria.toString());
    }
}
