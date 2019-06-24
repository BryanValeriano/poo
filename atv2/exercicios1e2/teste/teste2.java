package teste;

import pessoa.*;

public class teste2 {

    public static void main(String[] args) {
        Agenda agd = new Agenda();
        System.out.println("Adicionando 10 pessoas aleatorias");
        agd.adiciona(new Pessoa("abc1", "1", "0001"));
        agd.adiciona(new Pessoa("bbc2", "2", "0002"));
        agd.adiciona(new Pessoa("cbc3", "3", "0003"));
        agd.adiciona(new Pessoa("dbc4", "4", "0004"));
        agd.adiciona(new Pessoa("ebc5", "5", "0005"));
        agd.adiciona(new Pessoa("fbc6", "6", "0006"));
        agd.adiciona(new Pessoa("gbc7", "7", "0007"));
        agd.adiciona(new Pessoa("hbc8", "8", "0008"));
        agd.adiciona(new Pessoa("ibc9", "9", "0009"));
        agd.adiciona(new Pessoa("jbc10", "10", "00010"));

        agd.imprimeTudo();

        System.out.println();
        System.out.println("Adicionando todos de novo para testar repetido");

        agd.adiciona(new Pessoa("abc1", "1", "0001"));
        agd.adiciona(new Pessoa("bbc2", "2", "0002"));
        agd.adiciona(new Pessoa("cbc3", "3", "0003"));
        agd.adiciona(new Pessoa("dbc4", "4", "0004"));
        agd.adiciona(new Pessoa("ebc5", "5", "0005"));
        agd.adiciona(new Pessoa("fbc6", "6", "0006"));
        agd.adiciona(new Pessoa("gbc7", "7", "0007"));
        agd.adiciona(new Pessoa("hbc8", "8", "0008"));
        agd.adiciona(new Pessoa("ibc9", "9", "0009"));
        agd.adiciona(new Pessoa("jbc10", "10", "00010"));

        agd.imprimeTudo();


        System.out.println("Bucando email e telefone a partir da primeira letra");
        System.out.println(agd.buscaEmail("a"));
        System.out.println(agd.buscaTel("a"));
        System.out.println(agd.buscaEmail("b"));
        System.out.println(agd.buscaTel("b"));
        System.out.println(agd.buscaEmail("c"));
        System.out.println(agd.buscaTel("c"));
        System.out.println(agd.buscaEmail("d"));
        System.out.println(agd.buscaTel("d"));
        System.out.println(agd.buscaEmail("e"));
        System.out.println(agd.buscaTel("e"));
        System.out.println(agd.buscaEmail("e"));
        System.out.println(agd.buscaTel("e"));


        System.out.println("Vendo se exise e removendo jbc10");
        if(agd.estaCadastrada(new Pessoa("jbc10", "10", "00010")) != -1)
            agd.remove(new Pessoa("jbc10", "10", "00010"));
        agd.imprimeTudo();

        System.out.println("vendo posicao de ibc9");
        System.out.println(agd.estaCadastrada(new Pessoa("ibc9", "9", "0009")));

    }

}
