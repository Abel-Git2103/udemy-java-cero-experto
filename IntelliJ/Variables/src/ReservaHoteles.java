public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");
        // Definimos las variables
        var nombreCliente = "Miguel Flores";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistaAlMar = true;

        // Mostrar el detalle de la reserva
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        // Modificar el detalle de la reserva
        diasEstancia = 5;
        tarifaDiaria = 900.00;
        tieneVistaAlMar = false;

        System.out.println(); // Linea en blanco
        System.out.println("Nuevos datos de la reserva:");
        // Imprimir la reserva modificada
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}
