import java.util.Scanner;

public class Principal {
    private static Scanner datosIngresadosPorElUsuario = new Scanner(System.in);
    private static ConsultaDivisa consulta = new ConsultaDivisa();
    private static String divisaSolicitada;

    public static void main(String[] args) {
        mostrarBienvenida();
        pedirDivisaPrincipal();
        menuPrincipal();
        datosIngresadosPorElUsuario.close(); // cerrar el scanner
    }

    private static void mostrarBienvenida() {
        // instrucciones de bienvenida
        System.out.println("****************************************");
        System.out.println("   Bienvenid@ al conversor de Monedas");
        System.out.println("****************************************\n");
        System.out.println("Acá podrá convertir cualquier tipo de moneda y saber su precio actual, " +
                "frente a su moneda principal.\nA continuación le daré unos ejemplos de siglas de las divisas " +
                "para que pueda elegir su divisa:  \n" +
                "USD = Dolar estadounidense\n" +
                "EUR = Euro\n" +
                "GBP = Libra británica\n" +
                "COP = Peso colombiano\n" +
                "BRL = Real brasileño\n" +
                "Si no sabe la sigla de su moneda principal o la sigla de la moneda a la que le desea realizar " +
                "la conversión,\ndiríjase a la siguiente página donde encontrará todas las siglas del mundo: \n" +
                "https://www.easymarkets.com/int/es/learn-centre/discover-trading/currency-acronyms-and-abbreviations/\n");

    }

    private static boolean pedirDivisaPrincipal() {
        while (true) {
            System.out.println("Escriba la sigla de su divisa principal(Ej:USD): ");
            divisaSolicitada = ValidacionDeDatosIngresados.validarSiglasDivisas(datosIngresadosPorElUsuario);
            //esto va hacer que verifique la exception y se pueda continuar con el programa si hay un error,
            try {
                boolean esValida = consulta.validarDivisa(divisaSolicitada);
                if (esValida) {
                    break;
                } else {
                    System.out.println("La divisa Principal " + divisaSolicitada + " NO es valida.");
                }
            } catch (Exception e) {
                System.out.println("Error al validar la divisa. Inténtalo de nuevo.");
            }
        }

        return false;
    }

    private static void menuPrincipal() {
        while (true) {
            mostrarMenu();
            int opcionElegida = Integer.parseInt(datosIngresadosPorElUsuario.nextLine());
            switch (opcionElegida) {
                case 1:
                    verTipoDeCambio();
                    break;
                case 2:
                    convertirCantidad();
                    break;
                case 3:
                    cambiarDivisaPrincipal();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del método
                default:
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!! Opción no válida. Por favor, elija una opción del menú. !!");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("=========================");
        System.out.println("MENU CONVERSOR DE MONEDAS");
        System.out.println("=========================");
        System.out.println("1. Ver el tipo de cambio actual.");
        System.out.println("2. Convertir una cantidad especifica.");
        System.out.println("3. Cambiar mi moneda principal.");
        System.out.println("4. Salir del programa.");
        System.out.print("Ingresa el número de la opción que deseas realizar: ");
    }

    private static void verTipoDeCambio() {
        while (true) {
            System.out.println("\nEscriba la sigla de la moneda a la cual desea realizar la conversión(Ej:COP): ");
            String divisaParaCambio = ValidacionDeDatosIngresados.validarSiglasDivisas(datosIngresadosPorElUsuario);
            Divisa divisa = consulta.buscaDivisa(divisaSolicitada, divisaParaCambio, 1);
            try {
                boolean esValida = consulta.validarDivisa(divisaParaCambio);
                if (esValida) {
                    System.out.println("________________________________________________");
                    System.out.printf("El valor de %s en %s es igual a: $%.2f %s\n",
                            divisaSolicitada, divisaParaCambio, divisa.conversion_rate(), divisaParaCambio);
                    System.out.println("________________________________________________");
                     Historial.registrarConsulta(divisaSolicitada, divisaParaCambio, 1, divisa.conversion_result());

                    break;
                } else {
                    System.out.println("La divisa " + divisaParaCambio + " para conversion, NO es valida.");
                }
            } catch (Exception e) {
                System.out.println("Error al validar la divisa. Inténtalo de nuevo.");
            }
        }


    }

    private static void convertirCantidad() {
        System.out.println("\nEscriba la sigla de la moneda a la cual desea realizar la conversión: ");
        String divisaParaCambio = ValidacionDeDatosIngresados.validarSiglasDivisas(datosIngresadosPorElUsuario);
        System.out.println("Escriba la cantidad de " + divisaSolicitada + " a la cual desea realizar la conversión: ");
        double cantidadAConvertirSolicitada = ValidacionDeDatosIngresados.validarCantidad(datosIngresadosPorElUsuario);
        Divisa divisa = consulta.buscaDivisa(divisaSolicitada, divisaParaCambio, cantidadAConvertirSolicitada);
        System.out.println("_____________________________________________");
        System.out.printf("El valor de $%.2f %s en %s es igual a: $%.2f %s\n",
                cantidadAConvertirSolicitada, divisaSolicitada, divisaParaCambio, divisa.conversion_result(), divisaParaCambio);
        System.out.println("_____________________________________________");
        Historial.registrarConsulta(divisaSolicitada, divisaParaCambio, cantidadAConvertirSolicitada, divisa.conversion_result());
    }

    private static void cambiarDivisaPrincipal() {
        System.out.println("\nEscriba la sigla de la nueva divisa principal: ");
        divisaSolicitada = ValidacionDeDatosIngresados.validarSiglasDivisas(datosIngresadosPorElUsuario);
    }
}