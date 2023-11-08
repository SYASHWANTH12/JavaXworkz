package Interview;

public class PrimeNumber {
private int a;
private int b;
public void D(int a,int b)
{
	if(a/b==1)
	{
		System.out.println("it is a prime number");
	}else
	{
		System.err.println("It is not a prime number");
	}
}
public static void main(String[] args) {
	PrimeNumber N=new PrimeNumber();
	N.D(0, 0);
}
}
