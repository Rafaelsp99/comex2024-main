package br.com.alura.comex.testes;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class testeApiDinamica{
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String  busca = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um numerpoo de 1 a 9 para consultar produto: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

        String endereco = "https://fakestoreapi.com/products/" + busca.replace(" ","+") ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        System.out.println("endereco");

        FileWriter escrita = new FileWriter("produto.json");
            escrita.write(gson.toJson(endereco));
            escrita.close();

    }

}

}