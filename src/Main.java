import dao.ProductoDAO;
import modelo.Producto;

public class Main {
    public static void main(String[] args) {
        obtenerProductosElectronica();
    }

    public static void insertarProducto() {
        Producto p = new Producto("Gato", "Decoración", 25, 1);
        ProductoDAO pDAO = new ProductoDAO();
        pDAO.insertarProducto(p);
    }

    public static void actualizarProducto() {
        Producto p = new Producto("Gato", "Decoración", 35, 4);
        ProductoDAO pDAO = new ProductoDAO();
        pDAO.actualizarProducto(p, 11);
    }

    public static void eliminarProducto() {
        Producto p = new Producto("Gato", "Decoración", 35, 4);
        ProductoDAO pDAO = new ProductoDAO();
        pDAO.eliminarProducto(11);
    }

    public static void mostrarProducto() {
        ProductoDAO pDAO = new ProductoDAO();
        System.out.println(pDAO.obtenerProductos());
        //System.out.println(pDAO.obtenerProductos().size());
    }

    public static void obtenerSoloNombreYPrecio() {
        ProductoDAO pDAO = new ProductoDAO();
        System.out.println(pDAO.obtenerSoloNombreYPrecio());
    }

    public static void obtenerProductosElectronica() {
        ProductoDAO pDAO = new ProductoDAO();
        System.out.println(pDAO.obtenerProductosElectronica());
    }
}