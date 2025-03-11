import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");
        // Solicitamos los datos de la receta de cocina
        var entrada = new Scanner(System.in); // Inicializamos la entrada de texto por consola

        // Nombre de la receta
        System.out.print("Indica el nombre de la receta: ");
        var nombreReceta = entrada.nextLine();

        // Ingredientes principales
        System.out.print("Indica los ingredientes principales: ");
        var ingredientesPrincipales = entrada.nextLine();

        // Tiempo de preparación
        System.out.print("Indica el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(entrada.nextLine());

        // Dificultad de la receta
        System.out.print("Indica la dificultad (Fácil, Media o Alta): ");
        var dificultadReceta = entrada.nextLine();

        // Imprimimos la receta
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre de la receta: " + nombreReceta);
        System.out.println("\tIngredientes principales: " + ingredientesPrincipales);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad de la receta: " + dificultadReceta);
    }
}
