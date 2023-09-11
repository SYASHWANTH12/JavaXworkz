class ButterFly{
	int price;
	String colour;
	static String brand;
	static String usedFor;
	
	ButterFly(int price,String colour)
	{
		System.out.println("Running the int price,String color");
		this.price=price;
		this.colour=colour;
	}
	static{
		brand="xyz";
		usedFor="nothing";
	}
}