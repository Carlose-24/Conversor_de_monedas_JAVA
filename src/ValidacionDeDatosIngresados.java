import java.util.Scanner;

public class ValidacionDeDatosIngresados {
    //metodo reutilizable para verificar si el usuario ingresa bien las siglas de las divisas

    public static String validarSiglasDivisas(Scanner scanner) {
        String input;
        while (true) {
            input = scanner.nextLine().toUpperCase();
            if (input.matches("[a-zA-z]{3}")) {
                break;
            }else{
                System.out.println("ERROR: la sigla debe contener solo 3 letras. Intentalo de nuevo.(Ej:COP)");
            }
        }
        return input;
    }
    public static double validarCantidad(Scanner scanner) {
        while (true) {
            String entrada = scanner.nextLine();
            try {
                double cantidad = Double.parseDouble(entrada); // Intenta convertir a número
                if (cantidad > 0) {
                    return cantidad; // Si es un número válido y mayor que 0, lo retorna
                } else {
                    System.out.println("Por favor ingrese un número mayor que cero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un Valor númerico.");
            }
        }
    }
}



