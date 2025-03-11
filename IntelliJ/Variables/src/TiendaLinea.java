public class TiendaLinea {
    public static void main(String[] args) {
        // Detalle del producto
        System.out.println("*** Tienda en Linea (Detalle Producto) ***");
        String nombreProducto = "Pala Bullpadel";
        double precioProducto = 237.0;
        int cantidadDisponible = 20;
        boolean disponibleVenta = true;

        // Imprimir el detalle del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        // Modificar los valores del producto
        nombreProducto = "Bullpadel Vertex 04";
        precioProducto = 210;
        cantidadDisponible = 0;
        disponibleVenta = false;

        System.out.println(); // Salto de linea en consola
        // Imprimir el detalle modificado
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);
    }
}
