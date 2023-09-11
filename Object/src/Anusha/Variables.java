package Anusha;

public class Variables {
	
	String name="anusha";
	int money=20;
	float balance=29.99f;
	char size='m';
	
	void   Method(String name,int money, float balance,char size)
	{
	   
	    this.name=name;//implict
	    this.money=money;
	    this.balance=balance;
	    this.size=size;
	}
	
	public static void main(String[] info)
	{
      //classname ref=keyword  classname
		//           = intantiontion
       Variables ref=new Variables();
       System.out.println(ref.name);//anusha
       System.out.println(ref.money);
       System.out.println(ref.size);
       System.out.println(ref.balance);
       
       ref.Method("Sujatha",20000,5000.45f,'c');
       System.out.println(ref.name);
       
       
	}
}
