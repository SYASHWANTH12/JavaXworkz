package Associate;

public class Trainer {
	public  String name="yashu";
	Laptop laptop;
	public  Trainer()
	{
		System.out.println("Invoking the trainer");
	}
	public void Coach(Laptop laptop)
	{
		this.laptop=laptop;
		System.out.println("Invoking the coach");
		laptop.Ram();
	}
public static void main(String[] info)
{
	
	Trainer trainer=new Trainer();
	Laptop laptop=new Laptop();
	System.out.println(trainer.name);
	trainer.Coach(laptop);
	
	
	
}
}
