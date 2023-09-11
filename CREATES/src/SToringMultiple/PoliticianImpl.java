package SToringMultiple;



public class PoliticianImpl implements politician {
	private String[] N = new String[10];
	int pos;
	GROCARY YAHSU;
	

	public PoliticianImpl(GROCARY YAHSU) {
		this.YAHSU = YAHSU;
	}

	@Override
	public void condition(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 10) {
			this.YAHSU.main(name);
			System.out.println("it is valid");
		} else {
			System.err.println("it is not valid");
		}

	}
	public static void main(String[] info)
	{
		
		GROCARY YAHSU=new GrocaryImpl();
		politician P=new PoliticianImpl(YAHSU);
		P.condition("onion");
	}
}
