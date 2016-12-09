/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

 
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
 
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
 
public class PruebaPDF1 {
 
    public void ITextHelloWorld() throws Exception{
        Document document = new Document();
        Calendar cal = Calendar.getInstance();
        Date fecha = new Date( cal.getTimeInMillis() );
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 
        String parrafo2 = " "+ formato.format(fecha);
 
        PdfWriter.getInstance(document, new FileOutputStream("recibo.pdf"));
        document.open();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        document.close();
 
    }
 
    public static void main(String args[]){
        try{
            PruebaPDF1 p = new PruebaPDF1();
 
            p.ITextHelloWorld();
 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
