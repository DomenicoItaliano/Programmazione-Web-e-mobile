package util;

import java.io.File;

import java.io.FileOutputStream;

import java.io.OutputStream;
import java.util.Calendar;
import java.util.List;


import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.item.Item;





public class InvoiceManagement {
	public static boolean createInvoice(String path,Customer c,double amount, List<Item>items, int number){
		Calendar cal = Calendar.getInstance();
		int currentday   = cal.get(Calendar.DATE);
		int currentmonth = cal.get(Calendar.MONTH) ;
        int currentyear = cal.get(Calendar.YEAR);
		
		
		String path1=path+"\\WebContent\\File\\Invoices\\";
		path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\", "");
		path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "");
		
		try{
		
			 PdfReader reader = new PdfReader(path+"InvoiceTemplate.pdf");	
			 OutputStream os = new FileOutputStream(path+"Invoice"+number+currentyear+".pdf");
			 PdfStamper stamper = new PdfStamper(reader, os);
			 PdfContentByte  over;
		     BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
             over = stamper.getOverContent(1);
           
             over.beginText();
           
             //Nome e Cognome
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(390, 788);
             over.showText(c.getName()+" "+ c.getSurname());
             
            
             //Indirizzo
            
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(390, 767);
             over.showText("Fimmanò st.");
             
             
             //Telefono
             
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(390, 745);
            
             over.showText("+39 380 686595");
            
            
            
             
           //Tipo di Documento
             
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(93, 620);
             over.showText("Invoice");
            
            
             //NumeroFattura
           
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(182, 620);
             over.showText(Integer.toString(number));
             
             
             //Data
         
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(273, 620);
             over.showText(Integer.toString(currentday)+"/"+Integer.toString(currentmonth+1)+"/"+Integer.toString(currentyear));
             
             
           //TotaleComplessivo
             
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(480, 244);
             String grossAmount=Double.toString(amount);
         
             
             
             over.showText(grossAmount+"ï¿½");
           
             
           
            
             
             
             //CostoFinale
          
             over.setFontAndSize(bf, 8);
             over.setTextMatrix(480, 214);
             over.showText(Double.toString(amount)+"ï¿½");
            
             
             
             //elenco di tutti i prodotti
             
    		
    		
    		
    		 for(int i=0;i<items.size();i++){
    		 
    			 Item p=items.get(i);
    			
    			 //DESCRIZIONE
    			 over.setFontAndSize(bf, 8);
    			 over.setTextMatrix(110, 580-i*15);
                 over.showText(p.getName());
    			 
               //Prezzo
    			 over.setFontAndSize(bf, 8);
    			 over.setTextMatrix(255, 580-i*15);
    			 String Prz=Double.toString(p.getPrice());
                 over.showText(Prz);
                 
               //Quantitità
    			 over.setFontAndSize(bf, 8);
    			 over.setTextMatrix(344, 580-i*15);
    			 String quant=Integer.toString(p.getStockQuantity());
                 over.showText(quant);
                 
               //Iva
    			 over.setFontAndSize(bf, 8);
    			 over.setTextMatrix(413, 580-i*15);
                 over.showText("10%");
               
                 //Importo
    			 over.setFontAndSize(bf, 8);
    			 double imp=(double)(Math.round(p.getPrice()*p.getStockQuantity()*100))/100;
    			 String imp2=Double.toString(imp);
    			 over.setTextMatrix(485, 580-i*15);
                 over.showText(imp2);
    			 
    			 }
    			 
    		 
    		 
    		 
          
              over.endText();
             stamper.close();
           
           
             //Salvataggio nel DataBase
    		 File file= new File(path+"Invoice"+number+currentyear+".pdf");
    		
    		
    		 //InvioEmail
    		 
    		//Potrebbe non mandare l'email ma comunque il resto funziona per cui va bene
    		 return true; 
		}
		
		catch(Exception e){
			
			e.printStackTrace();
			return false;}
		
		
		
		
		
		
		
		
	}
}
