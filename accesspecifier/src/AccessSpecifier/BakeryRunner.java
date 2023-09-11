package AccessSpecifier;

public class BakeryRunner {
public static void main(String[] info)
{
	Bakery B1=new SmallBakery();
	B1.sweats();
	SmallBakery ref=(SmallBakery)B1;
	ref.sweats();
}
}
