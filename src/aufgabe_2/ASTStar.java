/* Generated By:JJTree: Do not edit this line. ASTStar.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package aufgabe_2;

public
class ASTStar extends SimpleNode {
  public ASTStar(int id) {
    super(id);
  }

  public ASTStar(RegAusdruck p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(RegAusdruckVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a493d8e8f64956f1c16c7349633a7888 (do not edit this line) */
