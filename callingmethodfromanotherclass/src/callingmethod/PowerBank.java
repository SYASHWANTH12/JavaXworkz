package callingmethod;

  public class PowerBank {
  public int price=2773;
  public Battery ref=new Battery();
  public void capacity()
{
	System.out.println("The capacity of the battery is=");
	if(ref!=null)
	{
	ref.Mh("eat");
	ref.price();
	}
	else{
		System.out.println("U should give some value to the Battery");
	}
}
}
