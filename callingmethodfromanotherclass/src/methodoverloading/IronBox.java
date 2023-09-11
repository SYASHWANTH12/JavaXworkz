package methodoverloading;

public class IronBox {
	public double price;
	public String type;
	public int time;
	public int brand;
	
	public void Heat()
	{
		Heat(2);
		System.out.println("Running no argument value");
	}
	public void Heat(double price)
	{
		Heat();
		System.out.println("Running the double price value");
	}
	public void Heat(String type)
	{
		Heat(3.25);
		System.out.println("RUnning the type value");
		System.out.println(this.type);
		
	}
	public void Heat(int brand)
	{
		Heat("hot");
		System.out.println("Runnig the brand value");
		this.brand=brand;
	}

}
