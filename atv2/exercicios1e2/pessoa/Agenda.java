package pessoa;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void adiciona(Pessoa tmp) {
        for(Pessoa at : pessoas) 
            if(at.equals(tmp)) return;
        pessoas.add(tmp);
    }

    public void remove(Pessoa tmp) { 
        for(Pessoa at : pessoas) 
            if(at.equals(tmp)) {
                pessoas.remove(at);
                return;
            }
    }

    public int estaCadastrada(Pessoa tmp) {
        int pos = 0;
        for(Pessoa at : pessoas) { 
            if(at.equals(tmp)) return pos;
            pos++;
        }
        return -1;
    }

    public boolean quaseIgual(String a, String b) {
        if(a.length() > b.length()) return false;
        for(int i = 0; i < a.length(); i++) 
            if(a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public String buscaTel(String nome) {
        for(Pessoa tmp : pessoas) 
            if(quaseIgual(nome, tmp.nome)) return tmp.telefone;
        return "Não encontrado";
    }

    public String buscaEmail(String nome) {
        for(Pessoa tmp : pessoas) 
            if(quaseIgual(nome, tmp.nome)) return tmp.email;
        return "Não encontrado";
    }

    public void imprimeDadosAgenda(Pessoa tmp) {
        tmp.imprimeDados();
    }

    public void imprimeTudo() {
        for(Pessoa tmp : pessoas) tmp.imprimeDados();
    }
            
}
    
