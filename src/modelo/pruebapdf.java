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
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Usuario
 */
public class pruebapdf {
    tiquet nuevoTiquet = new tiquet();
    orden nuevaOrden = new orden();
    public boolean impOrden(int idOrden, String codOrden, int numRegTiq){
        try{
            
            int id = 0; 
        int numTiquet = 0;
        String ob = "";
        colores verColor = new colores(); 
        String colorUno="";
        String colorDos= "";
        ArrayList<String> lista = new ArrayList<String>();
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0, c12 = 0, c13 = 0, c14 = 0, c15 = 0;
        int c16 = 0, c17 = 0, c18 = 0, c19 = 0, c20 = 0, c21 = 0, c22 = 0, c23 = 0, c24 = 0, c25 = 0, c26 = 0, c27 = 0, c28 = 0, c29 = 0;
        int c30 = 0, c31 = 0, c32 = 0, c33 = 0;
        String observacion ="";
        int CanTotal=0;
        
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
        String nomCliente = nuevaOrden.ConsultarNombreCliente(idCliente);
        
        Chunk idClient = new Chunk(nomCliente, FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk direccion = new Chunk("Calle 12 # 6-68 Niña Ceci", FontFactory.getFont(FontFactory.COURIER_BOLD, 12, Font.NORMAL, BaseColor.BLACK));
        Chunk Tiq = new Chunk("TK", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValTiq = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Tel = new Chunk("Tel: 5783364", FontFactory.getFont(FontFactory.COURIER_BOLD, 12, Font.NORMAL, BaseColor.BLACK));
        Chunk Ref = new Chunk("REF", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk ValRef = new Chunk("", FontFactory.getFont(FontFactory.COURIER_BOLD, 10, Font.NORMAL, BaseColor.BLACK));
        Chunk Correo = new Chunk("calzadoseiya@gmail.com", FontFactory.getFont(FontFactory.COURIER_BOLD, 12, Font.NORMAL, BaseColor.BLACK));
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
        
        File folder = new File("c:\\seiya\\ordenes");
        folder.mkdirs();    
        String dir="C:\\seiya\\ordenes\\Orden_"+codOrden +".pdf";
        // El archivo pdf que vamos a generar
        FileOutputStream fileOutputStream = new FileOutputStream(dir);
        Rectangle pageSize = new Rectangle(792f, 612f);
        
        Document document = new Document(pageSize, 1,1,1,1);
        PdfWriter writer =PdfWriter.getInstance(document, fileOutputStream);
        document.open();
        
        PdfPTable table = new PdfPTable(40);
        PdfPCell cell = new PdfPCell();
        
            Image image = Image.getInstance("logo.png");
            //    String col = "jhon";
            cell = new PdfPCell(image);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(7);
            cell.setRowspan(7);
            table.addCell(cell);
        
            cell = new PdfPCell(new Phrase(direccion));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(33);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Tel));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(33);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Correo));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(33);
            cell.setRowspan(2);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(" "));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(33);
            cell.setRowspan(1);
            table.addCell(cell);
        
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
            
