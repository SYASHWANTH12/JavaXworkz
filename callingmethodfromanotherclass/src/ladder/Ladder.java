package ladder;

public class Ladder {
	public double price;
	public String fold;
	public int noise;
	public boolean worthForValue;
	
	public void Climb()
	{
		System.out.println("Running the no argument value");
	}
	public void Climb(double price)
	{
		Climb();
		System.out.println("Running the price");
	}
	public void Climb(String fold,int noise)
	{
		Climb(2999.33);
		System.out.println("Running the fold and noise");
	}
	public boolean Climb(boolean worthForValue)
	{
		Climb("yes",20);
		System.out.println("Running the worth for value");
		this.worthForValue=worthForValue;
		return true;
	}

}
