import dao.productoDAO;
import modelo.producto;

public class Main {
    public static void main(String[] args) {
        producto p = new producto("Gato", "Decoración", 25, 1);
        productoDAO pDAO = new productoDAO();
        pDAO.insertarProducto(p);
    }
}