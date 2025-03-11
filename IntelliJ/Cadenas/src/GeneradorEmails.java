public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        // Nombre completo del usuario
        var nombreCompleto = " Abel Jornet Molero ";
        System.out.println("Nombre usuario: " + nombreCompleto);

        // Normalizamos el nombre del usuario
        // Limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        // Convertimos a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);

        // Nombre de la empresa
        var nombreEmpresa = " T-Systems ";
        System.out.println("\nNombre empresa: " + nombreEmpresa);

        // Extension del dominio
        var extensionDominio = ".com";
        System.out.println("Extension del dominio = " + extensionDominio);

        // Quitamos los espacios en blanco y convertimos a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("Dominio de email normalizado: " + dominioEmailNormalizado);

        // Email generado a partir de los datos proporcionados
        var emailGenerado = new StringBuffer().append(nombreNormalizado).append(dominioEmailNormalizado).toString();
        System.out.println("\nEmail final generado: " + emailGenerado);
    }
}
