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
import com.itextpdf.text.DocumentException;
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
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static modelo.pruebapdf2.CHUNK;

/**
 *
 * @author Usuario
 */
public class crearPdf extends conexion{
    private Chunk titulo;
    public static final String IMG1 = "logo.png";
    
    public String pdf(int tiquet, int idOrden, String codOrden){
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
        int c30 = 0, c31 = 0, c32 = 0, c33 = 0;
        String observacion ="";
        String verificacion ="";
        //rs.last();
        int cuantos = rs.getRow();
        //System.out.print("puestos:" + cuantos+ "orden: " + codOrden + "tiquet: " + tiquet);
        //Creamos el CHUNK definiendo su tipo de letra, tamaño…
        Chunk direccion = new Chunk("Calle 12 # 6-68 Niña Ceci", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Tiq = new Chunk("Tiquet #", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValTiq = new Chunk(""+tiquet, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Tel = new Chunk("Tel: 5783364", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Ref = new Chunk("Ref", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValRef = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Correo = new Chunk("calzadoseiya@gmail.com", FontFactory.getFont(FontFactory.COURIER_BOLD, 8, Font.NORMAL, BaseColor.BLACK));
        Chunk Par = new Chunk("Pares", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValPar = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk FechaTiq = new Chunk("Fecha", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk FechaTiq2 = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Orden = new Chunk("Orden", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValOrd = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Cor = new Chunk("CORTADA", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Guar = new Chunk("GUARNICION", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
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
            File folder = new File("c:\\seiya\\tiquets");

            //Crea el directorio de destino en caso de que no exista
            folder.mkdirs(); 
            
                
        int numeroAleatorio = (int) (Math.random()*2500+1);
        //Nombre del fichero <strong>PDF</strong> Resultante de la ejecucion
        String dir="C:\\seiya\\tiquets\\Tiquet_"+tiquet +".pdf";
        // El archivo pdf que vamos a generar
        FileOutputStream fileOutputStream = new FileOutputStream(dir);
            Rectangle pageSize = new Rectangle(300f, 792f); //ancho y alto
            //Creacion del documento con un tamaño y unos margenes predeterminados
            
            Document document = new Document(pageSize,1,1,1,1);
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
            PdfPTable table = new PdfPTable(15);
            //Añadir CABECERA
            
            PdfPCell cell = new PdfPCell();
            cell.setColspan(15);
            table.addCell(cell);
            
            Image image = Image.getInstance("logo.png");
        //    String col = "jhon";
            cell = new PdfPCell(image);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(7);
            table.addCell(cell);
            /*
            cell = new PdfPCell(new Phrase("imagen:"));
            cell.setColspan(4);
            cell.setRowspan(7);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            //cell.setBackgroundColor(BaseColor.GRAY);
            table.addCell(cell);
            
            /*table.addCell(createImageCell(IMG1));*/
            cell = new PdfPCell(new Phrase(direccion));
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
               ob = verTiquet.ConsultaObservacion(tiquet);
               Chunk ValCol1 = new Chunk(colorUno, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
               Chunk ValCol2 = new Chunk(colorDos, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
               Chunk ValObserv = new Chunk(ob, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
                
                
                System.out.print("Color Uno: " + colorUno);
            
            
            
            cell = new PdfPCell(new Phrase(Tiq));
            cell.setColspan(3);
            cell.setRowspan(2);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.GRAY);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""+tiquet));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(2);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Tel));
            cell.setColspan(6);
            cell.setRowspan(2);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.CYAN);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(Ref));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(2);
            cell.setRowspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c8));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(3);
            cell.setRowspan(2);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(Correo));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(6);
            cell.setRowspan(2);//para eliminar espacio cabecera reemplazo el 2 por 3
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(Par));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(2);
            cell.setRowspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c9));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setColspan(3);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(FechaTiq));//espacio intermedio cabecera
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(fe));//espacio intermedio cabecera
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Orden));
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
            
            cell = new PdfPCell(new Phrase(Cor));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            cell.setRowspan(1);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(Guar));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(Mon));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(Emp));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(OBSER));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(2);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(ValObserv));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(11);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Col1));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(ValCol1));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(Col2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(ValCol2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
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

            table.addCell(""+c010);
            table.addCell(""+c011);
            table.addCell(""+c012);
            table.addCell(""+c013);
            table.addCell(""+c014);
            table.addCell(""+c015);
            table.addCell(""+c016);
            table.addCell(""+c017);
            table.addCell(""+c018);
            table.addCell(""+c019);
            table.addCell(""+c020);
            table.addCell(""+c021);
            table.addCell(""+c022);
            table.addCell(""+c023);
            table.addCell(""+c024);

            table.addCell(new Phrase(num36));
            table.addCell(new Phrase(num37));
            table.addCell(new Phrase(num38));
            table.addCell(new Phrase(num39));
            table.addCell(new Phrase(num40));
            table.addCell(new Phrase(num41));
            table.addCell(new Phrase(num42));
            table.addCell(new Phrase(num43));
            table.addCell(new Phrase(num44));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
            
            table.addCell(""+c025);
            table.addCell(""+c026);
            table.addCell(""+c027);
            table.addCell(""+c028);
            table.addCell(""+c029);
            table.addCell(""+c030);
            table.addCell(""+c031);
            table.addCell(""+c032);
            table.addCell(""+c033);
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");

            table.setWidthPercentage(100f);
            table.setHorizontalAlignment(Element.ALIGN_RIGHT);

            document.add(table);
            
            
            
           // String cadena="";
            Chunk cadena = null;
            for(int i=1;i<=4;i++){
            //Chunk chunkSeparador =  new Chunk(SEPARADOR);
           // document.add(chunkSeparador);
           // document.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(15);
                if(i==1)cadena=Emp;
                if(i==2)cadena=Mon;
                
                if(i==3){
                    cadena=Guar;
                    
                }
                if(i==4)cadena=Cor;
            
           cell = new PdfPCell(new Phrase("-----------------------------------------------------------------"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(15);
            cell.setRowspan(1);
            tabla.addCell(cell);     
                
            cell = new PdfPCell(new Phrase(Encabezado));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(cadena));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(Tiq));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(""+tiquet));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Par));
            cell.setHorizontalAlignment(Font.BOLD);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(2);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c9));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            
            cell = new PdfPCell(new Phrase(""));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(Ref));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(""+c8));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            tabla.addCell(cell);
            
            
            cell = new PdfPCell(new Phrase(Col1));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(ValCol1));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            tabla.addCell(cell);

            cell = new PdfPCell(new Phrase(Col2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            tabla.addCell(cell);
            cell = new PdfPCell(new Phrase(ValCol2));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            tabla.addCell(cell);
            
            tabla.addCell(new Phrase(num21));
            tabla.addCell(new Phrase(num22));
            tabla.addCell(new Phrase(num23));
            tabla.addCell(new Phrase(num24));
            tabla.addCell(new Phrase(num25));
            tabla.addCell(new Phrase(num26));
            tabla.addCell(new Phrase(num27));
            tabla.addCell(new Phrase(num28));
            tabla.addCell(new Phrase(num29));
            tabla.addCell(new Phrase(num30));
            tabla.addCell(new Phrase(num31));
            tabla.addCell(new Phrase(num32));
            tabla.addCell(new Phrase(num33));
            tabla.addCell(new Phrase(num34));
            tabla.addCell(new Phrase(num35));
            
            
            tabla.addCell(""+c010);
            tabla.addCell(""+c011);
            tabla.addCell(""+c012);
            tabla.addCell(""+c013);
            tabla.addCell(""+c014);
            tabla.addCell(""+c015);
            tabla.addCell(""+c016);
            tabla.addCell(""+c017);
            tabla.addCell(""+c018);
            tabla.addCell(""+c019);
            tabla.addCell(""+c020);
            tabla.addCell(""+c021);
            tabla.addCell(""+c022);
            tabla.addCell(""+c023);
            tabla.addCell(""+c024);

            tabla.addCell(new Phrase(num36));
            tabla.addCell(new Phrase(num37));
            tabla.addCell(new Phrase(num38));
            tabla.addCell(new Phrase(num39));
            tabla.addCell(new Phrase(num40));
            tabla.addCell(new Phrase(num41));
            tabla.addCell(new Phrase(num42));
            tabla.addCell(new Phrase(num43));
            tabla.addCell(new Phrase(num44));
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
            tabla.addCell(" ");
           
            tabla.addCell(""+c025);
            tabla.addCell(""+c026);
            tabla.addCell(""+c027);
            tabla.addCell(""+c028);
            tabla.addCell(""+c029);
            tabla.addCell(""+c030);
            tabla.addCell(""+c031);
            tabla.addCell(""+c032);
            tabla.addCell(""+c033);
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");

           tabla.setWidthPercentage(100f);
            tabla.setHorizontalAlignment(Element.ALIGN_RIGHT);

            document.add(tabla);
            
            }
//FIN Ejemplos de TABLE

            }
        

        
        
        document.close();
    
                
                
                return "exito";
                
                
               
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return "Error al Generar el PDF";
          }
        
        
     }
    
    public static PdfPCell createImageCell(String path) throws DocumentException, IOException {
        Image img = Image.getInstance(path);
        PdfPCell cell = new PdfPCell(img, true);
        return cell;
    }
    
}
   
