package abstraction;

public class Form {
	Custom custom;
	public Form() {
		System.out.println("Doing the default constructor");
	}
	public void Chandan(Custom custom) {
		System.out.println("Invoking the Fill up");
		this.custom=custom;
	}
public static void main(String[] info)
{
	Custom C=new FillUp();
	Form F=new Form();
	C.verifyCitizen();
	F.Chandan(C);
}
}
