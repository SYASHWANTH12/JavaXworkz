package Anusha;

public class Sujatha {
String name;
int salary;
int travel;
byte S=50;
char size='a';
Sujatha()
{
	System.out.println("Invokinfg the defaault construvtor");
}
Sujatha(String name,int salary,int travel)
{
	this.name=name;
	this.salary=salary;
	this.travel=travel;
}
void Bus()
{
	System.out.println("Running the method construtor");
}
void Bus(String name,int salary , int travel)
{
	this.name=name;
	this.salary=salary;
	this.travel=travel;
}
void Bus(String name)
{
	this.name=name;
}
public static void main(String[] any)
{
	Sujatha ref2=new Sujatha();
	System.out.println(ref2);
	Sujatha ref=new Sujatha("yashwnat",0,250);
	System.out.println(ref.name);
	System.out.println(ref.salary);
	System.out.println(ref.travel);
	
	ref.Bus("anusha",800,50);
	ref.Bus();
	ref.Bus("anu");
}
}
