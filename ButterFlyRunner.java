class ButterFlyRunner{
public static void main(String[] info)
{
	ButterFly butterFly=new ButterFly(67,"black");
	System.out.println(butterFly.price);
	System.out.println(butterFly.colour);
	System.out.println(ButterFly.brand);
	System.out.println(ButterFly.usedFor);
	System.out.println("*******************************************");
	ButterFly.brand="unicorn";
	ButterFly.usedFor="Protection";
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	System.out.println("########################################");
	ButterFly butterFly1=new ButterFly(23,"pink");
	System.out.println(butterFly1.price);
	System.out.println(butterFly1.colour);
	ButterFly.brand="u";
	ButterFly.usedFor="P";
	System.out.println(butterFly1.brand);
	System.out.println(butterFly1.usedFor);
	System.out.println(ButterFly.brand);
	System.out.println(ButterFly.usedFor);
	
	
}
}