package aufgabe_2;

/* Generated By:JJTree: Do not edit this line. ASTAtom.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAtom extends SimpleNode {
	
	/* 
	 * Klasse ASTAtom lässt sich erweitern
	 * 
	 * Attribut inhalt wird nicht geändert.
	 * 
	 * 
	 * Ideal für:
	 *  - semantische Analyse
	 *  - verschiedene Methoden schreiben
	 *  - durch den Baum durchlaufen
	 * 
	 *  */
	
	Token inhalt;
	
	
  public ASTAtom(int id) {
    super(id);
  }

  public ASTAtom(RegAusdruck p, int id) {
    super(p, id);
  }

public void jjtSetLastToken(Token token) {
	// TODO Auto-generated method stub
	
}

public void jjtSetFirstToken(Token token) {
	// TODO Auto-generated method stub
	
}

}
/* JavaCC - OriginalChecksum=3fbf6841c879f383f969b2b977330e25 (do not edit this line) */
