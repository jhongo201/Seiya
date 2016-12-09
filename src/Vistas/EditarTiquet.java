/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.colores;
import modelo.orden;
import modelo.tiquet;

/**
 *
 * @author Usuario
 */
public class EditarTiquet extends javax.swing.JFrame {
    
    tiquet nuevoTiquet = new tiquet();
    colores nuevoColor = new colores();
    orden nuevaOrden = new orden();
    String CadOrden = "";
    
    int idOrden=0;
     int x = 0;
     int cuno = 0;
     int cdos = 0;

    /**
     * Creates new form EditarTiquet
     */
    public EditarTiquet() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Calzado Seiya");
        this.setResizable(false);
       // inicializarValores();
       // nuevoTiquet.CargarCombo();
        this.llenarCB();
      //  nuevoColor.CargarComboColor();
        this.llenarComboColor();
    }
    
    public void llenarCmbTiquet(int id) throws SQLException{
        cmbTiquet.removeAllItems(); //Vaciamos el JComboBox
        ArrayList<String> resultat;
        resultat = nuevoTiquet.CargarComboTiquet(id);//La consulta tiene que retornar un ArrayList

        for(int i=0; i<resultat.size();i++){
            cmbTiquet.addItem(resultat.get(i));
        }
    }
    
     public void inicializarValores(){
     //   this.tiquet.setText("");
       // this.cmbOrden.getSelectedItem();
        this.observacion.setText("");
        this.referencia.setText("");
        this.cantidad.setText("");
        this.n21.setText("");
        this.n22.setText("");
        this.n23.setText("");
        this.n24.setText("");
        this.n25.setText("");
        this.n26.setText("");
        this.n27.setText("");
        this.n28.setText("");
        this.n29.setText("");
        this.n30.setText("");
        this.n31.setText("");
        this.n32.setText("");
        this.n33.setText("");
        this.n34.setText("");
        this.n35.setText("");
        this.n36.setText("");
        this.n37.setText("");
        this.n38.setText("");
        this.n39.setText("");
        this.n40.setText("");
        this.n41.setText("");
        this.n42.setText("");
        this.n43.setText("");
        this.n44.setText("");
    }
     
      public void mostrarDatosOrden(){
        ArrayList<orden> resultat;
        resultat = nuevaOrden.CargarDatosOrden(CadOrden);//La consulta tiene que retornar un ArrayList
        
        int idc =0;
        String ciu ="";
        String fecent ="";
        String fecped = "";
        String nom = "";
        for (orden ord : new orden().CargarDatosOrden(CadOrden)){
                  idc = ord.getCliente();
                  ciu=  ord.getCiudad();
                  fecped = ord.getPedido();
                  fecent = ord.getEntrega();                  
        }
        
        //this.texto.setText("id del cliente " + idc + "\n ciudad " + ciu + "\n fececha pedido " + fecped + "\n  fecha entrega " + fecent );
    }
     
     public void capturarDatos(){
        //inicializarValores();
        try{
        int nnn21=0, nnn22=0, nnn23=0, nnn24=0, nnn25=0, nnn26=0, nnn27=0, nnn28=0, nnn29=0, nnn30=0, 
                nnn31=0, nnn32=0, nnn33=0, nnn34=0, nnn35=0, nnn36=0, nnn37=0, nnn38=0, nnn39=0, nnn40=0, 
                nnn41=0, nnn42=0, nnn43=0, nnn44 = 0;
        int ref = 0, cant = 0;
        
      //  String tiquet1 = this.tiquet.getText();
        //int idorden = Integer.parseInt((String) this.cmbOrden.getSelectedItem());
       // String  idcoloruno = this.coloruno.getText();
       // String  idcolordos = this.colordos.getText();
        String observacion = this.observacion.getText();
        String verificacion = "";
        String refe = this.referencia.getText();
        String canti = this.cantidad.getText();
        String  nn21 = this.n21.getText();
        String  nn22 = this.n22.getText();
        String  nn23 = this.n23.getText();
        String  nn24 = this.n24.getText();
        String  nn25 = this.n25.getText();
        String  nn26 = this.n26.getText();
        String  nn27 = this.n27.getText();
        String  nn28 = this.n28.getText();
        String  nn29 = this.n29.getText();
        String  nn30 = this.n30.getText();
        String  nn31 = this.n31.getText();
        String  nn32 = this.n32.getText();
        String  nn33 = this.n33.getText();
        String  nn34 = this.n34.getText();
        String  nn35 = this.n35.getText();
        String  nn36 = this.n36.getText();
        String  nn37 = this.n37.getText();
        String  nn38 = this.n38.getText();
        String  nn39 = this.n39.getText();
        String  nn40 = this.n40.getText();
        String  nn41 = this.n41.getText();
        String  nn42 = this.n42.getText();
        String  nn43 = this.n43.getText();
        String  nn44 = this.n44.getText();
   /*     if(tiquet1.equals("")){
            JOptionPane.showMessageDialog(null, "El tiquet no puede estar vacio");
            this.inicializarValores();
        }
        */
        if(refe.equals("")){
            JOptionPane.showMessageDialog(null, "La referencia no puede estar vacia");
            this.inicializarValores();
        }else{
            ref = Integer.parseInt(refe);
        }
        if(canti.equals("")){
            JOptionPane.showMessageDialog(null, "La cantidad no puede estar vacia");
            this.inicializarValores();
        }else{
            cant = Integer.parseInt(canti);
        }
        
        if(nn21.equals("")){
          nnn21 = 0;  
        }else{
            nnn21 = Integer.parseInt(nn21);
        }
        if(nn22.equals("")){
            nnn22 = 0;
        }else{
            nnn22 = Integer.parseInt(nn22);
        }
        if(nn23.equals("")){
            nnn23 = 0;
        }else{
            nnn23 = Integer.parseInt(nn23);
        }
        if(nn24.equals("")){
            nnn24 = 0;  
        }else{
            nnn24 = Integer.parseInt(nn24);
        }
        if(nn25.equals("")){
            nnn25 = 0;  
        }else{
            nnn25 = Integer.parseInt(nn25);
        }
        if(nn26.equals("")){
            nnn26 = 0;  
        }else{
            nnn26 = Integer.parseInt(nn26);
        }
        if(nn27.equals("")){
            nnn27 = 0;  
        }else{
            nnn27 = Integer.parseInt(nn27);
        }
        
        if(nn28.equals("")){
           nnn28 = 0;  
        }else{
            nnn28 = Integer.parseInt(nn28);
        }
        if(nn29.equals("")){
            nnn29 = 0;  
        }else{
            nnn29 = Integer.parseInt(nn29);
        }
        if(nn30.equals("")){
            nnn30 = 0;  
        }else{
            nnn30 = Integer.parseInt(nn30);
        }
        if(nn31.equals("")){
            nnn31 = 0;  
        }else{
            nnn31 = Integer.parseInt(nn31);
        }
        if(nn32.equals("")){
            nnn32 = 0;  
        }else{
            nnn32 = Integer.parseInt(nn32);
        }
        if(nn33.equals("")){
            nnn33 = 0;  
        }else{
            nnn33 = Integer.parseInt(nn33);
        }
        if(nn34.equals("")){
            nnn34 = 0;  
        }else{
            nnn34 = Integer.parseInt(nn34);
        }
        if(nn35.equals("")){
            nnn35 = 0;  
        }else{
            nnn35 = Integer.parseInt(nn35);
        }
        if(nn36.equals("")){
            nnn36 = 0;  
        }else{
            nnn36 = Integer.parseInt(nn36);
        }
        if(nn37.equals("")){
            nnn37 = 0;  
        }else{
            nnn37 = Integer.parseInt(nn37);
        }
        if(nn38.equals("")){
            nnn38 = 0;  
        }else{
            nnn38 = Integer.parseInt(nn38);
        }
        if(nn39.equals("")){
            nnn39 = 0;  
        }else{
            nnn39 = Integer.parseInt(nn39);
        }
        if(nn40.equals("")){
            nnn40 = 0;  
        }else{
            nnn40 = Integer.parseInt(nn40);
        }
        if(nn41.equals("")){
            nnn41 = 0;  
        }else{
            nnn41 = Integer.parseInt(nn41);
        }
        if(nn42.equals("")){
            nnn42 = 0;  
        }else{
            nnn42 = Integer.parseInt(nn42);
        }
        if(nn43.equals("")){
            nnn43 = 0;  
        }else{
            nnn43 = Integer.parseInt(nn43);
        }
        if(nn44.equals("")){
            nnn44 = 0;  
        }else{
            nnn44 = Integer.parseInt(nn44);
        }
        
        int sumPares = nnn21 + nnn22 + nnn23 + nnn24 + nnn25 + nnn26 + nnn27 + nnn28 + nnn29 + 
               nnn30 + nnn31 + nnn32 + nnn33 + nnn34 + nnn35 + nnn36 + nnn37 + nnn38 + nnn39 + nnn40 + 
               nnn41 + nnn42 + nnn43 + nnn44;
        
        if(sumPares != cant){
            JOptionPane.showMessageDialog(null, "La cantidad indicada no corresponde con los pares asignados");
            //this.inicializarValores();
            
        }
        
          
        
      /* this.registrarTiquet(Integer.parseInt(tiquet1), x, cdos, 
               cuno, observacion, 
               verificacion, ref, cant, nnn21, nnn22, nnn23, nnn24, nnn25, nnn26, nnn27, nnn28, nnn29, 
               nnn30, nnn31, nnn32, nnn33, nnn34, nnn35, nnn36, nnn37, nnn38, nnn39, nnn40, 
               nnn41, nnn42, nnn43, nnn44);
       */
       
        }catch(Exception e){
            System.out.println("El tiquet esta vacio");
        }
       
       
    }
     
     
     
     public void registrarTiquet(int tiquet, int idorden, int idcoloruno, int idcolordos, 
            String observacion, String verificacion, int ref, int cant, int n21, int n22, int n23, 
            int n24, int n25, int n26, int n27, int n28, int n29, int n30, int n31, 
            int n32, int n33, int n34, int n35, int n36, int n37, int n38, int n39, 
            int n40, int n41, int n42, int n43, int n44){
        
        
        if(nuevoTiquet.registrarTiquet(tiquet, x, cuno, cdos, observacion, verificacion, ref, cant, n21, n22, n23, n24, n25, n26, n27, n28, n29, n30, n31, n32, n33, n34, n35, n36, n37, n38, n39, n40, n41, n42, n43, n44)){
            this.mensaje.setText("Registro Tiquet Exitoso");
        }else 
            this.mensaje.setText("Algo Salio Mal, Intentelo de Nuevo");
    }
     
     
      public void llenarCB() throws SQLException{
        cmbOrden.removeAllItems(); //Vaciamos el JComboBox
        ArrayList<String> resultat;
        resultat = nuevoTiquet.CargarCombo();//La consulta tiene que retornar un ArrayList

        for(int i=0; i<resultat.size();i++){
            cmbOrden.addItem(resultat.get(i));
        }
    }
    
    public void llenarComboColor() throws SQLException{
        this.cmbColor1.removeAllItems(); //Vaciamos el JComboBox
        this.cmbColor2.removeAllItems(); //Vaciamos el JComboBox
        ArrayList<String> resultat;
        ArrayList<String> resultat2;
        resultat = this.nuevoColor.CargarComboColor();//La consulta tiene que retornar un ArrayList
        resultat2 = this.nuevoColor.CargarComboColor();//La consulta tiene que retornar un ArrayList

        for(int i=0; i<resultat.size();i++){
            this.cmbColor1.addItem(resultat.get(i));
        }
        
        for(int i=0; i<resultat.size();i++){
            this.cmbColor2.addItem(resultat.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbOrden = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        observacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbColor1 = new javax.swing.JComboBox();
        cmbColor2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        referencia = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        cmbTiquet = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        n21 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        n22 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        n23 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        n24 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        n25 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        n26 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        n27 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        n28 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        n29 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        n35 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        n37 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        n36 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        n38 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        n30 = new javax.swing.JTextField();
        n31 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        n32 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        n33 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        n34 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        n40 = new javax.swing.JTextField();
        n41 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        n42 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        n43 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        n44 = new javax.swing.JTextField();
        generarTiquet = new javax.swing.JButton();
        n39 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Tiquet"));

        jLabel8.setText("Tiquet N°:");

        cmbOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccionar Numero de Orden:");

        jLabel1.setText("Observación");

        jLabel3.setText("Color Uno");

        jLabel4.setText("Color Dos");

        cmbColor1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColor1ActionPerformed(evt);
            }
        });

        cmbColor2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColor2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Referencia");

        jLabel6.setText("Cantidad");

        cmbTiquet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTiquet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTiquetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbOrden, 0, 190, Short.MAX_VALUE)
                    .addComponent(observacion)
                    .addComponent(cmbColor1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbColor2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(referencia)
                    .addComponent(cantidad)
                    .addComponent(cmbTiquet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbTiquet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("21");

        jLabel10.setText("22");

        jLabel11.setText("23");

        jLabel12.setText("24");

        jLabel13.setText("25");

        jLabel14.setText("26");

        jLabel15.setText("27");

        jLabel16.setText("28");

        jLabel17.setText("29");

        jLabel18.setText("36");

        jLabel19.setText("35");

        jLabel20.setText("38");

        jLabel21.setText("37");

        jLabel22.setText("30");

        jLabel23.setText("31");

        jLabel24.setText("32");

        jLabel25.setText("33");

        jLabel26.setText("34");

        jLabel31.setText("40");

        jLabel32.setText("41");

        jLabel33.setText("42");

        jLabel34.setText("43");

        jLabel35.setText("44");

        generarTiquet.setText("Actualizar Tiquet");
        generarTiquet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarTiquetActionPerformed(evt);
            }
        });

        jLabel27.setText("39");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generarTiquet)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(n21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(n22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(n23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(n24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(n25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(n26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(n27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(n28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(n29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(n30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(n31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(n32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(n33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(n34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(n35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(n36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(n37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(n38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(n39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(n40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(n41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(n42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(n43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(n44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generarTiquet)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/seiya.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenActionPerformed
        
     //   String idOrden = (String) cmbOrden.getSelectedItem();

        try {
            CadOrden = (String) cmbOrden.getSelectedItem();
         //   idOrden= nuevoTiquet.consultarIdOrden(CadOrden);
            x= nuevoTiquet.consultarIdOrden(CadOrden);
            this.llenarCmbTiquet(x);//llena combo tiquet
        } catch (SQLException ex) {
            Logger.getLogger(Tiquet.class.getName()).log(Level.SEVERE, null, ex);
        }
        // this.mensaje.setText(""+x);
    }//GEN-LAST:event_cmbOrdenActionPerformed

    private void cmbColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColor1ActionPerformed
        // TODO add your handling code here:
        String idColUno = (String) this.cmbColor1.getSelectedItem();

        try {
            cuno= this.nuevoColor.consultarIdColor(idColUno);
        } catch (SQLException ex) {
            Logger.getLogger(Tiquet.class.getName()).log(Level.SEVERE, null, ex);
        }
        // this.mensaje.setText(""+cuno);
    }//GEN-LAST:event_cmbColor1ActionPerformed

    private void cmbColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColor2ActionPerformed
        // TODO add your handling code here:
        String idColDos = (String) this.cmbColor2.getSelectedItem();

        try {
            cdos= this.nuevoColor.consultarIdColor(idColDos);
        } catch (SQLException ex) {
            Logger.getLogger(Tiquet.class.getName()).log(Level.SEVERE, null, ex);
        }
        // this.mensaje.setText(""+cdos);
    }//GEN-LAST:event_cmbColor2ActionPerformed

    private void generarTiquetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarTiquetActionPerformed
       /* if(con==1)
            this.mensaje.setText("El Tiquet ya Existe");
        else{
            this.capturarDatos();
            this.inicializarValores();
            this.mensaje.setText("Tiquet Generado Correctamente");
        }*/

    }//GEN-LAST:event_generarTiquetActionPerformed

    private void cmbTiquetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiquetActionPerformed
        try {
            // TODO add your handling code here:
            int c1,c2,c4,c5,c8=0;
        String ob = "";
            String tiq2 = (String) this.cmbTiquet.getSelectedItem();
            
         System.out.printf("tiquet seleccionado numero: "+ Integer.parseInt(tiq2));
        } catch (Exception ex) {
            Logger.getLogger(EditarTiquet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbTiquetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarTiquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarTiquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarTiquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarTiquet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditarTiquet().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditarTiquet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox cmbColor1;
    private javax.swing.JComboBox cmbColor2;
    private javax.swing.JComboBox cmbOrden;
    private javax.swing.JComboBox cmbTiquet;
    private javax.swing.JButton generarTiquet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField n21;
    private javax.swing.JTextField n22;
    private javax.swing.JTextField n23;
    private javax.swing.JTextField n24;
    private javax.swing.JTextField n25;
    private javax.swing.JTextField n26;
    private javax.swing.JTextField n27;
    private javax.swing.JTextField n28;
    private javax.swing.JTextField n29;
    private javax.swing.JTextField n30;
    private javax.swing.JTextField n31;
    private javax.swing.JTextField n32;
    private javax.swing.JTextField n33;
    private javax.swing.JTextField n34;
    private javax.swing.JTextField n35;
    private javax.swing.JTextField n36;
    private javax.swing.JTextField n37;
    private javax.swing.JTextField n38;
    private javax.swing.JTextField n39;
    private javax.swing.JTextField n40;
    private javax.swing.JTextField n41;
    private javax.swing.JTextField n42;
    private javax.swing.JTextField n43;
    private javax.swing.JTextField n44;
    private javax.swing.JTextField observacion;
    private javax.swing.JTextField referencia;
    // End of variables declaration//GEN-END:variables
}
