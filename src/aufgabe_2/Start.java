package aufgabe_2;

import java.io.IOException;
import java.io.StringReader;

public class Start {

	public static void main(String[] args) throws IOException {
		
		// Starting the parser
		RegAusdruck parser = new RegAusdruck(new StringReader("(ab|c*"));
		
		try {
			
			parser.cu();
			
		} catch (ParseException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("An error occured during parsing");
			
		}
		
		System.out.println("running succesfull");
		
		

	}

}
