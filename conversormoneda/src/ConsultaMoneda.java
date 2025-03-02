import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaMoneda (String moneda, String nuevaMoneda) throws IOException, InterruptedException {
        String yourApiKey= System.getenv("API_KEY");
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"
                +yourApiKey+"/pair/"
                +moneda+"/"
                +nuevaMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }

    }

}
