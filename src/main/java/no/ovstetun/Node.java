package no.ovstetun;

import java.util.List;
import java.util.ArrayList;

public class Node {
	private String content;
	private List<Node> children;
	
	public Node(String aContent) {
	    content = aContent;
	    children = new ArrayList<Node>();
	}

	public String getContent() {
	    return content;
	}
	public void setContent(final String aContent) {
	    content = aContent;
	}
	
	public List<Node> getChildren() {
	    return children;
	}
	public void addChild(Node node) {
	    children.add(node);
	}
	
	public static Node createNodes() {
	    Node n = new Node("first");
	    
	    Node n2 = new Node("second");
	    n.addChild(n2);
	    
	    Node n3 = new Node("third");
	    n.addChild(n3);
	    
	    return n;
	}
}
