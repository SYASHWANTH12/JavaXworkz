class Brick{
int price;
int durability;
static String colour;
static String timeToMake;

Brick(int price, int durability)
{
	System.out.println("**********************************");
	this.price=price;
	this.durability=4;
}
static{
	colour="red";
	timeToMake="4 hour";
}
}