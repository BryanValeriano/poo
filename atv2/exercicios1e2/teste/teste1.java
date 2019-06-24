package teste;

import pessoa.*;

public class teste1 {

    public static void main(String[] args) {
        Pessoa ps1 = new Pessoa("abc", "10101", "abc@abc.com");
        Pessoa ps2 = new Pessoa("xyz", "110011", "xyz@abc.com");
        Pessoa ps3 = new Pessoa("hjkl", "110000", "hjkl@abc.com");

        ps1.imprimeDados();
        System.out.println("alterando Email e Telefone");
        ps1.alteraEmailTelefone("abc@hotmail", "9090");
        ps1.imprimeDados();
        System.out.println();

        ps2.imprimeDados();
        System.out.println("alterando Email e Telefone");
        ps2.alteraEmailTelefone("xyz@hotmail", "8080");
        ps2.imprimeDados();
        System.out.println();

        ps3.imprimeDados();
        System.out.println("alterando Email e Telefone");
        ps3.alteraEmailTelefone("hjkl@hotmail", "7070");
        ps3.imprimeDados();
        System.out.println();

        System.out.println("testando atributos vazios");
        ps1.alteraEmailTelefone("", "");
        ps2.alteraEmailTelefone("", "");
        ps3.alteraEmailTelefone("", "");
        ps1.imprimeDados();
        ps2.imprimeDados();
        ps3.imprimeDados();

    }
}
