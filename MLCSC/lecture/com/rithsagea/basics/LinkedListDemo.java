package com.rithsagea.basics;

public class LinkedListDemo {
	private static class Node {
		
		private String val;
		private Node child;
		
		public Node(String val) {
			this.val = val;
		}
		
		public String getVal() {
			return val;
		}
		
		public Node getChild() {
			return child;
		}
		
		public void setChild(Node node) {
			this.child = node;
		}
	}
	
	public static void iterate(Node node) {
		if(node == null) return;
		
		System.out.printf("Node[%s]\n", node.getVal());
		
		iterate(node.getChild());
	}
	
	public static void main(String[] args) {
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		
		a.setChild(b);
		b.setChild(c);
		c.setChild(d);
		
		iterate(a);
		
		System.out.println();
		
		Node e = new Node("E");
		a.setChild(e);
		e.setChild(b);
		
		iterate(a);
		
		System.out.println();
		
		b.setChild(d);
		
		iterate(a);
	}
}
