package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Pulp Fiction", 1994);
        meuFilme.avaliacoes(10);
        Filme outro = new Filme("Jhon Wick", 2014);
        outro.avaliacoes(7);
        var filmeMatheus = new Filme("War Dogs", 2016);
        filmeMatheus.avaliacoes(8);

        Serie Dexter = new Serie("Dexter", 2007);

        ArrayList<titulo> lista = new ArrayList<>();
        lista.add(filmeMatheus);
        lista.add(meuFilme);
        lista.add(outro);
        lista.add(Dexter);

        for (titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClssificacao() > 2){
                System.out.println("Classificacao " + filme.getClssificacao());
            }

        }
    }
}
