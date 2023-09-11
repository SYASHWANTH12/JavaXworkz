package SToringMultiple;

public class JacketImpl implements Jacket{
	int[] I=new int[20];
	int[] I1=new int[10];
	int position;
	int po=I1.length-1;
	@Override
	public void values(int NO) {
		I[position]=NO;
		position ++;
		I1[po]=NO;
		System.out.println("The number stored is  " +NO+"  the position of the number is "+ position);
		System.out.println("The number stored is  " +NO+"  the position of the number is "+ po);
		po--;
	}
	public static void yashu() {
		
	}
	public static void main(String[] info)
	{
		Jacket J=new JacketImpl();
		J.values(2);
		J.values(2);
		J.values(2);
		J.values(2);
		J.values(2);
	}
}



