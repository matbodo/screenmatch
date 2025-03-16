package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Pulp Fiction", 1994);
        meuFilme.avaliacoes(10);
        Filme outro = new Filme("Jhon Wick", 2014);
        outro.avaliacoes(7);
        var filmeMatheus = new Filme("War Dogs", 2016);
        filmeMatheus.avaliacoes(8);

        Serie Dexter = new Serie("Dexter", 2007);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeMatheus);
        lista.add(meuFilme);
        lista.add(outro);
        lista.add(Dexter);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClssificacao() > 2){
                System.out.println("Classificacao " + filme.getClssificacao());
            }
        }

        List<String> buscaArtistas = new LinkedList<>();
        buscaArtistas.add("Adam Sandler");
        buscaArtistas.add("Cristhian Bale");
        buscaArtistas.add("Brad Pitt");
        Collections.sort(buscaArtistas);
        System.out.println(buscaArtistas);

        System.out.println("Lista por ordem alfabetica");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordem por ano");
        System.out.println(lista);
    }
}
