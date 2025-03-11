import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");
        // Solicitamos los datos del empleado
        var entrada = new Scanner(System.in); // Inicializamos la entrada de texto por consola

        // Nombre del empleado
        System.out.print("Indica tu nombre completo: ");
        var nombreEmpleado = entrada.nextLine();

        // Edad del empleado
        System.out.print("Indica tu edad: ");
        var edadEmpleado = Integer.parseInt(entrada.nextLine());

        // Salario del empleado
        System.out.print("Indica tu salario: ");
        var salarioEmpleado = Double.parseDouble(entrada.nextLine());

        // Status actual
        System.out.print("¿Es jefe de departamento? (true/false): ");
        var esJefeDepartamento = Boolean.parseBoolean(entrada.nextLine());

        // Imprimimos los datos del empleado
        System.out.println("\nDatos del empleado:");
        System.out.println("\tNombre empleado: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\t¿Es jefe de departamento?: " + esJefeDepartamento);
    }
}
