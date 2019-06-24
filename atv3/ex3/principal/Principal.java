package principal;

import loteria.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        boolean x = false;;
        int[] v = new int[3];

        System.out.println("Digite a quantidade de sorteios e 3 numeros");
        n = in.nextInt();
        for(int i = 0; i < 3; i++) v[i] = in.nextInt();

        NumeroLoteria ans = new NumeroLoteria(v);

        for(int i = 0; i < n; i++) {
            NumeroLoteria tmp = new NumeroLoteria();
            System.out.println(tmp.a + " " + tmp.b + " " + tmp.c);
            if(ans.ganhou(tmp)) x |= true;
        }

        System.out.println((x? "ganhou" : "nao ganhou"));
    }
}
