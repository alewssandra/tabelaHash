package aula.hash;

public class Executa {

    public static void main(String args[]) {
        int m = 5;

        TabelaHash tabela = new TabelaHash(m);

        tabela.insereChave(10);
        tabela.insereChave(1);
        tabela.insereChave(4);
        tabela.insereChave(3);
        tabela.insereChave(15);
        tabela.insereChave(20);

        tabela.mostra();

        int valor = 20;
        System.out.println(valor + " está na classe: " + tabela.funcaoHash(20) + " posição: " + tabela.pesquisa(valor));

        System.out.println();
        tabela.remove(3);
        tabela.mostra();

        System.out.println();
        tabela.remove(15);
        tabela.mostra();

    }

}
