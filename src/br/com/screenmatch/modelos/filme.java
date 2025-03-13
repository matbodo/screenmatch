package br.com.screenmatch.modelos;

import br.com.screenmatch.calculo.Classificavel;

public class filme extends titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClssificacao() {
        return (int) pegaMedia() / 2;
    }
}