            cell = new PdfPCell(new Phrase(idClient));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(9);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(Ciudad));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(ValCiudad));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(FecPed));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(ValFecPed));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(4);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(FecEnt));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(3);
            cell.setRowspan(1);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(ValFecEnt));
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
        
        
        
        
        
        ArrayList<String> resultat;
        resultat=nuevoTiquet.consultarTiquetporOrden(idOrden);
        Iterator<String> tiquetIterator = resultat.iterator();
        
        
        while(tiquetIterator.hasNext()){
              
            String valorTiquet = tiquetIterator.next();
            System.out.print(valorTiquet+" ------ ");
            int tiq = Integer.parseInt(valorTiquet);
            ArrayList<tiquet> listaDatosTiquet;
            listaDatosTiquet = nuevoTiquet.conten(idOrden, tiq);//La consulta tiene que retornar un ArrayList

            for (tiquet ord : new tiquet().conten(idOrden, tiq)){  
                System.out.print("Referencia: " + nuevoTiquet.ConsultarReferencia(tiq, idOrden));
                c1 = ord.getTiquet(); 
                c2 = ord.getIdorden();
                observacion = ord.getObservacion();
                c4 = nuevoTiquet.ConsultarReferencia(tiq, idOrden);
                c5 = nuevoTiquet.ConsultarCantidad(tiq, idOrden);
                c8 = ord.getN21(); 
                c9 = ord.getN22();
                c10 = ord.getN23();
                c11 = ord.getN24();
                c12 = ord.getN25();
                c13 = ord.getN26();
                c14 = ord.getN27();
                c15 = ord.getN28();
                c16 = ord.getN29();
                c17 = ord.getN30();
                c18 = ord.getN31();
                c19 = ord.getN32();
                c20 = ord.getN33();
                c21 = ord.getN34();
                c22 = ord.getN35();
                c23 = ord.getN36();
                c24 = ord.getN37();
                c25 = ord.getN38();
                c26 = ord.getN39();
                c27 = ord.getN40();
                c28 = ord.getN41();
                c29 = ord.getN42();
                c30 = ord.getN43();
               
                String c01 = " ", c02 = " ", c03 = " ", c04 = " ", c05 = " ", c06 = " ", c07 = " ", c08 = " ", c09 = " ", c010 = " ", c011 = " ", c012 = " ";
                String c013 = " ", c014 = " ", c015 = " ", c016 = " ", c017 = " ", c018 = " ", c019 = " ", c020 = " ", c021 = " ", c022 = " ", c023 = " ", c024 = " ";
                String c025 = " ", c026 = " ", c027 = " ", c028 = " ", c029 = " ", c030 = " ", c031 = " ", c032 = " ", c033 = " ", c034 = " ";
                if(c1!=0) c01 = String.valueOf(c1);
                if(c2!=0) c02 = String.valueOf(c2);
            //    if(c3!=0) c03 = String.valueOf(c3);
                if(c4!=0) c04 = String.valueOf(c4);
                if(c5!=0){ c05 = String.valueOf(c5); CanTotal+=c5;}
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
                      
                      cell = new PdfPCell(new Phrase(String.valueOf(tiq)));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(2);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      cell = new PdfPCell(new Phrase(c04));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(2);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      cell = new PdfPCell(new Phrase(c05));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(2);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      cell = new PdfPCell(new Phrase(c08));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c09));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c010));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c011));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c012));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c013));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c014));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c015));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c016));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c017));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c018));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c019));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c020));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c021));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c022));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c023));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c024));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c025));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c026));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c027));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c028));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c029));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(c030));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(1);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      colorUno =verColor.consultarNombreColorUno(ord.getIdcoloruno());
                      colorDos =verColor.consultarNombreColorDos(ord.getIdcolordos());
                  //  ob = verTiquet.ConsultaObservacion(tiquet);
                      Chunk ValCol1 = new Chunk(colorUno, FontFactory.getFont(FontFactory.COURIER, 10, Font.NORMAL, BaseColor.BLACK));
                      Chunk ValCol2 = new Chunk(colorDos, FontFactory.getFont(FontFactory.COURIER, 10, Font.NORMAL, BaseColor.BLACK));
                      Chunk ValObserv = new Chunk(ord.getObservacion(), FontFactory.getFont(FontFactory.COURIER, 10, Font.NORMAL, BaseColor.BLACK));

                      cell = new PdfPCell(new Phrase(ValCol1));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(3);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      cell = new PdfPCell(new Phrase(ValCol2));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(3);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      cell = new PdfPCell(new Phrase(ValObserv));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(5);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      
            }
            
        }
                      cell = new PdfPCell(new Phrase("Cantidad Total de Pares Producidos "));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(15);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
                      cell = new PdfPCell(new Phrase(String.valueOf(CanTotal)));
                      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                      cell.setColspan(25);
                      cell.setRowspan(1);
                      table.addCell(cell);
                      
            table.setWidthPercentage(100f);
            table.setHorizontalAlignment(Element.ALIGN_RIGHT);
        document.add(table);
        
        
        document.close();
        
        return true;
        }catch(Exception x){
            return false;
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
