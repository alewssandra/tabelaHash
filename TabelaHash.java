package aula.hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TabelaHash {

    private int m;
    private List tabela[];

    public TabelaHash(int totalClasses) {
        this.m = totalClasses;
        this.tabela = new LinkedList[this.m]; // criação do vetor/tabela que armazena uma lista ligada

        //pra cada uma das posições do vetor da
        //tabela estou criando uma lista
        for (int i = 0; i < this.m; i++) {
            this.tabela[i] = new LinkedList();
        }
    }

    public int funcaoHash(int chave) {
        return chave % this.m;
    }

    public void insereChave(int chave) {
        int classe = funcaoHash(chave);

        this.tabela[classe].add(chave);
    }

    public int pesquisa(int chave) {
        int posicao = -1;

        int classe = funcaoHash(chave);

        List listaValores = this.tabela[classe];
        for (int i = 0; i < listaValores.size(); i++) {
            int valor = (int) listaValores.get(i);
            if (valor == chave) {
                posicao = i;
                break;
            }
        }

        return posicao;
    }

    public void remove(int chave) {

        int classe = funcaoHash(chave);

        int pos = pesquisa(chave);

        if (pos != -1) {
            this.tabela[classe].remove(pos);
            System.out.println("Classe: " + classe + " valor removido: " + chave);
        } else {
            System.out.println("Classe: " + classe + " lista de valores: " + this.tabela[classe].toString());
        }

    }

    public void mostra() {

        for (int i = 0; i < this.m; i++) {
            System.out.println("Classe: " + i + " lista de valores: " + this.tabela[i].toString());
        }

    }

}
