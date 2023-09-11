package Movie;

public class MovieRunner {
	public static void main(String[] info)
	{
		System.out.println("Running the classes");
		Movies ref=new Movies();
		System.out.println(ref.name);
		System.out.println(ref.lang);
		producer ref1=ref.a;
		System.out.println(ref1.budget);
		System.out.println(ref1.mobileNo);
		Auditor ref2=ref1.b;
		System.out.println(ref2.aadharNo);
		Company ref3=ref2.c;
		System.out.println(ref3.name);
		System.out.println(ref3.location);
		
		
	}

}
