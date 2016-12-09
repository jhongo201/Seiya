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
public class clientes extends conexion {
    
    private String cliente;

    public clientes(String cliente) {
        this.cliente = cliente;
    }

    public clientes() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public boolean registrarCliente(String nombre) {
       // System.out.print("ll3go");
        String sql = "Insert into cliente (nombre) values ('"+nombre+"' );";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
    public ArrayList<String>CargarComboCliente(){
     
         String sql = "Select * from cliente order by id DESC";
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
    
    public int consultarIdCliente(String nomCliente) throws SQLException{
        String sql = "Select * from cliente where nombre = '" + nomCliente + "'";
        rs = Consultar(sql);      
        int id = 0;
        System.out.print("nombre de la orden " + nomCliente);
        
        while (rs.next()) 
            { 
                System.out.println (id = rs.getInt (1)); 
            }
        return id;
    }
    
    public String consultarNomCliente(int idCliente) throws SQLException{
        String sql = "Select * from cliente where id = '" + idCliente + "'";
        rs = Consultar(sql);      
        String nom = "";
       // System.out.print("nombre de la orden " + idCliente);
        System.out.print("\n id del cliente: ");
                System.out.println (idCliente); 
                System.out.print("\n");
        while (rs.next()) 
            { 
                System.out.print("\n nombre cliente: ");
                System.out.println (nom= rs.getString ("nombre")); 
                System.out.print("\n");
            }
        return nom;
    }
    
    
    public boolean actualizaCliente(String nombre, String nomAct) {
       // System.out.print("ll3go");
        String sql = "UPDATE cliente SET nombre='"+nomAct+"' where nombre='"+nombre+"'";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
}
