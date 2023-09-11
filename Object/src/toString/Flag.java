package toString;

public class Flag {
private String colour;
private int cost;
private String date;

public Flag(String colour,int cost,String date)
{
	
	this.colour=colour;
	this.cost=cost;
	this.date=date;
}
public String toString()
{
	return "yashu="+colour+",cost="+cost+",date="+date;
}
}
