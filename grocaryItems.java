class grocaryItems{
public static void main(String[] items)
{
	String item1=" Bread";
    String item2= "Milk";
    String item3="Eggs";
    String item4="Apples";
    String item5="Rice";
	
	String[] Grocary={item1,item2,item3,item4,item5};
	for(int  i=0;i<=4;i++)
	{
		String ref=Grocary[i];
		System.out.println(ref);
	}
	}
}