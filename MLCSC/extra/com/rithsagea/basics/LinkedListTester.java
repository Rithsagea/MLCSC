package com.rithsagea.basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LinkedListTester {
	
	/**
	 * Creates a LinkedList from the given values
	 * @param values the values to add to the list
	 * @return the created list
	 */
	private LinkedList createList(int... values) {
		LinkedList list = new LinkedList();
		
		for(int val : values) {
			list.add(val);
		}
		
		return list;
	}
	
	/**
	 * Gets the values from a LinkedList as an int[]
	 * @param list the list to get values from
	 * @return the values
	 */
	private int[] getValues(LinkedList list) {
		List<Integer> res = new ArrayList<>();
		Node node = list.getRoot();
		while(node.getChild() != null) {
			node = node.getChild();
			res.add(node.getVal());
		}
		
		return res.stream().mapToInt(i->i).toArray();
	}
	
	@Test
	public void testAdd() {
		LinkedList list = null;
		
		list = createList(1, 20, -5, 13);
		
		Node node = list.getRoot();
		
		int[] expectedValues = {-1, 1, 20, -5, 13};
		
		for(int x = 0; x < expectedValues.length; x++) {
			assertEquals("incorrect value at node " + x, expectedValues[x], node.getVal());
			node = node.getChild();
		}
		
		assertNull("incorrect list length, too long", node);
	}
	
	@Test
	public void testSize() {
		LinkedList list = createList(1, 2, 3, 4, 5);
		assertEquals("incorrect list size", 5, list.size());
	}

	@Test
	public void testGet() {
		int[] values = {7, 29, 10, 14};
		LinkedList list = createList(values);
		
		for(int x = 0; x < 4; x++) {
			assertEquals("incorrect value", values[x], list.get(x));
		}
	}

	@Test
	public void testRemove() {
		int[] values = {19, 23, 47, 157, 63, 14};
		LinkedList list = createList(values);
		
		assertEquals("removing element", 63, list.remove(4));
		assertEquals("removing last element", 14, list.remove(4));
		assertEquals("removing first element", 19, list.remove(0));
		
		int[] listValues = getValues(list);
		int[] expectedValues = {23, 47, 157};
		
		assertEquals(expectedValues, listValues);
	}
	
	@Test
	public void testInsert() {
		int[] values = {23, 157, 63};
		LinkedList list = createList(values);
		
		list.insert(47, 2);
		list.insert(19, 0);
		list.insert(14, 5);
		
		int[] listValues = getValues(list);
		int[] expectedValues = {19, 23, 157, 47, 63, 14};
		
		assertEquals(expectedValues, listValues);
	}
}
