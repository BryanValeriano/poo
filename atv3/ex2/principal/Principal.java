package principal;

import caixa.*;
import java.lang.Math.*;

public class Principal {
    public static void main(String[] args) {
        CaixaAtendimento[] c = new CaixaAtendimento[5];
    
        for(int i = 0; i < 5; i++) 
            c[i] = new CaixaAtendimento(i+1);
        

        for(int i = 0; i < 10; i++) 
            c[(int)(Math.random()*10) % 5].chamaProximoFila();

    }
}
