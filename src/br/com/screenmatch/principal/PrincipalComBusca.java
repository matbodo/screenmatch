package br.com.screenmatch.principal;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para a busca: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String tituloCodificado = URLEncoder.encode(busca, StandardCharsets.UTF_8);
            String endereco = "http://www.omdbapi.com/?t=" + tituloCodificado.replace(" ", "+") + "&apikey=1ed12d1f";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
                System.out.println(meuTituloOMDB);


                Titulo meuTitulo = new Titulo(meuTituloOMDB);
                System.out.println("Titulo ja convertido: ");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na busca: ");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMensagem());
            }
        }

        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Finalizado com sucesso");
    }
}
