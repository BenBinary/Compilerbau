package aufgabe_1;

public class Token {
	
	public enum Type { 
		MINUS, 
		PLUS, 
		DIVIDE, 
		TIMES,
		NUMBER,
		VARIBALE,
		EXPONENT,
		Empty,
		EOF
		
	};
	
	public Type kind;
	public String content;
	int index;
	int line, column;

}
