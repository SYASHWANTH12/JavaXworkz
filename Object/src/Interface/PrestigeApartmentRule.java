package Interface;

public class PrestigeApartmentRule implements ApartmentRule {
	@Override
	public void Constructor() {
		System.out.println("Running the Constructor");

	}

	@Override
	public void A() {
		System.out.println("Running the A");
	}

	@Override
	public void B() {
		System.out.println("Running the B");
	}
	public void C() {
		System.out.println("Running the C");
	}
	public void D() {
		System.out.println("Running the D");
	}
	public static void main(String[] info) {
		ApartmentRule rule = new PrestigeApartmentRule();
		rule.Constructor();
		BuildApartmentRule rule1 = new PrestigeApartmentRule();
		rule1.A();
		rule1.C();
		rule1.Constructor();
	}
}
