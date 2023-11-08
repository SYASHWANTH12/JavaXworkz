package com.xworkz.Fish;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

public class IceRunner {
	public static void main(String[] args) {
		IceCream C1 = new IceCream("Venilla", 290, "black", LocalDate.of(2001, 7, 21));
		IceCream C2 = new IceCream("StarwBerry", 22, "Pink", LocalDate.of(2005, 9, 22));
		IceCream C3 = new IceCream("IceCandy", 232, "Purple", LocalDate.of(1995, 2, 18));
		IceCream C4 = new IceCream("Chocobar", 6, "Water", LocalDate.of(2010, 6, 12));
		Stream.of(C1, C2, C3, C4).sorted().forEach(ref -> System.out.println(ref));
		System.out.println("**************************************************");
		Comparator<IceCream> cam = (r, y) -> {
			int name = y.getPrice().compareTo(r.getPrice());
			if (name != 0) {
				return name;
			}
			return y.getColor().compareTo(r.getColor());
		};
		Stream.of(C1, C2, C3, C4).sorted(cam).forEach(ref -> System.out.println(ref));
		System.out.println("______________________________________________");
		Comparator<IceCream> ref = (R1, R2) -> {
			int num = R1.getDate().compareTo(R2.getDate());
			if (num != 0) {
				return num;
			}
			return R1.getPrice().compareTo(R2.getPrice());
		};
		Stream.of(C1, C2, C3, C4).sorted(ref).forEach(re1f -> System.out.println(re1f));
	}
}
