package controler;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFScan {
	public static void PDFReader(File file) throws IOException{
		//Adding PDF for Reading.
		PDDocument document = PDDocument.load(file);
		
		//Print Successful PDF Load.
		System.out.println("PDF Loaded");
		
		//Instantiate PDFTextStripper class.
	    PDFTextStripper pdfStripper = new PDFTextStripper();

	    //Retrieving text from PDF document.
	    String text = pdfStripper.getText(document);
	    System.out.println(text);
	    
	    //Defining the value to check within the PDF.
	    String valueToCheck;
		valueToCheck = "viva la pepa";
			
		//Checking inside the PDF Document for the value.
		boolean parsedText = text.contains(valueToCheck);
		if( parsedText == true) {
			System.out.println("el PDF contiene el valor indicado");
		}else {
			System.out.println("No se encontro el valor indicado");
		}
		
	    //Closing the document.
	    document.close();

}
	}
