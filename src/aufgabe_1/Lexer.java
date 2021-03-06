package aufgabe_1;

import aufgabe_1.Token.Type;

public class Lexer {

	int lookahed;
	String data;
	int status;

	public Lexer(String data) {

		this.data = data;
		this.lookahed = 0;
		this.status = 0;

	}

	/**
	 * Is getting the next Element out of the stream
	 * 
	 * @return
	 */
	public char getNextChar() {

		if (lookahed <= data.length()) {

			char c = data.charAt(lookahed);

			lookahed++;

			return c;

		}

		return ' ';

	}

	private char getChar() {

		return data.charAt(this.lookahed);

	}

	private boolean isDigit(char c) {

		// System.out.println("isDigit");

		int x = Integer.parseInt(Character.toString(c));

		if (x >= 0 && x <= 9) {

			// System.out.println("Number approved");

			return true;
		} else {
			return false;
		}

	}

	public Token getToken() {

		Token token = new Token();
		Type type;

		char c = this.getChar();

		switch (c) {

		case 'x': 
			token.kind = Type.VARIBALE;
			break;
		case '+':
			token.kind = Type.PLUS;
			status = 0;
			break;
		case '-':
			token.kind = Type.MINUS;
			status = 0;
			break;
		case '/':
			token.kind = Type.DIVIDE;
			status = 0;
			break;
		case '*':
			token.kind = Type.TIMES;
			status = 0;
			break;
		case '^':
			token.kind = Type.EXPONENT;
			status = 2;
			break;
		case ' ':
			token.kind = Type.Empty;
			break;
		default:
			if (isDigit(c))
				token.kind = Type.NUMBER;
			break;
		}

		/*
		 * switch (status) {
		 * 
		 * // Anfang einer Zeile, es muss eine Zahl stehen 
		 * case 0: if (c == 'x') {
		 * token.kind = Type.VARIBALE; status = 1; break; }
		 * else if (isDigit(c)) {
		 * token.kind = Type.NUMBER; status = 1; break; }
		 *  break;
		 * 
		 * // Nach Zahl, kann ein Operator stehen case 1:
		 * 
		 * switch (c) {
		 * 
		 * case '+': token.kind = Type.PLUS; 
		 * 
		 * status = 0; break; 
		 * case '-': token.kind = * Type.MINUS; 
		 * 
		 * status = 0; break;
		 * case '/': token.kind = Type.DIVIDE; 
		 * status = * 0; break; case '*': token.kind = Type.TIMES; 
		 * 
		 * status = 0; break; case '^': * token.kind = Type.EXPONENT; 
		 * 
		 * status = 2; break; default:
		 * 
		 * if (isDigit(c))
		 * token.kind = Type.NUMBER; break; }
		 * 
		 * case 2: if (c == ' ') { token.kind = Type.Empty; }
		 * 
		 * default: token.kind = Type.EOF; break; }
		 */

		return token;

	}

}
