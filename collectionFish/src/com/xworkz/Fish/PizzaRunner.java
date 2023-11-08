package com.xworkz.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

public class PizzaRunner {
	public static void main(String[] args) {
		PizzaDTO pizza = new PizzaDTO("onion Pizza", 250.8d, "medium");
		PizzaDTO pizza1 = new PizzaDTO("Tomoto Pizza", 220.9d, "Large");
		PizzaDTO pizza2 = new PizzaDTO("Non-veg", 550.4d, "Small");
		Stream.of(pizza, pizza1, pizza2).sorted().forEach(ref -> System.out.println(ref));
		System.out.println("_---------------------------------------------");
		Comparator<PizzaDTO> p = (r1, r2) -> {
			int size = r1.getPrice().compareTo(r2.getPrice());
			if (size != 0) {
				return size;
			}
			return r1.getSize().compareTo(r2.getSize());
		};
		Comparator<PizzaDTO> p3 = (r1, r2) -> {
			return r1.getName().compareTo(r2.getName());
		};
		Comparator<PizzaDTO> p1 = (r1, r2) -> {
			return r1.getPrice().compareTo(r2.getPrice());
		};
		Comparator<PizzaDTO> p2 = (r1, r2) -> {
			return r1.getSize().compareTo(r2.getSize());
		};
		Stream.of(pizza, pizza1, pizza2).sorted(p1.thenComparing(p2).thenComparing(p3))
				.forEach(ref -> System.out.println(ref));

//		Collection<PizzaDTO> dto=new ArrayList<PizzaDTO>();
//		dto.add(pizza2);
//		dto.add(pizza);
//		dto.add(pizza1);
//		dto.stream().filter(ref->ref.getSize().equals("Large")).forEach(ref->System.out.println(ref.getName()));
	}
}
