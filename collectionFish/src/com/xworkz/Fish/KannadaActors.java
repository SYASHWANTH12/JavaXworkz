package com.xworkz.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class KannadaActors {
public static void main(String[] args) {
	Collection<String> collection=new ArrayList<String>();
	 collection.add("RajKumer");
	collection.add("PuneetRajKumer");
	collection.add("VisnuVardhan");
	collection.add("Vijay Talapathi");
	collection.add("Vijay Sethupathi");
	collection.add("Dolly");
	collection.add("Vijay Prakash");
	Iterator<String> itr=collection.iterator();
	while(itr.hasNext())
	{
		String next=itr.next();
		System.out.println(next);
	}
	String name="RajKumer";
	System.out.println(collection.contains(name));
	
	System.out.println(collection.containsAll(collection));
	String names="RajKumer";
	System.out.println(collection.remove(names));
	
	boolean R1=collection.removeAll(collection);
	System.out.println(R1);
	Collection<String> C=new ArrayList<String>();
	C.add("Dolly");
	C.add("Priyamani");
	boolean A=collection.containsAll(C);
	System.out.println(A);
}
}