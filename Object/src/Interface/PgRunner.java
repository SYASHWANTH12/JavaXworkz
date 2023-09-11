package Interface;

public class PgRunner implements Pg,PgForGirls{
	public String Food()
	{
		return "Gobi";
	}
	public void price()
	{
		System.out.println("Running the price of the pg");
	}
	public int Rent()
	{
		return 4000;
	}
	
	public void Accoumdation() {
		System.out.println("Running the accoumdation");
	}
	public static void main(String[] info)
	{
		Pg pg=new PgRunner();
		PgForGirls girls=new PgRunner();
		girls.price();
		System.out.println(pg.Rent());
		girls.Accoumdation();
		System.out.println(pg.Food());
	}

}
