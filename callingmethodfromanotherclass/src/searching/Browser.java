package searching;

public class Browser {
public String name="youtube";
public int price=3873;
public Internet y=new Internet();

public void insta()
{
	if(y!=null)
	{
		System.out.println("There is no null value");
		this.y.Videos();
	}
	else {
		System.out.println("Fix the null value");
	}
}

}
