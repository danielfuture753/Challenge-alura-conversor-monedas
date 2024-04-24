import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();

        System.out.println("Ingresa la moneda de origen");
        var oOrigen = lectura.nextLine();
        System.out.println("Ingresa la moneda de destino");
        var mDestino = lectura.nextLine();
        System.out.println("ingresa el monto a convertir");
        var monto = lectura.nextDouble();
        Moneda moneda = consulta.consultaMoneda(oOrigen, mDestino, monto);
        System.out.println(moneda);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingresa la moneda");
//        var moneda = sc.nextLine();







        //       System.out.println(response.body());

    }
}
