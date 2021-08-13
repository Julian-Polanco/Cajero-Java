package cajero;

import java.sql.*;

/**
 * @author MEDIA LIBRA DE AGUA
 */
public class conexion {
    Connection conectar = null;
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/cajero", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
