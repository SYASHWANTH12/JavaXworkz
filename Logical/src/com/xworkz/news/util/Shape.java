package com.xworkz.news.util;


	import java.util.Scanner;
	abstract  class Shape {
	     float area;
	      abstract void acceptInput();
	      abstract void calcarea();
	      void disparea(){
	    	System.out.println(area);
	      }
	}
	class Square extends Shape
	{
		private float side;
		void acceptInput()
		{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the side") ;
	   side=scan.nextFloat();
		}
		void calcarea()
		{
			area=side*side;
		}
	}

	class rectangle extends Shape
	{
		private float length;
		private float breadth;
		void acceptInput()
		{
			Scanner scan=new Scanner (System.in);
			System.out.println("eneter the vcalue");
			length=scan.nextFloat();
			System.out.println("enter the breadth");
			breadth=scan.nextFloat();
		}
		void calcarea()
		{
			area=length*breadth;
		}
	}
	class circle extends Shape
	{
		private float radius;
		 void acceptInput()
		 {
	Scanner scan=		new Scanner(System.in);
	System.out.println("enter the radius");
	radius =scan.nextFloat();
		 }
		 void calcarea()
		 {
			 area=3.14f*radius*radius;
		 }
	}
	class gemometry{
	        void permit(Shape ref)
	{
		ref.acceptInput();
		ref.calcarea();
		ref.disparea();
	}
	}
	class polymorphism6
	{
		public static void main(String[] args)
		{
	Shape	s=new Square();
	Shape r=new rectangle();
	Shape c=new circle();

	gemometry g=new gemometry();
	g.permit(s);
	g.permit(r);
	g.permit(c);
			
		}
}
