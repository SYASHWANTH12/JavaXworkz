package toString;

public class Logo {
	private String name;
	private int cost;
	private boolean value;
	private int size;
	private int weidth;
	
public Logo(String name,int cost,boolean value,int size,int weidth)
{
	this.cost=cost;
	this.name=name;
	this.value=value;
	this.size=size;
	this.weidth=weidth;
}
public String toString()
{
     return "name of the Logo="+this.name+",cost of the logo="+this.cost+",the given data is true or false"+this.value+",size="+this.size+",weidth="+this.weidth;
}
}
