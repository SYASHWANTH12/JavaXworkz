package SToringMultiple;

public class GrocaryImpl implements GROCARY {

	String[] S=new String[TOTAL_VALUE];
	int Position;
	
	
	
public void main(String name) {
	if(Position<TOTAL_VALUE)
	{
		System.out.println("Invoking the value");
		this.S[Position]=name;
		System.out.println("The name of the item is " +name+"  THE position "+Position);
		this.Position++;
	}
	else {
		System.err.println("Out of storage");
	}
	
}
public static void main(String[] info)
{
	GROCARY grocary=new GrocaryImpl();
	grocary.main("RIce");
	grocary.main("chips");
}
}
