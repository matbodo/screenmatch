package br.com.screenmatch.calculo;
import br.com.screenmatch.modelos.Titulo;

public class calcTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoMinutos();
    }
}
