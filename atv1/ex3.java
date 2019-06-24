import java.util.Scanner;

public class ex3 {
        
    static void popula(int[][] x) {

        for(int i = 0; i < x.length; i++)
            for(int j = 0; j < x[i].length; j++)
                x[i][j] = (int)(Math.random() * 10)%11;

    }

    static void mult(int[][] a, int[][]b, int[][]c) {
        
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < b[0].length; j++)
                for(int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k]*b[k][j];
    }

    static void print(int[][] x) {

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int n,m,u,v;
        System.out.println("Informe as dimensões da primeira matriz");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        System.out.println("Informe as dimensões da segunda matriz");
        u = in.nextInt();
        v = in.nextInt();

        if(m != u) {
            System.out.println("Impossível fazer a multiplicação");
        } else {
            int[][] a;
            int[][] b;
            int[][] c;

            a = new int[n][m];
            b = new int[u][v];
            c = new int[n][v];

            popula(a);
            popula(b);
            mult(a,b,c);

            print(a);
            print(b);
            print(c);
        }
    }
}
        
