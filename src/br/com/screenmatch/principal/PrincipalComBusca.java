package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para a busca: ");
        var busca = leitura.nextLine();

        String tituloCodificado = URLEncoder.encode(busca, "UTF-8");
        String endereco = "http://www.omdbapi.com/?t=" + tituloCodificado + "&apikey=1ed12d1f";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();;
            TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
            System.out.println(meuTituloOMDB);


            Titulo meuTitulo = new Titulo(meuTituloOMDB);
            System.out.println("Titulo ja convertido: ");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("Erro: ");
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizado com sucesso");
    }
}
