package caixa;

public class CaixaAtendimento {
    int identificador;
    int senha;
    static int ultimo = 1; 

    public CaixaAtendimento(int identificador) {
        this.identificador = identificador;
    }

    public void chamaProximoFila() { 
        System.out.println("proxima senha " + ultimo + "\ncaixa " + this.identificador);
        this.senha = ultimo++;
    }
}

