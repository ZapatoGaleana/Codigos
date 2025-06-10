import Model.Producto;
import Model.Inventario;

public class App 
{
    public static void main(String[] args) 
    {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto();
        p1.setCodigo("001");
        p1.setNombre("Lapicero");
        p1.setCantidad(10);

        Producto p2 = new Producto();
        p2.setCodigo("002");
        p2.setNombre("Cuaderno");
        p2.setCantidad(5);

        Producto p3 = new Producto();
        p3.setCodigo("003");
        p3.setNombre("Borrador");
        p3.setCantidad(7);

        Producto p4 = new Producto();
        p4.setCodigo("004");
        p4.setNombre("Regla");
        p4.setCantidad(3);

        System.out.println(inventario.agregarProducto(p1)); // true
        System.out.println(inventario.agregarProducto(p2)); // true
        System.out.println(inventario.agregarProducto(p3)); // true
        System.out.println(inventario.agregarProducto(p4)); // false, inventario lleno

        System.out.println("Total items: " + inventario.totalItems()); // 22

        Producto buscado = inventario.buscar("002");
        System.out.println("Buscado: " + (buscado != null ? buscado.getNombre() : "No encontrado"));

        buscado = inventario.buscar("005");
        System.out.println("Buscado: " + (buscado != null ? buscado.getNombre() : "No encontrado"));

        System.out.println("Eliminar 002: " + inventario.eliminarProducto("002"));
        System.out.println("Total items: " + inventario.totalItems()); // ahora 17

        System.out.println("Agregar p4 despues de eliminar: " + inventario.agregarProducto(p4));
        System.out.println("Total items: " + inventario.totalItems()); // ahora 20
    }
}
