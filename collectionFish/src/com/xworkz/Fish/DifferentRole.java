package com.xworkz.Fish;

import java.util.Collection;
import java.util.LinkedList;

public class DifferentRole {
	public static void main(String[] args) {
		Collection<String> collection = new LinkedList<String>();
		collection.add("Software Testing");
		collection.add("Data Analist");
		collection.add("Perform Testing");
		collection.add("Data Analitic");
		collection.add("SQL");
		collection.add("Full stack Developer");
		collection.add("Full stack Reporr");
		
		collection.stream().filter((t)->t.endsWith("r")).forEach(r->System.out.println(r));
		System.out.println("------------------------------------");
		collection.stream().filter(ref->ref.contains("a")).forEach(t->System.out.println(t));
		System.out.println("-------------------------------------------");
		collection.stream().filter(ref->ref.contains("f")).forEach(ref->System.out.println(ref));
	}
}
