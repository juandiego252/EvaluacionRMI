import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry registro = LocateRegistry.getRegistry("localhost",1099);
            ConversorRemoto objetoRemoto = (ConversorRemoto) registro.lookup("ConversorRemoto");

            int opcion = 0;
            while (opcion != 3){
                System.out.println("*** Opciones *** ");
                System.out.println("1.Farenheit a Celsius");
                System.out.println("2.Celsius a Fahrenheit");
                System.out.println("3.Salir");
                System.out.print("Ingrese su opcion:");
                opcion = sc.nextInt();
                double resultado = 0;

                if (opcion == 1 ) {
                    System.out.println("Ingrese el valor de farenheit");
                    double valorFarenheit = sc.nextDouble();
                    resultado = objetoRemoto.farengheit(valorFarenheit);
                    System.out.println("El resultado es:" + resultado);
                }
                if (opcion == 2 ) {
                    System.out.println("Ingrese el valor de celsius");
                    double valorCelsius = sc.nextDouble();
                    resultado = objetoRemoto.celsius(valorCelsius);
                    System.out.println("El resultado es:" + resultado);
                }
                if (opcion == 3 ) {
                    System.out.println("Saliendo ...");
                }
            }

        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}
