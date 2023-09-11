package Interface;

public class Variable {
	public static String  name="y";//Static
	public String names;//non -static
	
	public  void A(String names,String name)//Para
	{
		System.out.println("Running the vavribale");//loc
		this.name=name;
		
	}
	static {
		String names="yashu";
	}
	
public static void main(String[] info)
{
	Variable V=new Variable();
	System.out.println(Variable.name);
	System.out.println(V.name);
	V.names="A";
	System.out.println(V.names);
	
}
}
