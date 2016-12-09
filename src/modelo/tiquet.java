/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class tiquet extends conexion{
    
    private int tiquet;
    private int idorden;
    private int idcoloruno;
    private int idcolordos;
    private String observacion;
    private String verificacion;
    private int referencia;
    private int cantidad;
    private int n21;
    private int n22;
    private int n23;
    private int n24;
    private int n25;
    private int n26;
    private int n27;
    private int n28;
    private int n29;
    private int n30;
    private int n31;
    private int n32;
    private int n33;
    private int n34;
    private int n35;
    private int n36;
    private int n37;
    private int n38;
    private int n39;
    private int n40;
    private int n41;
    private int n42;
    private int n43;
    private int n44;
    private ArrayList contenido;

    public tiquet(int tiquet, int idorden, int idcoloruno, int idcolordos, 
            String observacion, int referencia, int cantidad,int n21, int n22, int n23, 
            int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, 
            int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, 
            int n40, int n41, int n42, int n43, int n44) {
        this.tiquet = tiquet;
        this.idorden = idorden;
        this.idcoloruno = idcoloruno;
        this.idcolordos = idcolordos;
        this.observacion = observacion;
        this.n21 = n21;
        this.n22 = n22;
        this.n23 = n23;
        this.n24 = n24;
        this.n25 = n25;
        this.n26 = n26;
        this.n27 = n27;
        this.n28 = n28;
        this.n29 = n29;
        this.n30 = n30;
        this.n31 = n31;
        this.n32 = n32;
        this.n33 = n33;
        this.n34 = n34;
        this.n35 = n35;
        this.n36 = n36;
        this.n37 = n37;
        this.n38 = n38;
        this.n39 = n39;
        this.n40 = n40;
        this.n41 = n41;
        this.n42 = n42;
        this.n43 = n43;
        this.n44 = n44;
    }

    public tiquet() {
    }

    public int getTiquet() {
        return tiquet;
    }

    public void setTiquet(int tiquet) {
        this.tiquet = tiquet;
    }

    public int getIdorden() {
        return idorden;
    }

    public void setIdorden(int idorden) {
        this.idorden = idorden;
    }

    public int getIdcoloruno() {
        return idcoloruno;
    }

    public void setIdcoloruno(int idcoloruno) {
        this.idcoloruno = idcoloruno;
    }

    public int getIdcolordos() {
        return idcolordos;
    }

    public void setIdcolordos(int idcolordos) {
        this.idcolordos = idcolordos;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


    public int getN21() {
        return n21;
    }

    public void setN21(int n21) {
        this.n21 = n21;
    }

    public int getN22() {
        return n22;
    }

    public void setN22(int n22) {
        this.n22 = n22;
    }

    public int getN23() {
        return n23;
    }

    public void setN23(int n23) {
        this.n23 = n23;
    }

    public int getN24() {
        return n24;
    }

    public void setN24(int n24) {
        this.n24 = n24;
    }

    public int getN25() {
        return n25;
    }

    public void setN25(int n25) {
        this.n25 = n25;
    }

    public int getN26() {
        return n26;
    }

    public void setN26(int n26) {
        this.n26 = n26;
    }

    public int getN27() {
        return n27;
    }

    public void setN27(int n27) {
        this.n27 = n27;
    }

    public int getN28() {
        return n28;
    }

    public void setN28(int n28) {
        this.n28 = n28;
    }

    public int getN29() {
        return n29;
    }

    public void setN29(int n29) {
        this.n29 = n29;
    }

    public int getN30() {
        return n30;
    }

    public void setN30(int n30) {
        this.n30 = n30;
    }

    public int getN31() {
        return n31;
    }

    public void setN31(int n31) {
        this.n31 = n31;
    }

    public int getN32() {
        return n32;
    }

    public void setN32(int n32) {
        this.n32 = n32;
    }

    public int getN33() {
        return n33;
    }

    public void setN33(int n33) {
        this.n33 = n33;
    }

    public int getN34() {
        return n34;
    }

    public void setN34(int n34) {
        this.n34 = n34;
    }

    public int getN35() {
        return n35;
    }

    public void setN35(int n35) {
        this.n35 = n35;
    }

    public int getN36() {
        return n36;
    }

    public void setN36(int n36) {
        this.n36 = n36;
    }

    public int getN37() {
        return n37;
    }

    public void setN37(int n37) {
        this.n37 = n37;
    }

    public int getN38() {
        return n38;
    }

    public void setN38(int n38) {
        this.n38 = n38;
    }

    public int getN39() {
        return n39;
    }

    public void setN39(int n39) {
        this.n39 = n39;
    }

    public int getN40() {
        return n40;
    }

    public void setN40(int n40) {
        this.n40 = n40;
    }

    public int getN41() {
        return n41;
    }

    public void setN41(int n41) {
        this.n41 = n41;
    }

    public int getN42() {
        return n42;
    }

    public void setN42(int n42) {
        this.n42 = n42;
    }

    public int getN43() {
        return n43;
    }

    public void setN43(int n43) {
        this.n43 = n43;
    }

    public int getN44() {
        return n44;
    }

    public void setN44(int n44) {
        this.n44 = n44;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Override
    public String toString() {
        return "tiquet{" + "tiquet=" + tiquet + ", idorden=" + idorden + ", idcoloruno=" + idcoloruno + ", idcolordos=" + idcolordos + ", observacion=" + observacion + ", verificacion=" + verificacion + ", referencia=" + referencia + ", cantidad=" + cantidad + ", n21=" + n21 + ", n22=" + n22 + ", n23=" + n23 + ", n24=" + n24 + ", n25=" + n25 + ", n26=" + n26 + ", n27=" + n27 + ", n28=" + n28 + ", n29=" + n29 + ", n30=" + n30 + ", n31=" + n31 + ", n32=" + n32 + ", n33=" + n33 + ", n34=" + n34 + ", n35=" + n35 + ", n36=" + n36 + ", n37=" + n37 + ", n38=" + n38 + ", n39=" + n39 + ", n40=" + n40 + ", n41=" + n41 + ", n42=" + n42 + ", n43=" + n43 + ", n44=" + n44 + '}';
    }

    
    public boolean registrarTiquet(int tiquet1, int idorden1, int idcoloruno1, int idcolordos1, 
            String observacion1, String verificacion1, int ref, int cant, int nn21, int nn22, int nn23, 
            int nn24, int nn25, int nn26, int nn27, int nn28, int nn29, int nn30, int nn31, 
            int nn32, int nn33, int nn34, int nn35, int nn36, int nn37, int nn38, int nn39, 
            int nn40, int nn41, int nn42, int nn43, int nn44) {
       // System.out.print("ll3go");
        String sql = "INSERT INTO `tiquet` (`tiquet`, `idorden`, `idcoloruno`, `idcolordos`, `observacion`, `verificacion`, `referencia`, `cantidad`,`21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`, `32`, `33`, `34`, `35`, `36`, `37`, `38`, `39`, `40`, `41`, `42`, `43`, `44`) VALUES ('"+
                tiquet1+"', '"+idorden1+"', '"+idcoloruno1+"', '"+idcolordos1+"', '"+observacion1+
                "', '"+verificacion1+"', '"+ref+"', '"+cant+"', '"+nn21+"', '"+nn22+"', '"+nn23+"', '"+nn24+"', '"+nn25+"', '"+nn26+
                "', '"+nn27+"', '"+nn28+"', '"+nn29+"', '"+nn30+"', '"+nn31+"', '"+nn32+"', '"+nn33+"', '"+nn34+
                "', '"+nn35+"', '"+nn36+"', '"+nn37+"', '"+nn38+"', '"+nn39+"', '"+nn40+"', '"+nn41+"', '"+nn42+
                "', '"+nn43+"', '"+nn44+"' )";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean registrarTiquet2(int nn21, int nn22, int nn23, 
            int nn24, int nn25, int nn26, int nn27, int nn28, int nn29, int nn30, int nn31, 
            int nn32, int nn33, int nn34, int nn35, int nn36, int nn37, int nn38, int nn39, 
            int nn40, int nn41, int nn42, int nn43, int nn44) {
       // System.out.print("ll3go");
        String sql = "INSERT INTO `tiquet` (`tiquet`, `idorden`, `idcoloruno`, `idcolordos`, `observacion`, `verificacion`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`, `32`, `33`, `34`, `35`, `36`, `37`, `38`, `39`, `40`, `41`, `42`, `43`, `44`) VALUES ('"+
                1+"', '"+1+"', '"+1+"', '"+1+"', '"+"jhon"+
                "', '"+"perez"+"', '"+nn21+"', '"+nn22+"', '"+nn23+"', '"+nn24+"', '"+nn25+"', '"+nn26+
                "', '"+nn27+"', '"+nn28+"', '"+nn29+"', '"+nn30+"', '"+nn31+"', '"+nn32+"', '"+nn33+"', '"+nn34+
                "', '"+nn35+"', '"+nn36+"', '"+nn37+"', '"+nn38+"', '"+nn39+"', '"+nn40+"', '"+nn41+"', '"+nn42+
                "', '"+nn43+"', '"+nn44+"' )";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean registrarPrueba(int tiquet1, int idorden1, int idcoloruno1, int idcolordos1, 
            String observacion1, String verificacion1) {
       // System.out.print("ll3go");
        String sql = "INSERT INTO `tiquet` (`tiquet`, `idorden`, `idcoloruno`, `idcolordos`, `observacion`, `verificacion`, `21`, `22`, `23`, `24`, `25`, `26`, `27`, `28`, `29`, `30`, `31`, `32`, `33`, `34`, `35`, `36`, `37`, `38`, `39`, `40`, `41`, `42`, `43`, `44`) VALUES ('"+
                tiquet1+"', '"+idorden1+"', '"+idcoloruno1+"', '"+idcolordos1+"', '"+observacion1+
                "', '"+verificacion1+"', '"+21+"', '"+22+"', '"+23+"', '"+24+"', '"+25+"', '"+26+
                "', '"+27+"', '"+28+"', '"+29+"', '"+30+"', '"+31+"', '"+32+"', '"+33+"', '"+34+
                "', '"+35+"', '"+36+"', '"+37+"', '"+38+"', '"+39+"', '"+40+"', '"+41+"', '"+42+
                "', '"+43+"', '"+44+"' )";
        try {            
            return Ejecutar(sql);
        } catch (Exception e) {
            return false;
        }
    }
    
    public ArrayList<String>CargarCombo(){
     
         String sql = "Select * from orden order by id DESC";
        ArrayList<String> resultat;
        lista = new ArrayList();
        try {
            rs = Consultar(sql);
            while (rs.next()) {
                lista.add(
                        rs.getString("orden"));
                 
            }
            System.out.print(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public ArrayList<String>CargarComboTiquet(int idOrden){
     
       //  String sql = "Select * from orden order by id DESC";Select * from tiquet where idorden = 8 AND tiquet= 199
        String sql= "Select * from tiquet where idorden = '" + idOrden +"'";
        ArrayList<String> resultat;
        lista = new ArrayList();
        try {
            rs = Consultar(sql);
            while (rs.next()) {
                lista.add(
                        rs.getString("tiquet"));
                 
            }
            System.out.print(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }
    
    
    public int consultarIdOrden(String nomOrden) throws SQLException{
        String sql = "Select * from orden where orden = '" + nomOrden + "'";
        rs = Consultar(sql);      
        int id = 0;
        //System.out.print("nombre de la orden " + nomOrden);
        
        while (rs.next()) 
            { 
                System.out.println (id = rs.getInt (1)); 
            }
        this.consultarRegistrosOrdenTiquet(id);
        return id;
    }
    
    public int consultarRegistrosOrdenTiquet(int idOrden) throws SQLException{
        String sql = "Select * from tiquet where idorden = '" + idOrden + "'";
        rs = Consultar(sql);      
        int id = 0;
        //System.out.print("nombre de la orden " + nomOrden);
        rs.last();
        id=rs.getRow();
        
               // System.out.println ("\n numero de  tiquets en la orden: "+ id+"\n"); 
     
        return id;
    }
    
    
    
    
    public int consultartiq(String nomTiquet) throws SQLException{
        String sql = "Select * from tiquet where tiquet = '" + nomTiquet + "'";
        rs = Consultar(sql);      
        int id = 0;
        //System.out.print("nombre de la orden " + nomOrden);
        
        while (rs.next()) 
            { 
                System.out.println (id = rs.getInt (2)); 
                if(id!=0)
                    return id=1;
                else
                    return id=0;
            }
        return id;
    }
    
    public int consultarTiquet(int idOrden) throws SQLException{
        String sql = "Select * from tiquet where idorden = '" + idOrden + "'";
        rs = Consultar(sql);      
        int id = 0; 
        int numTiquet = 0;
        String valor = "";
        System.out.print("id de la orden en el tiquet:" + idOrden);
        ArrayList<String> lista = new ArrayList<String>();
        
        
        while (rs.next()) 
            { 
                 lista.add(rs.getString("tiquet"));
                System.out.println ("\n id tiquet = "); 
                System.out.println (id = rs.getInt (1)); 
                System.out.println ("\n Numero tiquet = "); 
                System.out.println (numTiquet = rs.getInt (2));
                System.out.println ("\n id orden = "); 
                System.out.println (id = rs.getInt (3));
                System.out.println ("\n id color uno = "); 
                System.out.println (id = rs.getInt (4));
                System.out.println ("\n id color dos = "); 
                System.out.println (id = rs.getInt (5));
                System.out.println ("\n Observacion = "); 
                System.out.println (valor = rs.getString(6));
                System.out.println ("\n verificacion = "); 
                System.out.println (valor = rs.getString(7));
                System.out.println ("\n referencia = "); 
                System.out.println (id = rs.getInt (8)); 
                System.out.println ("\n cantidad = "); 
                System.out.println (id = rs.getInt (9));
                System.out.println ("\n campo 21 = "); 
                System.out.println (id = rs.getInt (10));
                System.out.println ("\n campo 22 = "); 
                System.out.println (id = rs.getInt (11));
                System.out.println ("\n campo 23 = "); 
                System.out.println (id = rs.getInt (12));
                System.out.println ("\n campo 24 = "); 
                System.out.println (id = rs.getInt (13));
                System.out.println ("\n campo 25 = "); 
                System.out.println (id = rs.getInt (14));
                System.out.println ("\n campo 26 = "); 
                System.out.println (id = rs.getInt (15));
                System.out.println ("\n campo 27 = "); 
                System.out.println (id = rs.getInt (16));
                System.out.println ("\n campo 28 = "); 
                System.out.println (id = rs.getInt (17));
                System.out.println ("\n campo 29 = "); 
                System.out.println (id = rs.getInt (18));
                System.out.println ("\n campo 30 = "); 
                System.out.println (id = rs.getInt (19));
                System.out.println ("\n campo 31 = "); 
                System.out.println (id = rs.getInt (20));
                System.out.println ("\n campo 32 = "); 
                System.out.println (id = rs.getInt (21));
                System.out.println ("\n campo 33 = "); 
                System.out.println (id = rs.getInt (22));
                System.out.println ("\n campo 34 = "); 
                System.out.println (id = rs.getInt (23));
                System.out.println ("\n campo 35 = "); 
                System.out.println (id = rs.getInt (24));
                System.out.println ("\n campo 36 = "); 
                System.out.println (id = rs.getInt (25));
                System.out.println ("\n campo 37 = "); 
                System.out.println (id = rs.getInt (26));
                System.out.println ("\n campo 38 = "); 
                System.out.println (id = rs.getInt (27));
                System.out.println ("\n campo 39 = "); 
                System.out.println (id = rs.getInt (28));
                System.out.println ("\n campo 40 = "); 
                System.out.println (id = rs.getInt (29));
                System.out.println ("\n campo 41 = "); 
                System.out.println (id = rs.getInt (30));
                System.out.println ("\n campo 42 = "); 
                System.out.println (id = rs.getInt (31));
                System.out.println ("\n campo 43 = "); 
                System.out.println (id = rs.getInt (32));
                System.out.println ("\n campo 44 = "); 
                System.out.println (id = rs.getInt (33));
            }
        return numTiquet;
    }
    
    public ArrayList<String> consultarTiquetporOrden(int idOrden) throws SQLException{
        String sql = "Select * from tiquet where idorden = '" + idOrden + "'";
        rs = Consultar(sql);      
        int id = 0; 
        int numTiquet = 0;
        String valor = "";
        System.out.print("id de la orden en el tiquet:" + idOrden);
        ArrayList<String> lista = new ArrayList<String>();
        
        
        while (rs.next()) 
            { 
                 lista.add(rs.getString("tiquet"));
                
            }
        return lista;
    }
    
    
  /*  public int consultarTiquetArray(int idOrden) throws SQLException{
        String sql = "Select * from tiquet where idorden = '" + idOrden + "'";
        rs = Consultar(sql);      
        int id = 0; 
        int numTiquet = 0;
        String valor = "";
        System.out.print("id de la orden en el tiquet:" + idOrden);
        List lista = new ArrayList();;
        String [] tiq = new String[31];
        int i=0;
        int acumulado  = 0;
        int x=0;
        
        while (rs.next()) 
            { 
                lista.add(rs.getString(1));
            }
        int tam = lista.size();
        
        
        for(int w = 0; w<=tam; w++){
            String dato1 = (String)lista.get(tam-1);
            System.out.print(" datossssssssss: "+dato1);
        }
               /* i++;
               if(i<=31){
                    if(i==5 || i==6){
                        tiq[i] = rs.getString(i);
                        System.out.print("contador 1 :" + i);
                        lista.add(tiq[i]);
                    }else{

                        acumulado = rs.getInt(i);
                        x=acumulado;
                        
                        tiq[i] =  String.valueOf(x);
                        System.out.print("contador 2 :" + i);
                        lista.add(tiq[i]);
                    }
               }
                
                
                lista.add(new tiquet(
                        rs.getInt("tiquet"),
                        rs.getInt("idorden"),
                        rs.getInt("idcoloruno"),
                        rs.getInt("idcolordos"),
                        rs.getString("observacion"),
                        rs.getString("verificacion"),
                        rs.getInt("referencia"),
                        rs.getInt("cantidad"),
                        rs.getInt("21"),
                        rs.getInt("22"),
                        rs.getInt("23"),
                        rs.getInt("24"),
                        rs.getInt("25"),
                        rs.getInt("26"),
                        rs.getInt("27"),
                        rs.getInt("28"),
                        rs.getInt("29"),
                        rs.getInt("30"),
                        rs.getInt("31"),
                        rs.getInt("32"),
                        rs.getInt("33"),
                        rs.getInt("34"),
                        rs.getInt("35"),
                        rs.getInt("36"),
                        rs.getInt("37"),
                        rs.getInt("38"),
                        rs.getInt("39"),
                        rs.getInt("40"),
                        rs.getInt("41"),
                        rs.getInt("42"),
                        rs.getInt("43"),
                        rs.getInt("44")
                         
                 ));
                
                System.out.println (id = rs.getInt (1)); 
                System.out.println (numTiquet = rs.getInt (2));
                System.out.println (id = rs.getInt (3));
                System.out.println (id = rs.getInt (4));
                System.out.println (id = rs.getInt (5));
                System.out.println (valor = rs.getString(6));
                System.out.println (valor = rs.getString(7));
                System.out.println (id = rs.getInt (8)); 
                System.out.println (id = rs.getInt (9));
                System.out.println (id = rs.getInt (10));
                System.out.println (id = rs.getInt (11));
                System.out.println (id = rs.getInt (12));
                System.out.println (id = rs.getInt (13));
                System.out.println (id = rs.getInt (14));
                System.out.println (id = rs.getInt (15));
                System.out.println (id = rs.getInt (16));
                System.out.println (id = rs.getInt (17));
                System.out.println (id = rs.getInt (18));
                System.out.println (id = rs.getInt (19));
                System.out.println (id = rs.getInt (20));
                System.out.println (id = rs.getInt (21));
                System.out.println (id = rs.getInt (22));
                System.out.println (id = rs.getInt (23));
                System.out.println (id = rs.getInt (24));
                System.out.println (id = rs.getInt (25));
                System.out.println (id = rs.getInt (26));
                System.out.println (id = rs.getInt (27));
                System.out.println (id = rs.getInt (28));
                System.out.println (id = rs.getInt (29));
                System.out.println (id = rs.getInt (30));
                System.out.println (id = rs.getInt (31));
                System.out.println (id = rs.getInt (32));
                System.out.println (id = rs.getInt (33));
                
            }
        System.out.print("\n la lista de arrays tiquet son: "+lista+"\n");
        
        return numTiquet;
    }*/
    
    public String consultarIdOrdenTiquet(int nomOrden) throws SQLException{
        String sql = "Select * from tiquet where idorden = '" + nomOrden + "'";
        rs = Consultar(sql);
        
        int cuantos = rs.getRow();
        System.out.print("numero registros " +cuantos+"\n");
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0, c12 = 0, c13 = 0, c14 = 0, c15 = 0;
        int c16 = 0, c17 = 0, c18 = 0, c19 = 0, c20 = 0, c21 = 0, c22 = 0, c23 = 0, c24 = 0, c25 = 0, c26 = 0, c27 = 0, c28 = 0, c29 = 0;
        int c30 = 0, c31 = 0, c32 = 0;
        System.out.print("nombre tiquet " + nomOrden+"\n");
        
        while (rs.next()) 
            { 
                c1 = rs.getInt (1); 
                c2 = rs.getInt (2);
                c3 = rs.getInt (3);
                c4 = rs.getInt (4);
                c5 = rs.getInt (5);
                c6 = rs.getInt (8); 
                c7 = rs.getInt (9);
                c8 = rs.getInt (10);
                c9 = rs.getInt (11);
                c10 = rs.getInt (12);
                c11 = rs.getInt (13);
                c12 = rs.getInt (14);
                c13 = rs.getInt (15);
                c14 = rs.getInt (16);
                c15 = rs.getInt (17);
                c16 = rs.getInt (18);
                c17 = rs.getInt (19);
                c18 = rs.getInt (21);
                c19 = rs.getInt (22);
                c20 = rs.getInt (23);
                c21 = rs.getInt (24);
                c22 = rs.getInt (25);
                c23 = rs.getInt (26);
                c24 = rs.getInt (28);
                c25 = rs.getInt (29);
                c26 = rs.getInt (30);
                c27 = rs.getInt (31);
                c28 = rs.getInt (32);
                
            }
        
        String cadena = ""+c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8+""+c9+""+
                c10+""+c11+""+c12+""+c13+""+c14+""+c15+""+c16+""+c17+""+c18+""+
                c19+""+c20+""+c21+""+c22+""+c23+""+c24+""+c25+""+c26+""+c27+""+c28;
        
        return cadena;
    }
    
    public ArrayList<tiquet> conten (int idOrden, int tiquet) throws SQLException{
        
        String sql = "Select * from tiquet where tiquet = '" + tiquet +"' and idorden='"+idOrden+"'";
        lista = new ArrayList();     
        try {
            rs = Consultar(sql);
            System.out.print("id orden es: "+idOrden);
           
            while (rs.next()) {
                lista.add(new tiquet(
                        rs.getInt("tiquet"),
                        rs.getInt("idorden"),
                        rs.getInt("idcoloruno"),
                        rs.getInt("idcolordos"),
                        rs.getString("observacion"),
                        rs.getInt("referencia"),
                        rs.getInt("cantidad"),
                        rs.getInt("21"),
                        rs.getInt("22"),
                        rs.getInt("23"),
                        rs.getInt("24"),
                        rs.getInt("25"),
                        rs.getInt("26"),
                        rs.getInt("27"),
                        rs.getInt("28"),
                        rs.getInt("29"),
                        rs.getInt("30"),
                        rs.getInt("31"),
                        rs.getInt("32"),
                        rs.getInt("33"),
                        rs.getInt("34"),
                        rs.getInt("35"),
                        rs.getInt("36"),
                        rs.getInt("37"),
                        rs.getInt("38"),
                        rs.getInt("39"),
                        rs.getInt("40"),
                        rs.getInt("41"),
                        rs.getInt("42"),
                        rs.getInt("43"),
                        rs.getInt("44")
                ));
            }
            
            rs.last();
          //  System.out.print("\n numero de registros de cargar datos orden "+rs.getRow()+" \n");
           // this.ContarRgistrosDatosOrden(rs.getRow());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
        
        
    }
    
    
    
    //Este método recibe la cadena sql a ejecutar, con una Connection y Statement declarados por supuesto y que no expongo aquí por cuestiones de código más claro... 

public String ConsultaString(int id) throws SQLException { 
   
   String sql = "Select * from tiquet where idorden = '" + id + "'";
        rs = Consultar(sql);
        rs.last();
        int cuantos = rs.getRow();
        System.out.print("numero registros " +cuantos+"\n");
   String cadena = "";
   while (rs.next()) { //Aquí necesito validar si hay registros. 
     cadena = rs.getString(1);
     cadena = rs.getString(2);//llama a otro método 
   } 
   return cadena;    
}

public String ConsultaObservacion(int id) throws SQLException { 
   
   String sql = "Select * from tiquet where tiquet = '" + id + "'";
        rs = Consultar(sql);
        //rs.last();
       // int cuantos = rs.getRow();
        //System.out.print("numero registros " +cuantos+"\n");
        System.out.print("numero de tiquet " +id+"\n");
   String cadena = "";
   while (rs.next()) { //Aquí necesito validar si hay registros. 
     cadena = rs.getString("observacion");
     System.out.print("observacion " +cadena+"\n");
   } 
   return cadena;    
}

//Este otro método recibe por párametro el ResulSet creado en el anterior y se encarga de crear el Object[] según los campos del parámetro Class y de la metadata del ResultSet (que no expongo por el motivo que ya expliqué anteriormente) 

private String ObtenerObjetos(ResultSet Rs) throws SQLException { 
   Vector Listado = new Vector(); 
   
   do{ 
      
      //{ 
      //Código de llenado de Objeto con los datos de la fila 
      //} 
    Listado.add(rs.getInt(1)); 
   }while(Rs.next()); 
        return null;
} 

    public tiquet(int tiquet, int idorden) {
        this.tiquet = tiquet;
        this.idorden = idorden;
    }

  
   public int ConsultarReferencia(int tiquet, int idOrden) throws SQLException{
        String sql = "Select * from tiquet where tiquet = '" + tiquet +"' and idorden='"+idOrden+"'";
      //  System.out.print("id cliente: " + idCliente);
        rs = Consultar(sql);     
        int ref=0;
        while (rs.next()) 
            { 
                ref = rs.getInt("referencia"); 
            //  System.out.print("\n Referencia: "+ref+ "tiquet: "+ tiquet + "idOrden: " + idOrden +"\n");
           
            }
        return ref;
    }
   
   public int ConsultarCantidad(int tiquet, int idOrden) throws SQLException{
        String sql = "Select * from tiquet where tiquet = '" + tiquet +"' and idorden='"+idOrden+"'";
      //  System.out.print("id cliente: " + idCliente);
        rs = Consultar(sql);     
        int ref=0;
        while (rs.next()) 
            { 
                ref = rs.getInt("cantidad"); 
              System.out.print("\n Cantidad: "+ref+ "tiquet: "+ tiquet + "idOrden: " + idOrden +"\n");
           
            }
        return ref;
    }




}
