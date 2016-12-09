/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Usuario
 */
public class imprimirOrden {
    pdfOrden pdf = new pdfOrden();
    pruebapdf prueba = new pruebapdf();
    
    public void imp(String tiquet, int idOrden, String codOrden, int numRegTiq){
        
     //   System.out.print("\n id orden: " + idOrden +" Orden N° "+codOrden+" tiquet: " +tiquet + " numRegTiq "+numRegTiq+" \n");
        pdfOrden pdf = new pdfOrden();
       int tiq = Integer.parseInt(tiquet);
        pdf.pdf(tiq, idOrden, codOrden, numRegTiq);
        
    }
    
    
    public void impOrden(int idOrden, String codOrden, int numRegTiq){
        
   //     System.out.print("\n id orden: " + idOrden +" Orden N° "+codOrden+" tiquet: " +tiquet + " numRegTiq "+numRegTiq+" \n");
       
        prueba.impOrden(idOrden, codOrden, numRegTiq);
    }
    
}
