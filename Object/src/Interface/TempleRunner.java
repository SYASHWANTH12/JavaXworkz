package Interface;

public class TempleRunner implements Temple,Temples

{
	public void Pray()
	{
		System.out.println("Runnin the pray");
	}
	public void Peace()
	{
		System.out.println("Running the peace in the temple");
	}
	public void Prayers()
	{
		System.out.println("Running the prayers");
	}
	public static void main(String[] info)
	{
		Temple temple=new TempleRunner();
		temple.Pray();
		temple.Peace();
		Temples temples=new TempleRunner();
		temples.Prayers();
		
	}

}
