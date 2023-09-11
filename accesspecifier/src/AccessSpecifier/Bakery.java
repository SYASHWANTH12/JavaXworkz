package AccessSpecifier;

public class Bakery {
String name;
int price;
String owner;

public void sweats()
{
	System.out.println("Running the no argument value");
}
public  void sweats(String name)
{
	System.out.println("Runnnin the name of the bakery="+this.name);
	
}
void sweats(String name,int price)
{
	System.out.println("Running the name and price of the bakery ="+this.name+"price"+this.price);
	
}
void sweats (String name, int price,String owner)
{
	System.out.println("Running the name="+this.name+"price="+this.price+"owner"+this.owner);
}
}
