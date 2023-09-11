class PowerRunner{
public static void main(String[] info)
{
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
Power power=new Power("The body size","so much power is required");
System.out.println(power.body);
System.out.println(power.howMuchPower);
System.out.println(Power.whichTypeOfPower);
System.out.println(Power.timming);
Power.whichTypeOfPower="Lightning";
Power.timming=8;
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println(power.body);
System.out.println(power.howMuchPower);
System.out.println(Power.whichTypeOfPower);
System.out.println(Power.timming);
}

}