package specks;

public class Specs {
	public double price;
	public String type;
	public int howMuch;
	public boolean power;

	public boolean Concave() {
		System.out.println("Running the no argument value");
		Concave(2499,"flate");
		return true;
	}

	public void Concave(double price, String type) {
		Concave(1);
		System.out.println("Running the price and type");
	}

	public void Concave(int howMuch) {
		System.out.println("Running the howMuch ");
	}

}
