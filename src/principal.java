import br.com.screenmatch.calculo.calcTempo;
import br.com.screenmatch.modelos.filme;
import br.com.screenmatch.modelos.serie;


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


        serie minhaSerie = new serie();
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setNome("Dexter");
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setAnoDeLancamento(2007);
        minhaSerie.setIncluidoNoPlano(true);


        calcTempo calcula = new calcTempo();
        calcula.inclui(meuFilme);
        calcula.inclui(outro);
        calcula.inclui(minhaSerie);

        System.out.println("Tempo total: " + calcula.getTempoTotal());
    }
}
