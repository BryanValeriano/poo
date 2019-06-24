package lista;

public class ListaLigada {
    private class LinkedNode {
        int valor;
        LinkedNode next;
    }

    private LinkedNode first = null;

    public void adicionaItemNoFinal(int item) {

        LinkedNode novo = new LinkedNode();
        novo.valor = item;
        novo.next = null;

        if(first == null) {
            first = novo; 
            return;
        }

        LinkedNode atual = first;
        while(atual.next != null) atual = atual.next;
        atual.next = novo;
    }

    public void adicionaItemOrdenado(int item) {

        LinkedNode novo = new LinkedNode();
        novo.valor = item;
        novo.next = null;

        if(first == null) {
            first = novo; 
            return;
        } else if(first.valor >= item) {
            novo.next = first;
            first = novo;
            return;
        }

        LinkedNode atual = first;
        LinkedNode last = first;

         while(atual != null && atual.valor <= item) {
            last = atual;
            atual = atual.next;
        }
       
        last.next = novo;
        novo.next = atual;

    }

    public void  removeItem(int item) {
        LinkedNode atual = first;
        LinkedNode last = first;

        if(first == null) return;

        if(first.valor == item) {
            first = first.next;
            return;
        }

        while(atual != null) {
            if(atual.valor == item) {
                last.next = atual.next;
                return;
            }
            last = atual;
            atual = atual.next;
        }
    }

    public void imprimeListaLigada() {
        LinkedNode atual = first;
        while(atual != null) {
            System.out.println(atual.valor + " ");
            atual = atual.next;
        }
    }

    public boolean busca(int item) {
        LinkedNode atual = first;
        while(atual != null) {
            if(atual.valor == item) return true;
            atual = atual.next;
        }
        return false;
    }

    public void inverte() {
        LinkedNode atual = first;
        LinkedNode nxt = first;
        if(atual.next != null) nxt = atual.next;
        LinkedNode last = null;

        while(nxt != null) {
            atual.next = last;
            last = atual;
            atual = nxt;
            nxt = nxt.next;
        }

        first = atual;
    }
}
