package com.xworkz.Fish;

public class Lambda implements Fish {
	


@Override
public void accept(Object t, Object u) {
	// TODO Auto-generated method stub
	
}

public static void main(String[] args) {
	Fish f=(a,b)->{
		System.out.println("It is a Biconsumer interface");	
		};
	Lambda lambda=new Lambda();
	f.accept(f, lambda);
	
}

}
