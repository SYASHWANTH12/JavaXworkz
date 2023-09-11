class HelmetSafe{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in HelmetSafe");
		
		Helmet helmet=new Helmet("ISI","Full face");
		Helmet.printStatic();
		
		
		Helmet helmet1=new Helmet(6,"black");
		helmet1.printInstance();
	}
}