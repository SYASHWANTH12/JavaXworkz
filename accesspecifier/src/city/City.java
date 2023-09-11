package city;

public class City {
	public String name;
	public int members;
	public double price;
	City()
	{
		System.out.println("Running the no argument value");
	}
	public City(String name)
	{
		System.out.println("Running the name "+this.name);
	}
	private City(String name,int members)
	{
		System.out.println("Running the name and members");
	}
	protected City(String name, int members ,double price)
	{
		System.out.println("Running the name,members,price");
	}
}
