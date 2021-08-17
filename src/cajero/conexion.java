package cajero;

import java.sql.*;

/**
 * @author MEDIA LIBRA DE AGUA
 */
public class conexion {
    public ResultSet resultado;
    public Statement sentencia;
    
    Connection conectar = null;
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/cajero", "root", "");
            sentencia = conectar.createStatement();
            System.out.println("conexion");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
