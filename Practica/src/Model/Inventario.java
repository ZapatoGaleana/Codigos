package Model;

public class Inventario {
    Producto p1;
    Producto p2;
    Producto p3;

    public boolean agregarProducto(Producto p) {
        if (p1 == null) {
            p1 = p;
            return true;
        } else if (p2 == null) {
            p2 = p;
            return true;
        } else if (p3 == null) {
            p3 = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarProducto(String codigo) {
        if (p1 != null && p1.getCodigo() == codigo) {
            p1 = null;
            return true;
        } else if (p2 != null && p2.getCodigo() == codigo) {
            p2 = null;
            return true;
        } else if (p3 != null && p3.getCodigo() == codigo) {
            p3 = null;
            return true;
        }
        return false;
    }

    public Producto buscar(String codigo) {
        if (p1 != null && p1.getCodigo() == codigo) {
            return p1;
        } else if (p2 != null && p2.getCodigo() == codigo) {
            return p2;
        } else if (p3 != null && p3.getCodigo() == codigo) {
            return p3;
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        if (p1 != null) {
            total = total + p1.getCantidad();
        }
        if (p2 != null) {
            total = total + p2.getCantidad();
        }
        if (p3 != null) {
            total = total + p3.getCantidad();
        }
        return total;
    }
}

