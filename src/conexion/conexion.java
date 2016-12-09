package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class conexion {

    private String PASSWORD = "";
    private String USERNAME = "root";
    private String HOST = "localhost:3306";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String DATABASE = "seiya";
    private String URL = "jdbc:mysql://" + HOST + "/" + DATABASE;

    
    public PreparedStatement pst;
    public Statement stmt;
    public ResultSet rs;
    public ArrayList lista;
    private Connection con;

    public conexion() {

        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
        } catch (ClassNotFoundException e) {
            System.err.print("ERROR: " + e);
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
    }
    public Connection getConnection() {
        return con;
    }
    public boolean Ejecutar(String sql) {
        try {
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            System.err.println("ERRROR: " + e);
            return false;
        }
    }

    public ResultSet Consultar(String sql) {
        try {
            return stmt.executeQuery(sql);
        } catch (Exception e) {
            return null;
        }
    }
}