import java.util.Scanner;

public class ex4 {

    public static void popula(int[] v) {
        for(int i = 0; i < v.length; i++) v[i] = (int)(Math.random() * 10);
    }

    public static void print(int[] v) {
        for(int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
        System.out.println();
    }

    public static boolean insere(int[] v, int pos, int val) {

        for(int i = pos; i < v.length; i++) {
            if(v[i] == 0) {
                for(int j = i; j > pos; j--) v[j] = v[j-1];
                v[pos] = val;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        int[] v;
        int pos,val;
        v = new int[10];
        popula(v);
        print(v);

        System.out.println("Digite a posição e o valor");
        pos = in.nextInt();
        val = in.nextInt();

        if(insere(v,pos,val)) print(v);
        else System.out.println("Impossível");
    }
}




        
