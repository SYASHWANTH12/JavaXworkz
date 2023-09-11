package SToringMultiple;

public class ArtistImpl implements Artist{
	int T=10;
	public String[] c=new String[10];
	int position;
	public void name(String create)
	{
		this.c[position]=create;
		System.out.println(create+"    "+   position);
		this.position++;
		
	}
public static void main(String[] info)
{
	Artist A=new ArtistImpl();
	A.name("Paint");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
	A.name("Wallpaper");
}
}
