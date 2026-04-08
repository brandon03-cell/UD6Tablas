import dao.productoDAO;
import modelo.producto;

public class Main {
    public static void main(String[] args) {
        eliminarProducto();
    }

    public static void insertarProducto() {
        producto p = new producto("Gato", "Decoración", 25, 1);
        productoDAO pDAO = new productoDAO();
        pDAO.insertarProducto(p);
    }

    public static void actualizarProducto() {
        producto p = new producto("Gato", "Decoración", 35, 4);
        productoDAO pDAO = new productoDAO();
        pDAO.actualizarProducto(p, 11);
    }

    public static void eliminarProducto() {
        producto p = new producto("Gato", "Decoración", 35, 4);
        productoDAO pDAO = new productoDAO();
        pDAO.eliminarProducto(11);
    }

    public static void mostrarProducto() {

    }
}