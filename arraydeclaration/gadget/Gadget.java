package arraydeclaration;

public class Gadget {
	public String name;
	public double price;
	public String brand;

	public void Phone() {
		Phone("realme", 29999);
		System.out.println("Running the no argument value");
	}

	public void Phone(String name, double price) {
		Phone("Vivo");
		System.out.println("Running the name and price");

	}

	public void Phone(String brand) {
		System.out.println("Running the brand");
	}
}
