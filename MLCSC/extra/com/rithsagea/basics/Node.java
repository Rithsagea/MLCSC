package com.rithsagea.basics;

public class Node {
	
	private int val;
	private Node child;
	
	public Node(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public Node getChild() {
		return child;
	}
	
	public void setChild(Node child) {
		this.child = child;
	}
}
