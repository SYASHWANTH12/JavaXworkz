package Associate;

public class Passenger {
	Bus bus;
	public Passenger()
	{
		System.out.println("Invoking the default constructor");
	}
	public void Person(Bus bus) {
		System.out.println("Invoking the bus ");
		this.bus=bus;
		bus.privateBus();
	}
public static void main(String[] info)
{
	Passenger passenger=new Passenger();
	Bus bus=new Bus();
	passenger.Person(bus);
}
}
