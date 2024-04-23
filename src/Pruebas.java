import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pruebas {
    public static void main(String[] args) {

        String moneda = "usd";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/64455ecc2f98daade9b85ee8/pair/usd/mxn/100");
// para conversion de valor https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT
// link de pura consulta         https://v6.exchangerate-api.com/v6/64455ecc2f98daade9b85ee8/latest/"+moneda
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        //return new Gson().fromJson(response.body(), Moneda.class);

    }
}
