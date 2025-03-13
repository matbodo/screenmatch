import br.com.screenmatch.calculo.FiltroRecomendacao;
import br.com.screenmatch.calculo.calcTempo;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.filme;
import br.com.screenmatch.modelos.Serie;


public class principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.setNome("Pulp Fiction");
        meuFilme.setAnoDeLancamento(1994);
        meuFilme.setDuracaoMinutos(154);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliacoes(8);
        meuFilme.avaliacoes(5);
        meuFilme.avaliacoes(7);

        filme outro = new filme();
        outro.setNome("Jhon Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoMinutos(101);
        outro.setIncluidoNoPlano(true);


        Serie Dexter = new Serie();
        Dexter.exibeFichaTecnica();
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

        System.out.println("Tempo total: " + calcula.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Dexter);
        episodio.setTotalVisualisacoes(300);
        filtro.filtra(episodio);
    }
}
