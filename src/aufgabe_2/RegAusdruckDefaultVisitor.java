/* Generated By:JavaCC: Do not edit this line. RegAusdruckDefaultVisitor.java Version 7.0.10 */
package aufgabe_2;

public class RegAusdruckDefaultVisitor implements RegAusdruckVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTOr node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTConcat node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStar node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAtom node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=30d822f3d44cebb90dba2cbbc0984b04 (do not edit this line) */
