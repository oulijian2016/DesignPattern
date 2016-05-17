package com.java.designPatterns.Iterator;

public class TestIterator {
	public static void main(String[] args){
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}
}
