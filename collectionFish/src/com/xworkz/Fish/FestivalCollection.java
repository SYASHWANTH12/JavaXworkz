package com.xworkz.Fish;

import java.util.Collection;
import java.util.LinkedList;

public class FestivalCollection {
public static void main(String[] args) {
	Collection<String> collection=new LinkedList<String>();
	collection.add("Ganapathi");
	collection.add("Deepavali");
	collection.add("Kannada Rajosthava");
	collection.add("Independent Day");
	collection.add("Ahuda Pooje");
	collection.add("Makara Sankranth");
	collection.add("Dasara");
	collection.add("Laksmhi Pooje");
	collection.add("Holi");
	collection.add("Navratri");
	collection.add("Onam");
	collection.add("Raksha Bandhan");
	collection.add("Vaisakhi");
	collection.add("Ram Navami");
	collection.add("Bhai Dooj");
	collection.add("Zhai Rooj");
	collection.add("Ram");
	System.err.println("Length Greater Than 6");
	collection.stream().filter(ref->ref.length()>6).forEach(ref->System.out.println(ref));
	System.err.println("The Length less than 6");
	collection.stream().filter(ref->ref.length()<6).forEach(ref->System.out.println(ref));
	System.err.println("Festival contains o or 0");
	collection.stream().filter(ref->ref.contains("o")||ref.contains("0")).forEach(ref->System.out.println(ref));
	System.err.println("Festival which is not equal to g");
	collection.stream().filter(ref->!ref.contains("g")).forEach(ref->System.out.println(ref));
	System.err.println("The festival Name Ending with S");
	System.out.println(" ");
	collection.stream().filter((ref)->ref.endsWith("s")||ref.endsWith("S")).noneMatch(null);
	/*.forEach((ref)->{if(false){System.out.println("Nothing Ending with The S...");
	}if(true) { System.out.println(ref);}});*/
    System.err.println("In Festival Having Z And R");
    collection.stream().filter(ref->ref.contains("Z") && ref.contains("R")).forEach(ref->System.out.println(ref));
    System.err.println("The festival having ram");
	collection.stream().filter(ref->ref.contains("Ram")).forEach(ref->System.out.println(ref));

}
}
