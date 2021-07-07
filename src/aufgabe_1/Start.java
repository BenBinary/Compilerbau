package aufgabe_1;

public class Start {
	
	public static void main(String[] args) {
		
		Start s = new Start();
		s.ueberpruefe("5+x ");
	
	
	
	}
	
	
	public boolean ueberpruefe(String ausdruck) {
		
		Lexer lexer = new Lexer(ausdruck);
		Parser parser = new Parser(lexer);
		
		if (parser.compileUnit()) {
			
			System.out.println("Ausdruck ist korrekt");
			
		} else {
			
			System.out.println("Ausdruck ist NICHT korrekt");
			
		}
		
		
		
		return true;
		
	}

}
