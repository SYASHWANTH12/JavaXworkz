class Power{
String body;
String howMuchPower;
static String whichTypeOfPower;
static int timming;

Power(String body,String howMuchPower)
{
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	this.body=body;
	this.howMuchPower=howMuchPower;
}
static{
	whichTypeOfPower="electricity";
	timming=15;
}
}