package Interface;

public class Farmer {
	String names;
	Land land;
	public Farmer(String names)
	{
		this.names=names;
	}
	public void setLand(Land land)
	{
		this.land=land;
		
	}
	public void farming()
	{
		System.out.println("Invoking the farming");
		System.out.println(land.getName());
		System.out.println(this.names);
		land.cropGrowing();
		
		}
public static void main(String[] info)
{
	Land land=new Land();
	Farmer farmer=new Farmer("yashu");
	farmer.setLand(land);
	farmer.farming();
	
}
}
