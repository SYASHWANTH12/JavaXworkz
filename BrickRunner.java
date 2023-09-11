class BrickRunner{
public static void main(String[] info)
{
Brick brick=new Brick(5000,5);
System.out.println("The price of the each brick is="+brick.price);
System.out.println("The durability of the brick is="+brick.durability);
System.out.println("The price of the each brick is="+Brick.colour);
System.out.println("The durability of the brick is="+Brick.timeToMake);
Brick.colour="yellow";
Brick.timeToMake="6-7 hours";
System.out.println("The price of the each brick is="+Brick.colour);
System.out.println("The durability of the brick is="+Brick.timeToMake);
System.out.println("The price of the each brick is="+brick.price);
System.out.println("The durability of the brick is="+brick.durability);
System.out.println("The price of the each brick is="+Brick.colour);
System.out.println("The durability of the brick is="+Brick.timeToMake);
}
}