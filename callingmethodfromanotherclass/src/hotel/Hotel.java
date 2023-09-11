package hotel;

public class Hotel {
	public String price;
	public int members;
	public int staff;
	
	
	public void Manager()
	{
		Manager(2000);
	 System.out.println("Running the no argument value");
		Manager("500");
	}
	public void Manager(String price)
	{
		System.out.println("Running the price ");
	}
	public void Manager(int members)
	{
		System.out.println("RUnning the members");
	}
	

}
