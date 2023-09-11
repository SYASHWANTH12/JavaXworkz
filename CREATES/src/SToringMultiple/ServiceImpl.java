package SToringMultiple;

public class ServiceImpl implements Service{
	String name ;
	GROCARY grocary;
	public ServiceImpl(GROCARY grocary)
	{
		this.grocary=grocary;
	}
	
	
	@Override
	public void grocaryCraiteria(String names) {
		System.out.println("valid or not valid");
		if(names!=null && !names.isEmpty() && names.length()>3 && names.length()<20)
		
		{
			
			System.out.println("it is valid ");
			this.grocary.main(name);
		}
		else {
			System.err.println("it is not valid");
		}
		
	}
	public static void main(String[] info) {
	GROCARY grocary=new GrocaryImpl();
		Service E=new ServiceImpl(grocary);
		E.grocaryCraiteria("onion");
		
	}
}
