class BadmintonRunner{
	public static void main(String[] info)
	{
		System.out.println("Running the Badminton ");
		Badminton badminton=new Badminton();
		Badminton badminton1=new Badminton();
		System.out.println(badminton.type   );
		System.out.println(badminton.cost   );
		System.out.println(badminton.player );
		System.out.println(badminton.coat   );
		System.out.println(badminton.place  );
		badminton.type="Hard";
		badminton.cost  =6678;
		badminton.player="yashwanth";
	    badminton.coat  ="big coat";
        badminton.place ="Mysuru";
		System.out.println("====================================");
		System.out.println(badminton.type   );
		System.out.println(badminton.cost   );
		System.out.println(badminton.player );
		System.out.println(badminton.coat   );
		System.out.println(badminton.place  );
	}
}