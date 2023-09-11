package AccessSpecifier;

public class SmallBakery extends Bakery {
	@Override
	void sweats (String name, int price,String owner)
	{
		System.out.println("Running the name="+this.name+"price="+this.price+"owner"+this.owner);
	    sweats("mysuru pak");
	}

}
