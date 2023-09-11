package abstraction;

public class Admission implements College{
	@Override
	public void branch() {
		System.out.println("Invoking the branch");
		
	}
	public static int fees() {
		return 8;
	}

}
