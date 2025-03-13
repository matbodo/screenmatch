package br.com.screenmatch.modelos;

import br.com.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualisacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualisacoes() {
        return totalVisualisacoes;
    }

    public void setTotalVisualisacoes(int totalVisualisacoes) {
        this.totalVisualisacoes = totalVisualisacoes;
    }

    @Override
    public int getClssificacao() {
        if (totalVisualisacoes > 1000) {
            return 4;
        }else {
            return 2;
        }
    }
}
