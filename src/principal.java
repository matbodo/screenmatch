import br.com.screenmatch.modelos.filme;

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

        System.out.println("Média de avaliações do filme: " +meuFilme.pegaMedia());

    }
}
