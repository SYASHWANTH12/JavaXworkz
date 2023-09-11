package Interface;

public class MetroRunner implements Metro {
@Override
public boolean Run() {
System.out.println("jhs");
	return false;
}

@Override
public boolean Travel() {
	// TODO Auto-generated method stub
	return false;
}
public static void main(String[] info)
{
	Metro metro=new MetroRunner();
	metro.Run();
	metro.Travel();
}
}
