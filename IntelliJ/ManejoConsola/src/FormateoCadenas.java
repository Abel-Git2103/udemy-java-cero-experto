public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formateo con text block
        mensaje = """
                %nDetalle persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con text y printf directamente
        System.out.printf("""
                %nDetalle persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
