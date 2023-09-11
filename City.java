class City{
	String country;
	int people;
	String dressCode;
	City()
	{
		System.out.println("+++++++++++++++++++++++++++++");
		this.country="shivamogga";
		this.people=45000;
		this.dressCode="Formals";
	}
	City(int food,String dressRequired)
	{
		System.out.println("======================================");
		this.people=food;
		this.dressCode=dressRequired;
		
	}
}