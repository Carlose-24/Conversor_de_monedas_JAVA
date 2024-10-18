import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {



    public boolean validarDivisa(String divisa) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/13f9eff405472a92776892ce/latest/" + divisa);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.statusCode() == 200; //si el estado es 200 la divisa es correcta

        } catch (Exception e) {
            return false;
        }
    }

    public Divisa buscaDivisa(String divisaSolicitada, String divisaParaCambio, double cantidadAConvertir) {


        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/13f9eff405472a92776892ce/pair/"+
                divisaSolicitada+"/"+divisaParaCambio+"/"+cantidadAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        }catch (Exception e) {
            throw new RuntimeException("No se encontró esa divisa. Intente de nuevo.. ");
        }
    }
}
