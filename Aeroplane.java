class Aeroplane{
	public static void main(String[] info)
	{
		System.out.println("The names of the biscuit");
		String aeroplane1  ="boeing";
		String aeroplane2 ="concorde";
		String aeroplane3="airbus380";
		
		String aeroplane4 ="wright flyer";
		String aeroplane5 ="piper";
		String aeroplane6 ="rutan voyager";
	
		String aeroplan7="lockhead";
	    String[] aero={aeroplane1,aeroplane2,aeroplane3,aeroplane4,aeroplane5,aeroplane6};
		String ref=aero[4];
		System.out.println("The biscuit in number 4 is="+ref);
		  aero[4]="airbus";
		System.out.println(  aero[4]);
		for(int a=0;a<aero.length;a++)
		{
			String y=aero[a];
			System.out.println(y);
		}
		System.out.println("----------------------");
		for( int b=aero.length-1;b>=0;b--)
		{
			String ya=aero[b];
			System.out.println(ya);
			
		}
		
	}
}