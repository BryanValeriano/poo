package teste;

import carro.*;
import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Carro c1 = new Carro("cavalo", "capim", 100, 1);  
        Carro c2 = new Carro("avestruz", "pedra", 50, 3);  
        Carro c3 = new Carro("camelo", "plantas espinhosas", 1000, 0.1);  

        c1.abastece(10);
        c2.abastece(10);
        c3.abastece(10);
        c1.simula(10);
        c2.simula(10);
        c3.simula(10);

        System.out.println("Digite uma distância para ver qual o carro mais econômico");
        double x = in.nextDouble();

        double c3teste = c3.necessarioParaKm(x);;
        double c2teste = c2.necessarioParaKm(x);;
        double c1teste = c1.necessarioParaKm(x);;

        if(c1teste <= c2teste && c1teste <= c3teste) {
            System.out.println(c1.getModelo());
            System.out.println(c1.getTipoCombustivel());
            System.out.println(c1.getQuantidadeCombustivelNoTanque());
            System.out.println(c1.getConsumoKmL());
            if(c1.simula(x) == 1) System.out.println("tem combustivel suficiente");
            else System.out.println("precisa abastecer");
        } else if(c2teste <= c3teste && c2teste <= c1teste) {
            System.out.println(c2.getModelo());
            System.out.println(c2.getTipoCombustivel());
            System.out.println(c2.getQuantidadeCombustivelNoTanque());
            System.out.println(c2.getConsumoKmL());
            if(c2.simula(x) == 1) System.out.println("tem combustivel suficiente");
            else System.out.println("precisa abastecer");
        } else {
            System.out.println(c3.getModelo());
            System.out.println(c3.getTipoCombustivel());
            System.out.println(c3.getQuantidadeCombustivelNoTanque());
            System.out.println(c3.getConsumoKmL());
            if(c3.simula(x) == 1) System.out.println("tem combustivel suficiente");
        }
    }
}
