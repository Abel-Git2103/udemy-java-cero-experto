import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID único ***");
        // Solicitamos los datos del usuario
        var entrada = new Scanner(System.in); // Inicializamos la entrada de texto por consola
        var aleatorio = new Random(); // Generamos un objeto random

        // Nombre del usuario
        System.out.print("Indica tu nombre: ");
        var nombreUsuario = entrada.nextLine();
        // Normalizamos el nombre para el valor del ID
        var nombreNormalizado = nombreUsuario.trim().substring(0,2).toUpperCase();

        // Apellido del usuario
        System.out.print("Indica tu apellido: ");
        var apellidoUsuario = entrada.nextLine();
        // Normalizamos el apellido para el valor del ID
        var apellidoNormalizado = apellidoUsuario.trim().substring(0,2).toUpperCase();

        // Año de nacimiento del usuario
        System.out.print("Indica el año de nacimiento (YYYY): ");
        var anioNacimiento = entrada.nextLine().trim().substring(2);

        // Obtenemos el número aleatorio (1 y 9999)
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;
        // Formateamos el número aleatorio a 4 dígitos
        var numeroAleatorioFormateado = String.format("%04d", numeroAleatorio);

        // Generamos el ID único
        var idUnico = nombreNormalizado + apellidoNormalizado + anioNacimiento + numeroAleatorioFormateado;

        // Imprimimos el ID generado
        System.out.printf("\nHola %s, su ID es el siguiente: %s%n", nombreUsuario, idUnico);
    }
}
