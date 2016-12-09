/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import conexion.conexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class colores extends conexion {
    
    private String color;

    public colores(String color) {
        this.color = color;
    }

    public colores() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean registrarColor(String nombre, String codColor) {
       // System.out.print("ll3go");
        String sql = "Insert into color (nombre, letra) values ('"+nombre+"', '"+codColor+"' );";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public ArrayList<String>CargarComboColor(){
     
         String sql = "Select * from color order by nombre ";
        ArrayList<String> resultat;
        lista = new ArrayList();
        try {
            rs = Consultar(sql);
            while (rs.next()) {
                lista.add(
                        rs.getString("nombre"));
                 
            }
            System.out.print(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    
    public int consultarIdColor(String nomColor) throws SQLException{
        String sql = "Select * from color where nombre = '" + nomColor + "'";
        rs = Consultar(sql);      
        int id = 0;
      //  System.out.print("Nombre del Color " + nomColor);
        
        while (rs.next()) 
            { 
                System.out.println (id = rs.getInt (1)); 
            }
        return id;
    }
    
    
    public String consultarNombreColorUno(int idColor) throws SQLException{
        String sql = "Select * from color where id = '" + idColor + "'";
        rs = Consultar(sql);      
        String color = "";
  //      System.out.print("id del Color " + idColor+"\n");
        
        while (rs.next()) 
            { 
                System.out.println (color = rs.getString("nombre")); 
            }
        return color;
    }
    
    public String consultarNombreColorDos(int idColor) throws SQLException{
        String sql = "Select * from color where id = '" + idColor + "'";
        rs = Consultar(sql);      
        String color = "";
      //  System.out.print("id del Color " + idColor+"\n");
        
        while (rs.next()) 
            { 
                System.out.println (color = rs.getString("nombre")); 
            }
        return color;
    }
    
    public boolean actualizarColor(String nomColor, String colorAct) {
     //s   System.out.print("\n COLOR ACTUAL= " + nomColor  + "color nuevo = " + colorAct +"\n");
        String sql = "UPDATE color SET nombre='"+colorAct+"' where nombre='"+nomColor +"'";
        
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
}
