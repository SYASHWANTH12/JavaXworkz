package SToringMultiple;

public class HistoricalPlace {
	public final int TOTAL_PLACES=10;
	String[] names=new String[TOTAL_PLACES];
	int position;
	public void places(String name)
	{
		for(int a=0;a<10;a++)
		{
	    names[a]=name;
	    System.out.println("name "+name + "  position where it is stored "+a);
	    //position++;
		}
	}
public static void main(String[] info)
{
	HistoricalPlace historicalPlace=new HistoricalPlace();
	historicalPlace.places("Taj Mahal");
	historicalPlace.places("Golden Temple");
	historicalPlace.places("Museum");
}
}
