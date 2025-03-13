package br.com.screenmatch.calculo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClssificacao() >= 4){
            System.out.println("Entre os preferidos");
        } else if(classificavel.getClssificacao() >= 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Assista depois");
        }
    }
}
