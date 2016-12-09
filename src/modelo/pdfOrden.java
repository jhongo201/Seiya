/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.conexion;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import com.itextpdf.text.PageSize;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class pdfOrden extends conexion{
    private Chunk titulo;
    tiquet nuevoTiquet = new tiquet();
    orden nuevaOrden = new orden();
    
    public String pdf(int tiquet, int idOrden, String codOrden, int numRegTiq){
        try
            {
                
                
                
             
        int id = 0; 
        int numTiquet = 0;
        String ob = "";
        tiquet verTiquet = new tiquet();
        colores verColor = new colores(); 
        String colorUno="";
        String colorDos= "";
        System.out.print("id de la orden en el tiquet:" + idOrden);
        ArrayList<String> lista = new ArrayList<String>();
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0, c12 = 0, c13 = 0, c14 = 0, c15 = 0;
        int c16 = 0, c17 = 0, c18 = 0, c19 = 0, c20 = 0, c21 = 0, c22 = 0, c23 = 0, c24 = 0, c25 = 0, c26 = 0, c27 = 0, c28 = 0, c29 = 0;
        int c30 = 0, c31 = 0, c32 = 0, c33 = 0;
        String observacion ="";
        String verificacion ="";
        
        int idCliente = 0;
        String ciu = "";
        String fecped = "";
        String fecent = "";
        
        for (orden ord : new orden().CargarDatosOrden(codOrden)){
                  idCliente = ord.getCliente();
                  ciu=  ord.getCiudad();
                  fecped = ord.getPedido();
                  fecent = ord.getEntrega();                  
        }
        
        
        //rs.last();
       // int cuantos = rs.getRow();
        //System.out.print("puestos:" + cuantos+ "orden: " + codOrden + "tiquet: " + tiquet);
        //Creamos el CHUNK definiendo su tipo de letra, tamaño…
        Chunk idClient = new Chunk(""+idCliente, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk direccion = new Chunk("Calle 12 # 6-68 Niña Ceci", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Tiq = new Chunk("TK", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValTiq = new Chunk(""+tiquet, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Tel = new Chunk("Tel: 5783364", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Ref = new Chunk("REF", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValRef = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Correo = new Chunk("calzadoseiya@gmail.com", FontFactory.getFont(FontFactory.COURIER_BOLD, 8, Font.NORMAL, BaseColor.BLACK));
        Chunk Cliente = new Chunk("CLIENTE", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk FecEnt = new Chunk("FECHA ENTREGA", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValFecEnt = new Chunk(fecent, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk FecPed = new Chunk("FECHA PEDIDO", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValFecPed = new Chunk(fecped, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk FechaTiq2 = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Orden = new Chunk("ORDEN", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValOrd = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Ciudad = new Chunk("CIUDAD", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValCiudad = new Chunk(ciu, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Cant = new Chunk("CANT.", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Mon = new Chunk("MONTADA", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Emp = new Chunk("EMPLANTILLADA", FontFactory.getFont(FontFactory.COURIER_BOLD, 8, Font.NORMAL, BaseColor.BLACK));
        Chunk OBSER = new Chunk("OBSERVACION", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Col1 = new Chunk("Color 1", FontFactory.getFont(FontFactory.COURIER_BOLD, 8, Font.NORMAL, BaseColor.BLACK));
        Chunk Col2 = new Chunk("Color 2", FontFactory.getFont(FontFactory.COURIER_BOLD, 8, Font.NORMAL, BaseColor.BLACK));
        Chunk Encabezado = new Chunk("SEIYA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 11, Font.NORMAL, BaseColor.BLACK));
        Chunk num21 = new Chunk("21", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num22 = new Chunk("22", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num23 = new Chunk("23", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num24 = new Chunk("24", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num25 = new Chunk("25", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num26 = new Chunk("26", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num27 = new Chunk("27", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num28 = new Chunk("28", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num29 = new Chunk("29", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num30 = new Chunk("30", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num31 = new Chunk("31", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num32 = new Chunk("32", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num33 = new Chunk("33", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num34 = new Chunk("34", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num35 = new Chunk("35", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num36 = new Chunk("36", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num37 = new Chunk("37", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num38 = new Chunk("38", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num39 = new Chunk("39", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num40 = new Chunk("40", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num41 = new Chunk("41", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num42 = new Chunk("42", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num43 = new Chunk("43", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        Chunk num44 = new Chunk("44", FontFactory.getFont(FontFactory.COURIER, 9, Font.NORMAL, BaseColor.BLACK));
        
        
        
        //Fecha actual en formato completo:
        //Tue Sep 23 01:18:48 CEST 2014
        Date fechaActual = new Date();
        
        //Formateando la fecha:
        DateFormat formatoHora = new SimpleDateFormat("HH-mm-ss");
        DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
      //  System.out.println("Fecha: "+formatoFecha.format(fechaActual)+" Son las: "+formatoHora.format(fechaActual));
        String fe =Fecha.format(fechaActual);
        //Directorio destino para las descargas
            File folder = new File("c:\\seiya\\ordenes");

            //Crea el directorio de destino en caso de que no exista
            folder.mkdirs(); 
            
                
        int numeroAleatorio = (int) (Math.random()*2500+1);
        //Nombre del fichero <strong>PDF</strong> Resultante de la ejecucion
        String dir="C:\\seiya\\ordenes\\Orden_"+codOrden +".pdf";
        // El archivo pdf que vamos a generar
        FileOutputStream fileOutputStream = new FileOutputStream(dir);
            Rectangle pageSize = new Rectangle(792f, 612f); //ancho y alto ->tamaño carta
            //Creacion del documento con un tamaño y unos margenes predeterminados
            
            Document document = new Document(pageSize, 1,1,1,1);
            // Obtener la instancia del PdfWriter
            PdfWriter writer =PdfWriter.getInstance(document, fileOutputStream);
         
            //Opens the document.
            //You have to open the document before you can begin to add content to the body of the document.
            document.open();
            //**************************************************************
            
            //Ejemplos de TABLE
            titulo = new Chunk("", FontFactory.getFont(FontFactory.COURIER, 20, Font.UNDERLINE, BaseColor.BLACK));
            document.add(titulo);
            //Añadir tabla 5 columnas
            PdfPTable table = new PdfPTable(40);
            //Añadir CABECERA
            
            PdfPCell cell = new PdfPCell();
            
         
            
            /*table.addCell(createImageCell(IMG1));*/
            cell = new PdfPCell(new Phrase(Tiq));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Orden));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            table.addCell(cell);
            
            
            cell = new PdfPCell(new Phrase(codOrden));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Cliente));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(9);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Ciudad));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(FecPed));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(FecEnt));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Ref));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Cant));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            table.addCell(cell);
            
            
            table.addCell(new Phrase(num21));
            table.addCell(new Phrase(num22));
            table.addCell(new Phrase(num23));
            table.addCell(new Phrase(num24));
            table.addCell(new Phrase(num25));
            table.addCell(new Phrase(num26));
            table.addCell(new Phrase(num27));
            table.addCell(new Phrase(num28));
            table.addCell(new Phrase(num29));
            table.addCell(new Phrase(num30));
            table.addCell(new Phrase(num31));
            table.addCell(new Phrase(num32));
            table.addCell(new Phrase(num33));
            table.addCell(new Phrase(num34));
            table.addCell(new Phrase(num35));
            table.addCell(new Phrase(num36));
            table.addCell(new Phrase(num37));
            table.addCell(new Phrase(num38));
            table.addCell(new Phrase(num39));
            table.addCell(new Phrase(num40));
            table.addCell(new Phrase(num41));
            table.addCell(new Phrase(num42));
            table.addCell(new Phrase(num43));
            
            cell = new PdfPCell(new Phrase(Col1));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Col2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(OBSER));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            cell.setRowspan(1);
            table.addCell(cell);
  /*          
            ArrayList<String> resul;
        resul = nuevoTiquet.CargarComboTiquet(id);//La consulta tiene que retornar un ArrayList
            Iterator<String> tiqIterator = resul.iterator();
        while(tiqIterator.hasNext()){
              String valorTiq = tiqIterator.next();
              
                //System.out.print(valorTiquet+" / ");
               // this.impOrd.imp(valorTiq, idOrden, idCadOrden, numRegTiq );
        }
        
        */
            
            ArrayList<String> resultat;
                resultat=nuevoTiquet.consultarTiquetporOrden(idOrden);
                Iterator<String> tiquetIterator = resultat.iterator();
                
                while(tiquetIterator.hasNext()){
              String valorTiquet = tiquetIterator.next();
                System.out.print(valorTiquet+" ------ ");
                String sql = "Select * from tiquet where idorden = '" + idOrden + "' and tiquet='" + valorTiquet + "'";
            rs = Consultar(sql); 
                
            
            
            while (rs.next()) 
            {
          
            c1 = rs.getInt (1); 
                c2 = rs.getInt (2);
                c3 = rs.getInt (3);
                c4 = rs.getInt (4);
                c5 = rs.getInt (5);
                observacion = rs.getString(6);
                verificacion = rs.getString (7);
                c8 = rs.getInt (8); 
                c9 = rs.getInt (9);
                c10 = rs.getInt (10);
                c11 = rs.getInt (11);
                c12 = rs.getInt (12);
                c13 = rs.getInt (13);
                c14 = rs.getInt (14);
                c15 = rs.getInt (15);
                c16 = rs.getInt (16);
                c17 = rs.getInt (17);
                c18 = rs.getInt (18);
                c19 = rs.getInt (19);
                c20 = rs.getInt (20);
                c21 = rs.getInt (21);
                c22 = rs.getInt (22);
                c23 = rs.getInt (23);
                c24 = rs.getInt (24);
                c25 = rs.getInt (25);
                c26 = rs.getInt (26);
                c27 = rs.getInt (27);
                c28 = rs.getInt (28);
                c29 = rs.getInt (29);
                c30 = rs.getInt (30);
                c31 = rs.getInt (31);
                c32 = rs.getInt (32);
                c33 = rs.getInt (33);
               
                String c01 = " ", c02 = " ", c03 = " ", c04 = " ", c05 = " ", c06 = " ", c07 = " ", c08 = " ", c09 = " ", c010 = " ", c011 = " ", c012 = " ";
                String c013 = " ", c014 = " ", c015 = " ", c016 = " ", c017 = " ", c018 = " ", c019 = " ", c020 = " ", c021 = " ", c022 = " ", c023 = " ", c024 = " ";
                String c025 = " ", c026 = " ", c027 = " ", c028 = " ", c029 = " ", c030 = " ", c031 = " ", c032 = " ", c033 = " ", c034 = " ";
                if(c1!=0) c01 = String.valueOf(c1);
                if(c2!=0) c02 = String.valueOf(c2);
                if(c3!=0) c03 = String.valueOf(c3);
                if(c4!=0) c04 = String.valueOf(c4);
                if(c5!=0) c05 = String.valueOf(c5);
                if(c8!=0) c08 = String.valueOf(c8);
                if(c9!=0) c09 = String.valueOf(c9);
                if(c10!=0) c010 = String.valueOf(c10);
                if(c11!=0) c011 = String.valueOf(c11);
                if(c12!=0) c012 = String.valueOf(c12);
                if(c13!=0) c013 = String.valueOf(c13);
                if(c14!=0) c014 = String.valueOf(c14);
                if(c15!=0) c015 = String.valueOf(c15);
                if(c16!=0) c016 = String.valueOf(c16);
                if(c17!=0) c017 = String.valueOf(c17);
                if(c18!=0) c018 = String.valueOf(c18);
                if(c19!=0) c019 = String.valueOf(c19);
                if(c20!=0) c020 = String.valueOf(c20);
                if(c21!=0) c021 = String.valueOf(c21);
                if(c22!=0) c022 = String.valueOf(c22);
                if(c23!=0) c023 = String.valueOf(c23);
                if(c24!=0) c024 = String.valueOf(c24);
                if(c25!=0) c025 = String.valueOf(c25);
                if(c26!=0) c026 = String.valueOf(c26);
                if(c27!=0) c027 = String.valueOf(c27);
                if(c28!=0) c028 = String.valueOf(c28);
                if(c29!=0) c029 = String.valueOf(c29);
                if(c30!=0) c030 = String.valueOf(c30);
                if(c31!=0) c031 = String.valueOf(c31);
                if(c32!=0) c032 = String.valueOf(c32);
                if(c33!=0) c033 = String.valueOf(c33);
                 
               
               colorUno =verColor.consultarNombreColorUno(c4);
               colorDos =verColor.consultarNombreColorDos(c5);
             //  ob = verTiquet.ConsultaObservacion(tiquet);
               Chunk ValCol1 = new Chunk(colorUno, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
               Chunk ValCol2 = new Chunk(colorDos, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
               Chunk ValObserv = new Chunk(ob, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
                
                
                System.out.print("Color Uno: " + colorUno);
            table.addCell(new Phrase(ValTiq)); 
            table.addCell("2");
            table.addCell("3");
            table.addCell("4");
            table.addCell("5");
            table.addCell("6");
            
            table.addCell("7");
            table.addCell("8");
            table.addCell("9");
            table.addCell("10");
            table.addCell("11");
            table.addCell("12");
            table.addCell("13");
            table.addCell("14");
            table.addCell("15");
            table.addCell("16");
            table.addCell("17");
            table.addCell("18");
            table.addCell("18");
            table.addCell("20");
            table.addCell("21");
            table.addCell("22");
            table.addCell("23");

            
            table.addCell("24");
            table.addCell("25");
            table.addCell("26");
            table.addCell("27");
            table.addCell("28");
            table.addCell("29");
                table.addCell("30");
            table.addCell("31");
            table.addCell("32");
            table.addCell("33");
            table.addCell("34");
            table.addCell("35");
            
            table.addCell("36");
            table.addCell("37");
            table.addCell("38");
            table.addCell("39");
            table.addCell("40");
          
           
                
                
            table.setWidthPercentage(100f);
            table.setHorizontalAlignment(Element.ALIGN_RIGHT);

            document.add(table);
         

            }
        
            }
        
        
        document.close();
    
                
                
                return "exito";
                
                
               
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return "Error al Generar el PDF";
          }
        
        
     }
    
}
