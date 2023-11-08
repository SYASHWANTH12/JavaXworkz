package com.xworkz.Reverse;

public class Polymorphism {
	Different ref;
	public Polymorphism(Different ref) {
		this.ref=ref;
		System.out.println(ref.number);
	}
	

public static void main(String[] args) {
	Different D = new Different();
	Polymorphism polymorphism=new Polymorphism(D);
}
}
