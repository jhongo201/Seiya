/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.FileOutputStream;
 
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * @author Walter Herrera.
 * 
 * Código de ejemplo, que muestra como crear un archivo PDF simple.
 */
public class Ejemplo1 {
 
 /**
  * Raíz.
  */
 public static void main(String[] args) {
  //Creamos la representación de una página, con un tamaño
  //por defecto.
     
     
  Rectangle pagina = new Rectangle(PageSize.LETTER);  
   
  //Establecemos el color de la página y reescribimos la función
  //toString de la clase BaseColor para obtener el nombre del color.

   
   // Creamos un documento y le pasamos como parametro un objeto de
   // tipo Rectangle, dicho objeto contiene las especificaciones
   // de como se vera nuestra página.
  Document documento = new Document(pagina);
 
  try {
    
   // Obtenemos una instancia de un objeto PDFWriter
   PdfWriter.getInstance(documento, new FileOutputStream(
     "Ejemplo1.pdf"));
   documento.open();
    
   // Generamos nuestro contenido.
   String contenido = "Generación de un PDF simple:\n "
     + "\t\tAncho de página: "
     + documento.getPageSize().getWidth()
     + "\n\t\tAlto de página: "
     + documento.getPageSize().getHeight()
     + "\n\t\tColor de página: ";
 
   // Lo agregamos al documento por medio de una instancia
   // de un obtjeto Paragraph.
   //
   documento.add(new Paragraph(contenido));
    
   // Cerramos el documento para hacer persistente el contenido.
   documento.close();
    
  } catch (DocumentException ex) {
   // Atrapamos excepciones concernientes al documento.
  } catch (java.io.IOException ex) {
   // Atrapamos excepciones concernientes al I/O.
  }
 }
}
