package encapsulaton;

public class Bus {
	private String name;
	private int cost;
	private boolean passenger;
	private float price;
	private int ticket;
	
	public void isPassenger(boolean passenger)
	{
		this.passenger=passenger;
		System.out.println(passenger);
	}
	public boolean setWheels()
	{
		return passenger;
	}
	public void setWheels( String name)
	{
		this.name=name;
		System.out.println(name);
	}
	public String getWheels()
	{
		return name;
	}
	public String  getCost()
	{
		return name;
	}
	public void setPrice(float price)
	{
		this.price=price;
		price=726;
		System.out.println("Running the price of the bus="+this.price);
	}
	public float getPrice()
	{
		return price;
	}
	public void setTicket(int ticket)
	{
		this.ticket=ticket;
		ticket=2;
		System.out.println(this.ticket);
		
	}
	public int getTicket()
	{
		return ticket;
	}
}
