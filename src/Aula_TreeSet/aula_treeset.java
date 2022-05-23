package Aula_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class aula_treeset {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>(); //ordem definida pelo algoritmo do treeset

        //Monta árvore
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorno primeira capital topo árvore
        System.out.println(treeCapitais.first());

        //Retorno da última capital final da árvore
        System.out.println(treeCapitais.last());

        //retorno a primeira capital abaixo na árvore parametizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima da árvore parametizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exiba todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capitl no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String capital: treeCapitais) {
            System.out.println(capital);
        }
    }
}
