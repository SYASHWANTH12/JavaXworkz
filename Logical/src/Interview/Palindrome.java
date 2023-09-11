package Interview;

public class Palindrome {
	
	public boolean palindrome(int number)
	{
		int originalnum=number;
		int sum=0;
		
		
		while(number!=0) {
		int rem=number%10;
		sum=sum*10+rem;
		number=number/10;
		}
		return sum==originalnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome=new Palindrome();
		int number=225;
		
		boolean result=palindrome.palindrome(number);
		
		System.out.println("The givven number is palindrome "+result);

	}

}
