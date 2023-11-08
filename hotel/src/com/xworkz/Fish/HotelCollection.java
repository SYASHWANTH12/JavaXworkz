package com.xworkz.Fish;

import java.util.ArrayList;
import java.util.Collection;

public class HotelCollection {
	public static void main(String[] args) {
		HotelDTO collection = new HotelDTO(1, "Royal Orkid", "yadirappa", "34567vcdrtyl", "India");
		HotelDTO collection1 = new HotelDTO(2, "Bright", "yashwanth", "3456fwbvhcdrtyl", "India");
		HotelDTO collection2 = new HotelDTO(3, "Kimmane Resort", "Esvarappa", "34567vcderujyl", "India");
		HotelDTO collection3 = new HotelDTO(4, "Harsh Fern", "Kumarswami", "3477vcdrtyl", "Srilanka");
		HotelDTO collection4 = new HotelDTO(5, "Blue Crystal", "Yashwanth", "3987vcdrtyl", "Srilanka");
		HotelDTO collection5 = new HotelDTO(6, "Mumbhai Hotel", "Madhu Kumar", "34967vcdrtyl", "Srilanka");
		HotelDTO collection6 = new HotelDTO(7, "Ramachari", "Ranjith", "36667vcdrtyl", "USA");
		HotelDTO collection7 = new HotelDTO(8, "OYO", "Sumanth", "34567vclkyl", "USA");
		HotelDTO collection8 = new HotelDTO(9, "Ramehwaram", "Chethan", "34567vcedcrtyl", "UK");
		HotelDTO collection9 = new HotelDTO(10, "Sayadri", "yadirappa", "34567vcdrlkyl", "UK");
		Collection<HotelDTO> collect = new ArrayList<HotelDTO>();
		collect.add(collection);
		collect.add(collection1);
		collect.add(collection2);
		collect.add(collection3);
		collect.add(collection4);
		collect.add(collection5);
		collect.add(collection6);
		collect.add(collection7);
		collect.add(collection8);
		collect.add(collection9);
		System.err.println("Getting Hotel Name  of india by Loaction");
		collect.stream().filter(ref -> ref.getLocation().equals("India"))
				.forEach(ref -> System.out.println(ref.getName()));
		System.err.println("Getting Hotel Name of SriLanka  by Loaction");
		collect.stream().filter(h -> h.getLocation().equals("Srilanka"))
				.forEach(ref -> System.out.println(ref.getName()));
		System.err.println("Only Owner names");
         collect.stream().map(ref->ref.getOwnerName()).forEach(ref->System.out.println(ref));
         System.err.println("Only GST Number");
         collect.stream().map(ref->ref.getGst()).forEach(ref->System.out.println(ref));
         System.err.println("Get Id By Loaction equals to UK");
         collect.stream().filter(ref->ref.getLocation().equals("UK")).forEach(ref->System.out.println(ref.getId()));
         System.err.println("Get OwnerName By Loaction equals to USA");
         collect.stream().filter(ref->ref.getLocation().equals("USA")).forEach(ref->System.out.println(ref.getOwnerName()));
	}
}
