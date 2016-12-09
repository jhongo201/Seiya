/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import Vistas.Color;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.conexion;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static modelo.pdf.RESULT;
import static modelo.pruebapdf2.PARAGRAPH;
import static modelo.pruebapdf2.SEPARADOR;

/**
 *
 * @author Usuario
 */
public class plantillaPDF extends conexion{
    private Chunk titulo;
    
    public void pdf(int tiquet, int idOrden, String codOrden){
        try
            {
                
        String sql = "Select * from tiquet where idorden = '" + idOrden + "' and tiquet='" + tiquet + "'";
        rs = Consultar(sql);      
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
        int c30 = 0, c31 = 0, c32 = 0;
        //rs.last();
        int cuantos = rs.getRow();
        //System.out.print("puestos:" + cuantos+ "orden: " + codOrden + "tiquet: " + tiquet);
        
        
        //Fecha actual en formato completo:
        //Tue Sep 23 01:18:48 CEST 2014
        Date fechaActual = new Date();
       // System.out.println(fechaActual);
       // System.out.println("---------------------------------------------");
        
        //Formateando la fecha:
        DateFormat formatoHora = new SimpleDateFormat("HH-mm-ss");
        DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
      //  System.out.println("Fecha: "+formatoFecha.format(fechaActual)+" Son las: "+formatoHora.format(fechaActual));
        
        //Directorio destino para las descargas
            File folder = new File("c:\\seiya\\tiquets");

            //Crea el directorio de destino en caso de que no exista
            folder.mkdirs(); 
            String fe =Fecha.format(fechaActual);
                
        int numeroAleatorio = (int) (Math.random()*2500+1);
        //Nombre del fichero <strong>PDF</strong> Resultante de la ejecucion
        String dir="C:\\seiya\\tiquets\\Tiquet_"+tiquet +".pdf";;
        // El archivo pdf que vamos a generar
        FileOutputStream fileOutputStream = new FileOutputStream(dir);
 
            


            //Creacion del documento con un tamaño y unos margenes predeterminados
            Document document = new Document(PageSize.LETTER, 10, 10, 10, 1);

            //A DocWriter class for PDF con Java.
            //When this PdfWriter is added to a certain PdfDocument,
            //the <strong>PDF</strong> representation of every Element added to this Document will be written to the outputstream.
            //PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));
            // Obtener la instancia del PdfWriter
            PdfWriter writer =PdfWriter.getInstance(document, fileOutputStream);
            //LEADING = separacion entre lineas del documento
            writer.setInitialLeading(16);
            Rectangle rct = new Rectangle(36, 54, 559, 788);
            //Definimos un nombre y un tamaño para el PageBox los nombres posibles son: “crop”, “trim”, “art” and “bleed”.
            writer.setBoxSize("art", rct);
            //Opens the document.
            //You have to open the document before you can begin to add content to the body of the document.
            document.open();
            //**************************************************************
            //Ejemplos de TABLE

            //Añadir tabla 15 columnas
            PdfPTable table = new PdfPTable(15);
         //   PdfPTable tabla = new PdfPTable(15);
            PdfPCell celda;
            //Añadir CABECERA


            PdfPCell cell;
            Image image = Image.getInstance("logo/logo.png");
        //    String col = "jhon";
            cell = new PdfPCell(image);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(7);
            table.addCell(cell);


            cell = new PdfPCell(new Phrase("Calle 12 # 6-68 Niña Ceci"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(6);
            cell.setRowspan(2);
        
            table.addCell(cell);
        
        
        
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
                
                
                
               
               colorUno =verColor.consultarNombreColorUno(c4);
               colorDos =verColor.consultarNombreColorDos(c5);
               ob = verTiquet.ConsultaObservacion(tiquet);
                
                
                
                System.out.print("Color Uno: " + colorUno);
        
            //cell.setBackgroundColor(BaseColor.BLUE);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("TIKET #:"));
            cell.setColspan(2);
            cell.setRowspan(2);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            //cell.setBackgroundColor(BaseColor.GRAY);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""+tiquet));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(3);
            cell.setRowspan(2);
            table.addCell(cell);
            //Añadir dos filas de celdas sin formato

            cell = new PdfPCell(new Phrase("Tel: 5783364"));
            cell.setColspan(6);
            cell.setRowspan(2);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.CYAN);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("REF:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(2);
            cell.setRowspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c6));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(3);
            cell.setRowspan(2);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("calzadoseiya@gmail.com"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(6);
            cell.setRowspan(2);//para eliminar espacio cabecera reemplazo el 2 por 3
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("PARES:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(2);
            cell.setRowspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c7));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(3);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("FECHA"));//espacio intermedio cabecera
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(fe));//espacio intermedio cabecera
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("ORDEN:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(2);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""+codOrden));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("CORTADA"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            cell.setRowspan(1);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("GUARNICION"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("MONTADA"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("EMPLANTILLADA"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase("COLOR 1:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(colorUno));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("COLOR 2:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(colorDos));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("OBSERVACION"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(ob));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            cell.setRowspan(2);
            table.addCell(cell);

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

            table.addCell(" "+c8);
            table.addCell(" "+c9);
            table.addCell(" "+c10);
            table.addCell(" "+c11);
            table.addCell(" "+c12);
            table.addCell(" "+c13);
            table.addCell(" "+c14);
            table.addCell(" "+c15);
            table.addCell(" "+c16);
            table.addCell(" "+c17);
            table.addCell(" "+c18);
            table.addCell(" "+c19);
            table.addCell(" "+c20);
            table.addCell(" "+c21);
            table.addCell(" "+c22);

            table.addCell("36");
            table.addCell("37");
            table.addCell("38");
            table.addCell("39");
            table.addCell("40");
            table.addCell("41");
            table.addCell("42");
            table.addCell("43");
            table.addCell("44");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            
            table.addCell(" "+c23);
            table.addCell(" "+c24);
            table.addCell(" "+c25);
            table.addCell(" "+c26);
            table.addCell(" "+c27);
            table.addCell(" "+c28);
            table.addCell(" "+c29);
            table.addCell(" "+c30);
            table.addCell(" "+c31);
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");

            

            
            document.add(table);
            String cadena="";
            for(int i=1;i<=4;i++){
            //Chunk chunkSeparador =  new Chunk(SEPARADOR);
           // document.add(chunkSeparador);
           // document.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(15);
                if(i==1)cadena="EMPLANTILLADA";
                if(i==2)cadena="MONTADA";
                
                if(i==3){
                    cadena="GUARNICION";
                    
                }
                if(i==4)cadena="CORTADA";
            
           cell = new PdfPCell(new Phrase("------------------------------------------------------------------------"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(15);
            cell.setRowspan(1);
            tabla.addCell(cell);     
                
            cell = new PdfPCell(new Phrase("CALZADO SEIYA"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(cadena));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("TIQUET #"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(""+tiquet));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            
            cell = new PdfPCell(new Phrase("PARES:"));
            cell.setHorizontalAlignment(Font.BOLD);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c7));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase("REF:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c6));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            
            
            cell = new PdfPCell(new Phrase("COLOR 1:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(colorUno));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            tabla.addCell(cell);

            cell = new PdfPCell(new Phrase("COLOR 2:"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(colorDos));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            tabla.addCell(cell);
            
            tabla.addCell("21");
            tabla.addCell("22");
            tabla.addCell("23");
            tabla.addCell("24");
            tabla.addCell("25");
            tabla.addCell("26");
            tabla.addCell("27");
            tabla.addCell("28");
            tabla.addCell("29");
            tabla.addCell("30");
            tabla.addCell("31");
            tabla.addCell("32");
            tabla.addCell("33");
            tabla.addCell("34");
            tabla.addCell("35");
            
            
            tabla.addCell(" "+c8);
            tabla.addCell(" "+c9);
            tabla.addCell(" "+c10);
            tabla.addCell(" "+c11);
            tabla.addCell(" "+c12);
            tabla.addCell(" "+c13);
            tabla.addCell(" "+c14);
            tabla.addCell(" "+c15);
            tabla.addCell(" "+c16);
            tabla.addCell(" "+c17);
            tabla.addCell(" ");
            tabla.addCell(" "+c20);
            tabla.addCell(" "+c21);
            tabla.addCell(" "+c22);
            tabla.addCell(" "+c23);

            tabla.addCell("36");
            tabla.addCell("37");
            tabla.addCell("38");
            tabla.addCell("39");
            tabla.addCell("40");
            tabla.addCell("41");
            tabla.addCell("42");
            tabla.addCell("43");
            tabla.addCell("44");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
           
            tabla.addCell(" "+c24);
            tabla.addCell(" "+c25);
            tabla.addCell(" "+c26);
            tabla.addCell(" "+c27);
            tabla.addCell(" "+c28);
            tabla.addCell(" "+c29);
            tabla.addCell(" "+c30);
            tabla.addCell(" "+c31);
            tabla.addCell(" "+c32);
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");

            

            document.add(tabla);
            
            }
            
            //document.add(new Paragraph(new Date().toString()));
            //FIN Ejemplos de TABLE
            //**************************************************************

            //**************************************************************
            // Cierre del documento
            document.close();
            }
    
                
                
                
                
                
               
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
          }
     }
    }
   
