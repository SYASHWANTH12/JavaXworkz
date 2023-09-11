class Biscuit{
	public static void main(String[] info)
	{
		System.out.println("The names of the biscuit");
		String parleg="PARLEG";
		String goodDay="GOODDAY";
		String moonsMagic="MONSMAGIC";
		String oreo="OREO";
		String creamBiscuit="CREAMBISCUIT";
		String darkFantasy="DARKFANTASY";
		String horlics="HORLICS";
	    String[] Biscut={parleg,goodDay,moonsMagic,oreo,creamBiscuit,darkFantasy,horlics};
		String ref=Biscut[4];
		System.out.println("The biscuit in number 4 is="+ref);
		Biscut[4]="PARLEGE";
		System.out.println(Biscut[4]);
		for(int a=0;a<7;a++)
		{
			String y=Biscut[a];
			System.out.println(y);
		}
		System.out.println("----------------------");
		for(int b=Biscut.length-1;b>=0;b--)
		{
			String ya=Biscut[b];
			System.out.println(ya);
			
		}
		
	}
}