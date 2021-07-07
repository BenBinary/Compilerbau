package aufgabe_2;

/* RegAusdruck.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. RegAusdruck.java */
public class RegAusdruck/*@bgen(jjtree)*/implements RegAusdruckTreeConstants, RegAusdruckConstants {/*@bgen(jjtree)*/
  protected JJTRegAusdruckState jjtree = new JJTRegAusdruckState();

// Parserregeln / Grammatik
// Compilation Unit
// CU -- > 
  final public void cu() throws ParseException {
    trace_call("cu");
    try {

      or();
      jj_consume_token(0);
    } finally {
      trace_return("cu");
    }
}

// OR --> Concat ("|" Concat ) *
  final public Node or() throws ParseException {
    trace_call("or");
    try {
/*@bgen(jjtree) Or */
  ASTOr jjtn000 = new ASTOr(JJTOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtn000.jjtSetFirstToken(getToken(1));
      try {
        concat();
        label_1:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case 7:{
            ;
            break;
            }
          default:
            jj_la1[0] = jj_gen;
            break label_1;
          }
          jj_consume_token(7);
          concat();
        }
      } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
      } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtn000.jjtSetLastToken(getToken(0));
          }
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("or");
    }
}

// Concat --> Star (Star)*
  final public void concat() throws ParseException {
    trace_call("concat");
    try {
/*@bgen(jjtree) Concat */
  ASTConcat jjtn000 = new ASTConcat(JJTCONCAT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtn000.jjtSetFirstToken(getToken(1));
      try {
        star();
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case Char:
          case Empty:
          case EmptySet:
          case 4:{
            ;
            break;
            }
          default:
            jj_la1[1] = jj_gen;
            break label_2;
          }
          star();
        }
      } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
      } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtn000.jjtSetLastToken(getToken(0));
          }
      }
    } finally {
      trace_return("concat");
    }
}

// Star --> Atom ("*")*		Bspl. a**
  final public void star() throws ParseException {
    trace_call("star");
    try {
/*@bgen(jjtree) Star */
  ASTStar jjtn000 = new ASTStar(JJTSTAR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtn000.jjtSetFirstToken(getToken(1));
      try {
        atom();
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case 6:{
            ;
            break;
            }
          default:
            jj_la1[2] = jj_gen;
            break label_3;
          }
          jj_consume_token(6);
        }
      } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
      } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtn000.jjtSetLastToken(getToken(0));
          }
      }
    } finally {
      trace_return("star");
    }
}

// Atom --> <Char> | <Empty> | <EmptySet> | "(" Or ")"
  final public void atom() throws ParseException {
    trace_call("atom");
    try {
/*@bgen(jjtree) Atom */
  ASTAtom jjtn000 = new ASTAtom(JJTATOM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtn000.jjtSetFirstToken(getToken(1));
      try {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Char:{
          jj_consume_token(Char);
          break;
          }
        case Empty:{
          jj_consume_token(Empty);
          break;
          }
        case EmptySet:{
          jj_consume_token(EmptySet);
          break;
          }
        case 4:{
          jj_consume_token(4);
          or();
          jj_consume_token(5);
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
      } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtn000.jjtSetLastToken(getToken(0));
          }
      }
    } finally {
      trace_return("atom");
    }
}

  /** Generated Token Manager. */
  public RegAusdruckTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[4];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x80,0x1e,0x40,0x1e,};
	}

  {
      enable_tracing();
  }
  /** Constructor with InputStream. */
  public RegAusdruck(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public RegAusdruck(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new RegAusdruckTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public RegAusdruck(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new RegAusdruckTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new RegAusdruckTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public RegAusdruck(RegAusdruckTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RegAusdruckTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   trace_token(token, "");
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	   trace_token(token, " (in getNextToken)");
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[8];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 4; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 8; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  private int trace_indent = 0;
/** Enable tracing. */
  final public void enable_tracing() {
	 trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
	 trace_enabled = false;
  }

  protected void trace_call(String s) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.println("Call:	" + s);
	 }
	 trace_indent = trace_indent + 2;
  }

  protected void trace_return(String s) {
	 trace_indent = trace_indent - 2;
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.println("Return: " + s);
	 }
  }

  protected void trace_token(Token t, String where) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.print("Consumed token: <" + tokenImage[t.kind]);
	   if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
		 System.out.print(": \"" + TokenMgrError.addEscapes(t.image) + "\"");
	   }
	   System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
	 }
  }

  protected void trace_scan(Token t1, int t2) {
	 if (trace_enabled) {
	   for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
	   System.out.print("Visited token: <" + tokenImage[t1.kind]);
	   if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
		 System.out.print(": \"" + TokenMgrError.addEscapes(t1.image) + "\"");
	   }
	   System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
	 }
  }

}
