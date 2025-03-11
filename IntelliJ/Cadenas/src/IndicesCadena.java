public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";



        // Recuperar el primer caracter
        char primerCaracter = cadena1.charAt(0); // Recuperar el caracter de 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9); // Recuperar el caracter 'o'
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Imprimir la letra 'M', indice 5
        var letraM = cadena1.charAt(5); // Recuperar la letra 'M'
        System.out.println("letraM = " + letraM);

    }
}
