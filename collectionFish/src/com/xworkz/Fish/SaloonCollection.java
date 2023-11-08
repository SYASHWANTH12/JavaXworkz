package com.xworkz.Fish;

import java.util.ArrayList;
import java.util.Collection;

public class SaloonCollection {
public static void main(String[] args) {
	SaloonItemDTO ref=new SaloonItemDTO(1, "Hair Cutting", 250, "Knife", "Yashwanth");
	SaloonItemDTO ref1=new SaloonItemDTO(2, "Trim", 50, "Reser", "Yashwanth");
	SaloonItemDTO ref2=new SaloonItemDTO(3, "Sheving", 150, "Tolls", "Yashwanth");
	SaloonItemDTO ref3=new SaloonItemDTO(4, "Masag", 500, "Oil", "Yashwanth");
	SaloonItemDTO ref4=new SaloonItemDTO(5, "Baf Cut", 250, "Knife", "Yashwanth");
	SaloonItemDTO ref5=new SaloonItemDTO(6, "Eye Brow", 100, "Knife", "Yashwanth");
	SaloonItemDTO ref6=new SaloonItemDTO(7, "Face wash", 250, "Knife", "Yashwanth");
	SaloonItemDTO ref7=new SaloonItemDTO(8, "Newspaper", 250, "Knife", "Yashwanth");
	SaloonItemDTO ref8=new SaloonItemDTO(9, "Hair Straigthing", 250, "Knife", "Yashwanth");
	SaloonItemDTO ref9=new SaloonItemDTO(10, "Finger Wash", 250, "Knife", "Yashwanth");
	Collection<SaloonItemDTO> saloon=new ArrayList<SaloonItemDTO>();
	saloon.add(ref);
	saloon.add(ref1);
	saloon.add(ref2);
	saloon.add(ref3);
	saloon.add(ref4);
	saloon.add(ref5);
	saloon.add(ref6);
	saloon.add(ref7);
	saloon.add(ref8);
	saloon.add(ref9);
	for(SaloonItemDTO ref10 : saloon)
	{
		System.out.println(ref10);
	}
	
	System.out.println(saloon.contains(ref8));
	Collection<SaloonItemDTO> sc=new ArrayList<SaloonItemDTO>();
	SaloonItemDTO D=new SaloonItemDTO(10, "Finger Wash", 250, "Knife", "Yashwanth");
	SaloonItemDTO D1=new SaloonItemDTO(9, "Hair Straigthing", 250, "Knife", "Yashwanth");
	sc.add(D);
	sc.add(D1);
	System.out.println(saloon.containsAll(sc));
	System.out.println(sc.remove(D));
	System.out.println(saloon.removeAll(saloon));
}
}
