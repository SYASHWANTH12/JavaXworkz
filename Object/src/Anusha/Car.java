package Anusha;

public class Car {
	String name = "Kia";
    int milege=300;
    float cost=1300000.3f;
    
    Car()
    {
    	System.out.println("Invoking the default constructor");
    }
    Car(String name,int milege,int cost)
    {
    	this.name=name;
    	this.milege=milege;
    	this.cost=cost;
    }
    void Anusha()
    {
    	System.out.println("Running the default method");
    }
    void Anusha(String name,int milege,int cost)
    {
    	this.name=name;
    	this.milege=milege;
    	this.cost=cost;
    }
    public static void main(String[] args)
    {
    	Car T =new Car();
    	Car T1=new Car("yashu", 0, 0);
    	System.out.println(T.name);
    	T.Anusha();
    	T.Anusha("anu", 0, 0);
    	
    	T1.Anusha();
    	T1.Anusha("Anuha", 0, 0);
    	System.out.println(T1.name);
    	
    }
    }


    
   