//paso 6

//paso 10
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        // Llama al método para mostrar la fecha y hora actual
        mostrarFechaYHoraActual();
    }

    // Método para mostrar la fecha y hora actual
    public static void mostrarFechaYHoraActual() {
        // Obtiene la fecha y hora actual
        LocalDateTime fechaYHoraActual = LocalDateTime.now();

        // Define el formato de la fecha y hora
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Formatea la fecha y hora actual según el formato definido
        String fechaYHoraFormateada = fechaYHoraActual.format(formato);

        // Muestra la fecha y hora actual
        System.out.println("Fecha y hora actual: " + fechaYHoraFormateada);
    }
}
