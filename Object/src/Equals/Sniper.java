package Equals;

public class Sniper {
private String name;
private int range;
private char target;
public String toString()
{
	return "name="+name+"range"+range+"target"+target;
}
public Sniper()
{
	System.out.println("Invoking the no argument value");
}
public Sniper(String name,int range ,char target)
{
	System.out.println("Running the Sniper value");
	this.name=name;
	this.range=range;
	this.target=target;
}
public  boolean equals(Object A)
{
	if(A!=null)
	{
		System.out.println("The reference given is not pointing to the null");
		if(A instanceof Sniper)
		{
			System.out.println("The given reference is of the same class");
			Sniper Sni=(Sniper)A;
			Sniper B=this;
			if(B.name.equals(Sni.name))
			{
				System.out.println("The name is same");
			}
			else {
				System.err.println("The given name is not same");
			}
			if(B.range==Sni.range)
			{
				System.out.println("The Given range is same");
			}
			else {
				System.err.println("The given range is not same");
			}
			if(B.target==Sni.target)
			{
				System.out.println("The given target is of the same distance");
			}
			else {
				System.err.println("The given target is of the different distance");
				return true;
			}
		}
		else {
			System.err.println("The given reference is of the differnt  class");
		}
		}
	else {
		System.err.println("The given is pointing to the  null please change it");
	
	}
	return true;
	
}
public static void main(String[] info)
{
	Sniper sn=new Sniper("yashwanth",250,'Q');
	Sniper sn1=new Sniper("yashwanth",250,'Q');
	boolean  ref=sn.equals(sn1);
	System.out.println(ref);
	System.out.println(sn.toString());
	
}
}
