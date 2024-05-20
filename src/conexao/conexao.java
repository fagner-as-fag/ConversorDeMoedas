package conexao;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class conexao {




    public  String Conectar(){
        var url = "https://v6.exchangerate-api.com/v6/4a2745f05a8ad45842e2458f/latest/USD";

        try {
            HttpClient buscador = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = buscador.send(request, HttpResponse.BodyHandlers.ofString());
          return response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }




}
