class CityRunner{
	public static void main(String[] info)
	{
		City city=new City();
		City city1=new City(25000,"The dress required is 45000");
		System.out.println(city.country);
		System.out.println(city.people);
		System.out.println(city.dressCode);
		System.out.println(city1.people);
		System.out.println(city1.dressCode);
	}
}