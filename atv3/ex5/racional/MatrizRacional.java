package racional;


public class MatrizRacional {
    NumeroRacional[][] m;    

    public MatrizRacional() {
        m = new NumeroRacional[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                m[i][j] = new NumeroRacional();
    }

    public MatrizRacional(int n, int k) {
        m = new NumeroRacional[n][k];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < k; j++)
                m[i][j] = new NumeroRacional(0,1);
    }

    public void soma(MatrizRacional x) {
        if(this.m.length != x.m.length || this.m[0].length != x.m[0].length) {
            System.out.println("Tamanho invalido");
            return;
        }

        for(int i = 0; i < x.m.length; i++)
            for(int j = 0; j < x.m[i].length; j++)
                this.m[i][j].soma(x.m[i][j]);
    }

    public void imprime() {
        for(int i = 0; i < this.m.length; i++) {
            for(int j = 0; j < this.m[i].length; j++)
                System.out.print(this.m[i][j] + " ");
            System.out.println();
        }
    }
}
