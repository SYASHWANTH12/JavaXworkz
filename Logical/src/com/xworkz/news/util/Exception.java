package com.xworkz.news.util;

public class Exception {
public void method (String name)
{
	 throw new ArithmeticException();
}
public static void main(String[] args) {
	Exception exception=new Exception();
    try{
	exception.method("yashu");
    }catch(ArithmeticException e){
    	System.out.println("The Arthimatic Exception is Handled");
    }
}
}
