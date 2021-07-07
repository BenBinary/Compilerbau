package aufgabe_2;

public interface Node {

	void jjtSetParent(Node n);

	void jjtAddChild(Node c, int num);

	void jjtClose();

	void jjtOpen();

}
