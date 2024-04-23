import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        ConsultaApi consulta = new ConsultaApi();
        Moneda moneda = consulta.consultaMoneda("azn");
        System.out.println(moneda);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingresa la moneda");
//        var moneda = sc.nextLine();







 //       System.out.println(response.body());

    }
}
