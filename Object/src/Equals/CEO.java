package Equals;

public class CEO {
	private String name;
	private int age;

	public CEO(String name, int age) {
		System.out.println("Invoking the company");
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object eqi) {
		if (eqi != null)
		{
			System.out.println("The right hand is not equal to null");
			if (eqi instanceof CEO)
			{
				System.out.println("The eqi is of the same class");
				CEO ceo=(CEO)eqi;
				if(this.name.equals(ceo.name))
				{
					System.out.println("The name  is same");
					
				}
				else
				{
					System.err.println("The name is  not same");
				}
				if(this.age==ceo.age)
				{
					System.out.println("The age is same");
				}
				else
				{
					System.err.println("THe age is differnet");
				}
			}
			else
			{
				System.err.println("The eqi refernce is not from the same class");
			}
		} 
		else
		{
			System.err.println("The given eqi is pointing to the null");
		}
		
		return true;
	}

	public static void main(String[] info) {
		CEO ceo = new CEO("microsoft", 21);
		CEO ceo1 = new CEO("microsoft", 22);
		boolean ref = ceo.equals(ceo1);
		System.out.println(ref);

	}

}
