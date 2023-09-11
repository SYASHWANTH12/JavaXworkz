package Associate;

public class Pant {
	private String colour;
	private Zip zip;
	Pant(String colour){
		this.colour=colour;
		System.out.println("Invoking the colour");
	}
	public void Jeans(String colour,Zip zip) {
		this.colour=colour;
		this.zip=zip;
		zip.Zips();
	}
public static void main(String[] info)
{
	Pant pant=new Pant("red");
	Zip zip=new Zip();
	pant.Jeans("red",zip);
	zip.A();
	
}
}
