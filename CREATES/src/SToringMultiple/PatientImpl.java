package SToringMultiple;

public class PatientImpl implements Patient  {
	char[] C=new char[100];
	int Number=C.length-50;
	


@Override
public void main(char letter) {
	C[Number]=letter;
	Number--;
	System.out.println(letter+" "+Number);
	
	
	
	
}
	public static void main(String[] args) {
		PatientImpl impl=new PatientImpl();
		impl.main('9');
		impl.main('9');
		impl.main('9');
		impl.main('9');
		impl.main('9');
		impl.main('9');
		impl.main('9');
	}
	
}

