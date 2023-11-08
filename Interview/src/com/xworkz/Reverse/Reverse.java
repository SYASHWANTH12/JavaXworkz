package com.xworkz.Reverse;

public class Reverse {
	int temp;
	public void method(int a, int b) {
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	
	}
public static void main(String[] args) {
	Reverse R=new Reverse();
	R.method(2, 5);
	
	
}
}
