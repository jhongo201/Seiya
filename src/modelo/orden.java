/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import conexion.conexion;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class orden extends conexion {
    
       private String orden;
       private String tiquet;
       private int cliente;
       private String ciudad;
       private String pedido;
       private String entrega;

    public orden(String orden, String tiquet, int cliente, String ciudad, String pedido, String entrega) {
        this.orden = orden;
        this.tiquet = tiquet;
        this.cliente = cliente;
        this.ciudad = ciudad;
        this.pedido = pedido;
        this.entrega = entrega;
    }

    public orden(int cliente, String ciudad, String pedido, String entrega) {
        this.cliente = cliente;
        this.ciudad = ciudad;
        this.pedido = pedido;
        this.entrega = entrega;
    }

    public orden() {
        
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getTiquet() {
        return tiquet;
    }

    public void setTiquet(String tiquet) {
        this.tiquet = tiquet;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }
       

    public boolean registrarOrden(String orden, int cliente,String ciudad,String pedido, String entrega) {
       // System.out.print("ll3go");
        String sql = "Insert into orden (orden, idcliente, ciudad, fechapedido, fechaentrega) values ('"+orden+"', '"+cliente+"', '"+ciudad+"', '"+pedido+"', '"+entrega+"' );";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    

    public int consultarIdOrden(String nomOrden) throws SQLException{
        String sql = "Select * from orden where orden = '" + nomOrden + "'";
        rs = Consultar(sql);      
        int id = 0;
        //System.out.print("nombre de la orden " + nomOrden);
        
        while (rs.next()) 
            { 
                System.out.println (id = rs.getInt (1)); 
                if(id!=0)
                    return id=1;
                else
                    return id=0;
            }
        return id;
    }
    
    public Boolean actualizarOrden(String nomOrden, int idCliente, String ciudad, String fechaPed, String fechaEnt) throws SQLException{
        String sql = "UPDATE orden SET idcliente='"+idCliente+"', ciudad='"+ciudad+"', fechapedido='"+fechaPed+ "', fechaentrega='"+fechaEnt+"'  WHERE orden='" + nomOrden + "'";
                     
      
     //   System.out.print("\n Orden = " + nomOrden + " id Cliente = " +idCliente + " ciudad = " + ciudad +" fechaPed = " + fechaPed + " fechaEnt = " + fechaEnt+"\n");
        
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
        
    }
    
    
    public ArrayList<orden> CargarDatosOrden(String nomOrden ) {
        String sql = "Select * from orden where orden = '"+nomOrden+"'";
        lista = new ArrayList();
        try {
            rs = Consultar(sql);
            
           
            while (rs.next()) {
                lista.add(new orden(
                        rs.getInt("idcliente"),
                        rs.getString("ciudad"),
                        rs.getString("fechapedido"),
                        rs.getString("fechaentrega")));
            }
            
            rs.last();
          //  System.out.print("\n numero de registros de cargar datos orden "+rs.getRow()+" \n");
            this.ContarRgistrosDatosOrden(rs.getRow());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
    public int ContarRgistrosDatosOrden(int numReg ) {
        
        
          //  System.out.print("\n numero de registros de cargar datos orden "+numReg+" \n");
            
            return numReg;
    }
    
    public String ConsultarNombreCliente(int idCliente) throws SQLException{
        String sql = "Select * from cliente where id = '" + idCliente + "'";
      //  System.out.print("id cliente: " + idCliente);
        rs = Consultar(sql);     
        String nom = "";
        while (rs.next()) 
            { 
                System.out.println (nom = rs.getString("nombre")); 
              
           
            }
        return nom;
    }
    
    
 
    
}
