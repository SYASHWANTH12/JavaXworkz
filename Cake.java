class Cake{
static void tasty(String name,String type,String bakeryName,int Price,int noOfPieces,String ocassion) 
{
if(name!=null)
{
	System.out.println("The bakery name is valid");
}
	else
	{
		System.out.println("The bakery name is in valid");
		return;
	}
	if(type!=null)
	{
		System.out.println("The Bakery type is valid");
	}
	else{
		System.err.println("The bakery type is in valid");
		return;
	}
	if(bakeryName!=null)
	{
		System.out.println(bakeryName);
		
	}
	else{
		System.err.println("in valid");
	}
	if(Price<25)
	{
		System.out.println("The price of the cake is ="+Price);
		
	}
	else{
		System.err.println("The price of the cake is more");
	}
	if(noOfPieces<10)
	{
		System.out.println("The pieces of the cake is ="+noOfPieces);
	}
	else{
		System.out.println("The pieces of the cake is more");
	}
	if(ocassion!=null)
	{
		System.out.println(bakeryName);
	}
}
}