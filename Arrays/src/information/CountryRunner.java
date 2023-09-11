package information;

public class CountryRunner {
	public static void main(String[] info)
	{
		System.out.println("Running all the program");
		Country country=new Country();
		System.out.println(country.name);
		System.out.println(country.code);
		President president=country.A;
		System.out.println(president.stateForm);
		PrimeMinister primeminister=president.B;
		System.out.println(primeminister.income);
		System.out.println(primeminister.primeMinister);
		SecurityHead securityhead=primeminister.C;
		System.out.println(securityhead.name);
		System.out.println(securityhead.salary);
		PersonalAssitant personalassitant=securityhead.D;
		System.out.println(personalassitant.name);
		System.out.println(personalassitant.salary);
	
		
	}

}
