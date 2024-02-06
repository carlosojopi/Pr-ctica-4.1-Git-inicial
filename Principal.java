//paso 6

//paso 10

//paso 14
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        // Llama al método para mostrar la fecha y hora actual
        mostrarFechaYHoraActual();

        // Llama al método para crear el array de Usuarios
        Usuario[] usuarios = crearArrayUsuarios(3);

        // Muestra el contenido de cada Usuario en el array
        mostrarUsuarios(usuarios);
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

    public static Usuario[] crearArrayUsuarios(int numeroUsuarios) {
        
		Usuario[] usuarios = new Usuario[numeroUsuarios];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeroUsuarios; i++) {
            usuarios[i] = new Usuario();
            System.out.println("Ingrese información para el Usuario " + (i + 1) + ":");
            System.out.print("Ingrese el Nombre: ");
            usuarios[i].nombre = scanner.nextLine();
            System.out.print("Ingrese los Apellidos: ");
            usuarios[i].apellidos = scanner.nextLine();
            System.out.print("Ingrese su Email: ");
            usuarios[i].email = scanner.nextLine();
        }

        return usuarios;
    }

    // Método para mostrar el contenido de cada Usuario en el array
    public static void mostrarUsuarios(Usuario[] usuarios) {
        System.out.println("\nLa informacion de los usuarios es la siguiente:");

        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email + "\n");
        }
    }
}
