package dao;

import modelo.producto;

import java.sql.*;
import java.util.List;

public class productoDAO {
    private String url= "jdbc:sqlite:ud6.sqlite";

    public void insertarProducto(producto p) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "insert into productos (nombre, categoria, precio, stock)" +
                    " values (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, p.getNombre());
            pstmt.setString(2, p.getCategoria());
            pstmt.setDouble(3, p.getPrecio());
            pstmt.setInt(4, p.getStok());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void actualizarProducto(producto p, int id) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "update productos set nombre = ?, categoria = ?, precio = ?," +
                    " stock = ? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, p.getNombre());
            pstmt.setString(2, p.getCategoria());
            pstmt.setDouble(3, p.getPrecio());
            pstmt.setInt(4, p.getStok());
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
            System.out.println("gg");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void eliminarProducto(int id) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "delete from productos where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("gg");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<producto> obtenerProductos() {
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "select * from productos";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");
                producto p = new producto(nombre, categoria, precio, stock);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
