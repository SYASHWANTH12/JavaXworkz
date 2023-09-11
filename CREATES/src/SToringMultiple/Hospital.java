package SToringMultiple;

public class Hospital {
	String[] S=new String[10];
	int a;
	Artist artist;
	Jacket jacket;
	
	public Hospital(Artist artist,Jacket jacket)
	{
		this.artist=artist;
		this.jacket=jacket;
	}
	public void condition(String name)
	{
		
		if(name!=null && !name.isEmpty() && name.length()>2 && name.length()<10)
		{
			System.out.println("it is valid");
			this.artist.name(name);
			
		}
		else {
			System.err.println("is is not valid");
		}
	
		
		
	}
	public void jcondition(int name)
	{
		
			this.jacket.values(name);
			
		
		
		
		
	}
	public static void main(String[] info)
	{
		Artist artist=new ArtistImpl();
		Jacket jacket=new JacketImpl();
		Hospital hos=new Hospital(artist,jacket);
		hos.condition("yashu");
		hos.jcondition(2);
		
	}

}
