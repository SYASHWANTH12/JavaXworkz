package Equals;

public class Cook {
	private String taste;
	private int cost;
	private char size;
	private boolean chocolate;
	public Cook(String taste,int cost,char size,boolean chocolate)
	{
		System.out.println("invoking the cook");
		this.taste=taste;
		this.cost=cost;
		this.size=size;
		this.chocolate=chocolate;
	}
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			System.out.println("The given is not pointing to null");
			if(obj instanceof Cook)
			{
				System.out.println("The given ref is of the same class");
				Cook cook=(Cook)obj;
				if(this.taste.equals(cook.taste) && this.cost==cook.cost &&
						this.size==cook.size && this.chocolate==cook.chocolate)
				{
					System.out.println("The all the given ref is same");
				}
				else {
					System.out.println("The given ref is differnet");
				}
			}
			else {
				System.out.println("It is pointing to the differnt class");
			}
		}
		else {
			System.out.println("The given reference is pointing to the null");
		}
		return true;
	}
public static void main(String[] info)
{
	Cook C1=new Cook("fish fry",45,'d',true);
	Cook C2=new Cook("mutton fry",25,'K',false);
	boolean ref=C1.equals(C2);
	System.out.println(ref);
}
}
