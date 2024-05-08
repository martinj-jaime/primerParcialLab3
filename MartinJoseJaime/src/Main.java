import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Escritorio("Escritorio Gamer RGB", 15.22d, 15, 15d, 15d));
        listaProductos.add(new Silla("Silla Soft", 26d, 6, true));
        listaProductos.add(new Impresora("Impresora de oficina", 95d, 2, "Genius", 18));
        listaProductos.add(new Notebook("Notebook gama media", 160d, 25, "Noga", 144d));
        listaProductos.add(new Escritorio("Escritorio mediano", 10d, 8, 80d, 15d));
        
        /* Inciso 3 */
        System.out.println("Lista de productos: ");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }

        /* Inciso 4 */
        System.out.println("\nProductos con posible descuentos:");
        for (Producto producto : listaProductos) {
            if (producto instanceof EnOferta) {
                System.out.println(producto);
                Double precioConDescuento = ((EnOferta) producto).obtenerPrecioConDescuento(15d);
                System.out.printf("Si al cliente se le aplica un descuento del 15 porciento, el precio final sera de: %.2f \n", precioConDescuento);
            }
        }

        /* Inciso 5 */
        System.out.println("\nProductos antes y despues de aumentos:");
        for (Producto producto : listaProductos) {
            System.out.printf("Producto: (%s)\n", producto.getClass().getSimpleName());
            System.out.printf("Precio Antes del aumento: %.2f \n", producto.getPrecio());
            Double aumento = obtenerAumento(producto);
            Producto.aumentarPrecio(producto, aumento);
            System.out.printf("Precio despues del aumento del %.2f prociento: %.2f \n", aumento, producto.getPrecio());
        }
    }

    private static Double obtenerAumento(Producto producto) {
        Double aumento = 1d;
        if (producto instanceof Silla) {
            aumento = 5d;
        }
        if (producto instanceof Escritorio) {
            aumento = 10d;
        }
        if (producto instanceof Impresora) {
            aumento = 15d;
        }
        if (producto instanceof Notebook) {
            aumento = 20d;
        }
        return aumento;
    }


}