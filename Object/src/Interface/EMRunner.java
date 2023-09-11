package Interface;

public class EMRunner implements Engineer,Military {
@Override
public int Fees() {
System.out.println("The price of the fees");
	return 400000;
}
@Override
	public int Salary() {
		// TODO Auto-generated method stub
		return 50000;
	}
@Override
	public int Years() {
		// TODO Auto-generated method stub
		return 4;
	}
@Override
	public int Service() {
		// TODO Auto-generated method stub
		return 10;
	}
public static void main(String[] info)
{
	Engineer E=new EMRunner();
	System.out.println(E.Fees());
	System.out.println(E.Years());
	Military M=new EMRunner();
	System.out.println(M.Salary());
	System.out.println(M.Service());
	System.out.println(M.name);
}
}
