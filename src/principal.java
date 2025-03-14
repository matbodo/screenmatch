import br.com.screenmatch.calculo.FiltroRecomendacao;
import br.com.screenmatch.calculo.calcTempo;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.setNome("Pulp Fiction");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setDuracaoMinutos(154);
        meuFilme.setIncluidoNoPlano(true);

        filme outro = new filme();
        outro.setNome("Jhon Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoMinutos(101);
        outro.setIncluidoNoPlano(true);

        var filmeMatheus = new filme();
        filmeMatheus.setNome("War Dogs");
        filmeMatheus.setDuracaoMinutos(200);
        filmeMatheus.setAnoDeLancamento(2016);
        filmeMatheus.setIncluidoNoPlano(true);

        ArrayList<filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeMatheus);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outro);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.getFirst().getNome());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());


        Serie Dexter = new Serie();
        Dexter.setNome("Dexter");
        Dexter.setTemporadas(8);
        Dexter.setEpisodiosPorTemporada(12);
        Dexter.setMinutosPorEpisodio(50);
        Dexter.setAnoDeLancamento(2007);
        Dexter.setIncluidoNoPlano(true);

        calcTempo calcula = new calcTempo();
        calcula.inclui(meuFilme);
        calcula.inclui(outro);
        calcula.inclui(Dexter);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Dexter);
        episodio.setTotalVisualisacoes(300);
        filtro.filtra(episodio);
    }
}
