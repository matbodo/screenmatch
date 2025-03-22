package br.com.screenmatch.modelos;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();
        if (meuTituloOMDB.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Erro na conversao com mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0,2));
    }

    public  int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliacoes(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    public String toString(){
        return "(Nome: " + nome +
                ", ano de lancamento: " + anoDeLancamento + ", " +
                "duração = " + duracaoMinutos + "min)";
    }
}
