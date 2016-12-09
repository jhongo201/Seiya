
package modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
/**
 *
 * @author Usuario
 */import java.io.FileOutputStream;
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
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import conexion.conexion;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class pdf extends conexion{
    
    String color = "";
    //Fecha actual en formato completo:
        //Tue Sep 23 01:18:48 CEST 2014
        Date fechaActual = new Date();
        //Formateando la fecha:
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
       // System.out.println("Son las: "+formatoFecha.format(fechaActual));
    public int consultarIdColor(String nomColor) throws SQLException{
        String sql = "Select * from color where nombre = '" + nomColor + "'";
        rs = Consultar(sql);      
        int id = 0;
        System.out.print("Nombre del Color " + nomColor);
        color = nomColor;
        while (rs.next()) 
            { 
                System.out.println (id = rs.getInt (1)); 
            }
        return id;
    }
    
 public static final int numeroAleatorio = (int) (Math.random()*25+1);
 
//public static final String c=Integer.parseInt(numeroAleatorio);
 
// no se pudo crear la carpeta de destino
//Nombre del fichero <strong>PDF</strong> Resultante de la ejecucion
public static final String RESULT = "C:\\seiya\\ordenes\\ORDEN_PEDIDO_"+".pdf";
//Titulos

//Textos

public void main () {
try
{
   System.out.print("estoy en el pdf");         //Directorio destino para las descargas
File folder = new File("c:\\seiya\\ordenes");
 
//Crea el directorio de destino en caso de que no exista
folder.mkdirs(); 
        
        
//Creacion del documento con un tamaño y unos margenes predeterminados
Document document = new Document(PageSize.A4, 50, 50, 50, 50);
 
//A DocWriter class for PDF con Java.
//When this PdfWriter is added to a certain PdfDocument,
//the <strong>PDF</strong> representation of every Element added to this Document will be written to the outputstream.
PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));
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
//Añadir CABECERA


PdfPCell cell;
Image image = Image.getInstance("logo/logo.png");
String col = "jhon";
cell = new PdfPCell(image);
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(4);
cell.setRowspan(6);
//cell.setBackgroundColor(BaseColor.GREEN);
        table.addCell(cell);


cell = new PdfPCell(new Phrase("Calle 12 # 6-68 Niña Ceci"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(6);
cell.setRowspan(2);
//cell.setBackgroundColor(BaseColor.BLUE);
table.addCell(cell);
cell = new PdfPCell(new Phrase("TIKET #:"));
cell.setColspan(2);
cell.setRowspan(2);
cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//cell.setBackgroundColor(BaseColor.GRAY);
table.addCell(cell);
cell = new PdfPCell(new Phrase(col));
cell.setColspan(3);
cell.setRowspan(2);
cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//cell.setBackgroundColor(BaseColor.ORANGE);
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
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//cell.setBackgroundColor(BaseColor.ORANGE);
cell.setColspan(3);
cell.setRowspan(2);
table.addCell(cell);

cell = new PdfPCell(new Phrase("calzadoseiya@gmail.com"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(6);
cell.setRowspan(2);
table.addCell(cell);
cell = new PdfPCell(new Phrase("PARES:"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//cell.setBackgroundColor(BaseColor.ORANGE);
cell.setColspan(2);
cell.setRowspan(2);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//cell.setBackgroundColor(BaseColor.ORANGE);
cell.setColspan(3);
cell.setRowspan(2);
table.addCell(cell);

cell = new PdfPCell(new Phrase("CORTADA"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(4);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(6);
cell.setRowspan(1);
table.addCell(cell);
cell = new PdfPCell(new Phrase("ORDEN:"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//cell.setBackgroundColor(BaseColor.ORANGE);
cell.setColspan(2);
cell.setRowspan(1);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//cell.setBackgroundColor(BaseColor.ORANGE);
cell.setColspan(3);
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

table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");

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
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");
table.addCell(" ");

cell = new PdfPCell(new Phrase("COLOR 1:"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(3);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(12);
table.addCell(cell);

cell = new PdfPCell(new Phrase("COLOR 2:"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(3);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(12);
table.addCell(cell);

cell = new PdfPCell(new Phrase("OBSERVACION"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(4);
cell.setRowspan(2);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(11);
cell.setRowspan(2);
table.addCell(cell);

cell = new PdfPCell(new Phrase("VERIFICACION"));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(4);
cell.setRowspan(2);
table.addCell(cell);
cell = new PdfPCell(new Phrase(""));
cell.setHorizontalAlignment(Element.ALIGN_CENTER);
cell.setColspan(11);
cell.setRowspan(2);
table.addCell(cell);

document.add(table);

//FIN Ejemplos de TABLE
//**************************************************************

//**************************************************************
// Cierre del documento
document.close();
} catch (Exception ex) {
System.out.println(ex.getMessage());
}
}
 
}

