package no.ovstetun;

import java.util.List;
import java.util.ArrayList;

public class Node {
	private String content;
	private List<Node> children = new ArrayList<Node>();

    public Node() {
        content = "first";
        children.add(new Node("second"));
        children.add(new Node("third"));
    }

	public Node(String aContent) {
        content = aContent;
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
}
