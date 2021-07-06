package aufgabe_1;

import aufgabe_1.Token.Type;

public class Parser {
	
	Lexer lexer;

	public Parser(Lexer lexer) {
		
		this.lexer = lexer;
		
	}
	
	public boolean compileUnit() {
		
		
		boolean result = false;
		Token t = lexer.getToken();
		
		while (!isEOF(t)) {
			
			if (this.checkNumber(t)) {
				
				if (this.checkOperator(t)) {
					
					if (this.checkNumber(t)) {
						
						result = true;
					}
				} 
			} 
			
		}
		
		return result;
		
	}
	
	/**
	 * 
	 * @param token
	 */
	private void matchToken(Token token) {
		
		if (lexer.getToken().kind == token.kind) {
			
			lexer.getNextChar();
			
		}

	}
	
	
	private boolean checkNumber(Token t) {
		
		boolean result = false;
		
			if (t.kind == Type.NUMBER || t.kind == Type.VARIBALE) {
				
				// Rekursiv um weitere Elemente zu ermitteln
				t = lexer.getToken();
				// if (t.kind == Type.NUMBER || t.kind == Type.VARIBALE) {
					this.checkNumber(t);
				// }
				
				return true;
				
			} else {
				
				return false;
				
			}

	}
	
	
	private boolean checkOperator(Token t) {
		
		if (t.kind == Type.PLUS || t.kind == Type.DIVIDE || 
				t.kind == Type.MINUS || t.kind == Type.TIMES) {
			
			// Rekursiv um weitere Elemente zu ermitteln
			t = lexer.getToken();
	
			this.checkOperator(t);
			
			return true;	
			
		} else {
			return false;
		}
		
	}
	
	private boolean isEOF(Token t) {
		
		if (t.kind == Type.EOF) {
			
			System.exit(0);
			return true;
		} else {
			return false;	
		}
		
	}
	
}
