package com.xworkz.news.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task {
	String[] store = new String[7];
	int pos;

	public void name(String name) {

		this.store[pos] = name;
		pos++;
	}

	public void array() {
		for (int i = 0; i < store.length; i++) {
			String temp = store[i];
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		Collection<String> task = new ArrayList();
		task.add("yashu");
		task.add("Anusha");
		task.add("vasu");
		task.add("shivu");
		task.add("Prajwal");
		System.out.println(task.toString() + " The Size Of An Array is  " + task.size());
		Iterator<String> itr = task.iterator();
		while (itr.hasNext()) {
			String names = itr.next();
			System.out.println(names);
		}
		task.remove(itr);
		while (itr.hasNext()) {
			String names1 = itr.next();
			System.err.println("Removing one variable");
			System.out.println(names1);
		}
		 
		task.contains(task);
		while (itr.hasNext()) {
			String names3 = itr.next();
			System.out.println(names3);
		}
		task.containsAll(task);
		while (itr.hasNext()) {
			String names4 = itr.next();
			System.out.println(names4);
		}
		
//		System.out.println(task.clear());
		task.isEmpty();
		while (itr.hasNext()) {
			String names6 = itr.next();
			System.out.println(names6);
		}
//		task.removeAll(task);
//		while (itr.hasNext()) {
//			String names5 = itr.next();
//			System.out.println(names5);
//		}
	}

}
