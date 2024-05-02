import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.Console;
import java.util.Scanner;

public class Menu {

    private double monto;
    private String  mOrigen;
    private String  mDestino;
    public int opcion = 0;

    Scanner sc = new Scanner(System.in);
    ConsultaApi consulta = new ConsultaApi();



    public String menu = """
            *************************************************
            Selecciona (Teclea) la opcion que se adecua a lo que requieres
            1.Peso Argentino a -> Peso Mexicano
            2.Peso Argentino a -> Dolar USA
            3.Real Brasileño a -> Peso Colombiano
            4.Peso Chileno a -> Peso Boliviano
            9. Salir del programa
            ***************************************************
            """;

    public void  menu(){
        System.out.println("Bienvenido al canversor de monedas");
        while (opcion != 9)
        {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa la cantidad a convertir");
                    monto = sc.nextDouble();
                    mOrigen = "ARS";
                    mDestino = "MXN";
                    Moneda moneda = consulta.consultaMoneda(mOrigen,mDestino,monto);
                    Modelos moneda1 = new Modelos(moneda);
                    System.out.println(moneda1);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a convertir");
                    monto = sc.nextDouble();
                    mOrigen = "ARS";
                    mDestino = "USD";
                    moneda = consulta.consultaMoneda(mOrigen,mDestino,monto);
                    moneda1 = new Modelos(moneda);
                    System.out.println(moneda1);
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad a convertir");
                    monto = sc.nextDouble();
                    mOrigen = "BRL";
                    mDestino = "COP";
                    moneda = consulta.consultaMoneda(mOrigen,mDestino,monto);
                    moneda1 = new Modelos(moneda);
                    System.out.println(moneda1);
                    break;
                case 4:
                    System.out.println("Ingresa la cantidad a convertir");
                    monto = sc.nextDouble();
                    mOrigen = "CLP";
                    mDestino = "COP";
                    moneda = consulta.consultaMoneda(mOrigen,mDestino,monto);
                    moneda1 = new Modelos(moneda);
                    System.out.println(moneda1);
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            if (opcion !=9) {// Pausa para que el usuario vea la respuesta
                waitForEnter();
            }

            // Limpiar la pantalla
            clearScreen();

        }
    }

    private void waitForEnter() {
        // Utilizando Scanner para esperar una entrada del usuario
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine(); // Esto consume la nueva línea después de la entrada numérica
        sc.nextLine(); // Esto espera la siguiente entrada (la del usuario)
    }

    private void clearScreen() {
        System.out.print("\u001b[2J\u001b[H");
        System.out.flush();
    }

}


/*
ARS - Peso argentino

BOB - Boliviano boliviano

BRL - Real brasileño

CLP - Peso chileno

COP - Peso colombiano

USD - Dólar estadounidense

MXN - PESO MEXICANO
 */