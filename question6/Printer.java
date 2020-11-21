package question6;

public class Printer {

	
	 public static void printPDFDocument(PDFDocument pdf){
		 System.out.print(pdf.getBody());
		 
	    }
	 
	 public static void WordDocument(WordDocument word){
		 System.out.print(word.getBody());
		 
	    }
/*
 * 
 * Static Fonksiyon kullanmamızın nedeni:Nesnelerden bağımsızdır ve referans olmadan erişebiliriz.
 */
}
