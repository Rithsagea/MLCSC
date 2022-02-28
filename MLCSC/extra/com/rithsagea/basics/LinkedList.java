package com.rithsagea.basics;

/**
 * 
 * Skeleton Linked List Class
 * 
 * The root node should have a value of -1
 * all actual stored values should begin at
 * the root's child
 * 
 * @author Rithsagea
 *
 */
public class LinkedList {
	
	/**
	 * Adds an element to the list
	 * @param val the value of the element to add
	 */
	public void add(int value) {
		//TODO
	}
	
	/**
	 * Gets the size of the list
	 * @return the size of the list
	 */
	public int size() {
		return -1; //TODO
	}
	
	/**
	 * Gets an element from the list
	 * @param index the index of the element to get
	 * @return the value of the element
	 */
	public int get(int index) {
		return -1; //TODO
	}
	
	/**
	 * Removes an element from the list
	 * @param index the index of the element to remove
	 * @return the value of the removed element
	 */
	public int remove(int index) {
		return -1; // TODO
	}
	
	/**
	 * Inserts an element at the given index
	 * @param value the value of the element to insert
	 * @param index the index at which to insert
	 */
	public void insert(int value, int index) {
		//TODO
	}
	
	//////////////////////////////////
	// DO NOT MODIFY THE CODE BELOW //
	//////////////////////////////////
	
	private Node root;
	
	public LinkedList() {
		root = new Node(-1);
	}
	
	public Node getRoot() {
		return root;
	}
}
