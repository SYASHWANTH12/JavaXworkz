class HelmetRunner{
public static void main(String[] info)
{
	Helmet helmet=new Helmet(67,"black");
	System.out.println(helmet.price);
	System.out.println(helmet.colour);
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	System.out.println("*******************************************");
	Helmet.brand="unicorn";
	Helmet.usedFor="Protection";
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	System.out.println("########################################");
	Helmet helmet1=new Helmet(23,"pink");
	System.out.println(helmet1.price);
	System.out.println(helmet1.colour);
	Helmet.brand="u";
	Helmet.usedFor="P";
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	System.out.println(Helmet.brand);
	System.out.println(Helmet.usedFor);
	
	
}
}