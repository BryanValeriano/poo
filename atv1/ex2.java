public class ex2 {
    public static void main(String[] args) {
        int[] v;
        int[] qtd;
        v = new int[20];
        qtd = new int[11];

        double media = 0;
        int moda = 0;
        int freq = 0;

        for(int i = 0; i < 20; i++) {
            v[i] = ((int)(Math.random()*10) % 10) + 1;
            System.out.println(v[i]);
            media += (double)v[i]/20;
            qtd[v[i]]++;

            if(qtd[v[i]] > freq) {
                freq = qtd[v[i]];
                moda = v[i];
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Moda: " + moda);
        
    }
}


