package br.com.screenmatch.calculo;
import br.com.screenmatch.modelos.titulo;

public class calcTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(titulo t){
        this.tempoTotal += t.getDuracaoMinutos();
    }
}
