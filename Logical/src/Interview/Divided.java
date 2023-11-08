package Interview;

public class Divided {
int m;
int n;
public void divided(int m,int n)
{
	this.m=m;
	this.n=n;
	if(m>n)
	{
		System.out.println("m value is greater than n"+m);
	}else {
		System.out.println("n is greater"+n);
	}
	for(int i=1;i<=m;i++)
	{
		if(m%i==0 && n%i==0)
		{
			System.out.println(i);
		}else {
			System.out.println("THe number which are not able to divide"+i);
		}
	}
}
public static void main(String[] args) {
	Divided divided=new Divided();
	divided.divided(5, 25);
}
}
