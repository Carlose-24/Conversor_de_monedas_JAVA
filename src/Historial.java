import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Historial {

    private static final String nombreDelHistorial = "Historial_de_Consultas_Realizadas.txt";

    public static void registrarConsulta(String divisaPrincipal, String divisaCambio, double cantidadConvertida, double resultado) {
        String timestamp = obtenerFechaYHora();

        //el texto que se guardara en el archivo
        String entradaHistorial = String.format("%s - Consulta: %s a %s - Cantidad: %.2f - Resultado: %.2f\n",
                timestamp, divisaPrincipal, divisaCambio, cantidadConvertida, resultado);
        escribirEnArchivo(entradaHistorial);
    }

    private static String obtenerFechaYHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    private static void escribirEnArchivo(String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreDelHistorial, true))){
            writer.write(texto);

        }catch(IOException e){
            System.out.println("Error al escribir en el archivo de historial: " + e.getMessage());
        }
    }
}
