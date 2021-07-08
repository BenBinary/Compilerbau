package basicScriptCompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Start {
	
	public static void main(String[] args) {
		
		File file = new File("src/hello.scrt");
		
		
		try {
			
			
			FileInputStream fis = new FileInputStream(file);
			BasicScript parser = new BasicScript(fis);
			
			parser.cu();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
