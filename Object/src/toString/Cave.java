package toString;

public class Cave {
private String name;
private int cost;
private float price;
private int size;
private int weidth;
private int heigth;
private boolean Strength;
private int members;
private String maximumLoad;
private String type;





public Cave(String name,int cost,float price,int size,int weidth,int heigth,boolean Strength,int members,String maximumLoad,String type) {
	
	super();
	this.name = name;
	this.cost = cost;
	this.price = price;
	this.size = size;
	this.weidth = weidth;
	this.heigth = heigth;
	this.Strength = Strength;
	this.members = members;
	this.maximumLoad = maximumLoad;
	this.type = type;
}




@Override
public String toString() {
	return "Cave [name=" +name+ ", cost=" + cost + ", price=" + price + ", size=" + size + ", weidth=" + weidth
			+ ", heigth=" + heigth + ", Strength=" + Strength + ", members=" + members + ", maximumLoad=" + maximumLoad
			+ ", type=" + type + "]";
}

}
