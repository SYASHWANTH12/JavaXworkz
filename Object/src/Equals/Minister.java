package Equals;

public class Minister {
private int salary;
private String name;
public Minister()
{
	System.out.println("Running no argument value");
}
public Minister(int salary,String name)
{
	System.out.println("Running the minister");
	this.salary=salary;
	this.name=name;
}
public boolean equals(Object obj)
{
	if(obj!=null)
	{
		System.out.println("It obj is not equal to null");
		if(obj instanceof Minister)
		{
			System.out.println("The obj is of the same class");
			Minister S=(Minister)obj;
			Minister Y=this;
		
		
				if(Y.salary==S.salary)
			{
				System.out.println("Both the values are same ");
				return true;
			}
			else {
				System.err.println("Both are diffenent");
				
			}
		}
	}else {
		System.err.println("the obj is pointing to the null");
	}
	return true;
}
}


