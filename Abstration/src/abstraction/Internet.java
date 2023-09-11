package abstraction;

public class Internet {
	Intermediate intermediate;

	public void search(Intermediate intermediate) {
		System.out.println("Invoking the search");
		this.intermediate = intermediate;
		intermediate.connect();
	}

	public static void main(String[] info) {
		Intermediate I = new Browser();
		I.connect();
		Internet internet = new Internet();
		internet.search(I);

	}

}
