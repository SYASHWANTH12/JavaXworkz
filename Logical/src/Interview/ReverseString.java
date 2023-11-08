package Interview;

public class ReverseString {
	String name;
	String duplicate="";
	public void reverse(String name)
	{
		this.name=name;
		for(int i=0;i<this.name.length();i++)
		{
			char C=name.charAt(i);
			duplicate=C+duplicate;
			
		}
		System.out.print(duplicate);
	}
	public static void main(String[] args) {
		ReverseString S=new ReverseString();
		S.reverse("Hello World");
	}
}
