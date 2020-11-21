package question6;

public class Application {

	public static void main(String[] args) {
		PDFDocument pdf=new PDFDocument("Hello PDF");
		WordDocument word =new WordDocument("Hello word");
		
		Printer.printPDFDocument(pdf);
		Printer.WordDocument(word);
		

	}

}
