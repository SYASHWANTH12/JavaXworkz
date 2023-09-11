package Associate;

public class Shirt {
	Button button;
	

	public Shirt() {
		System.out.println("Invoking the default construtor");
	}

	public void Button(Button button) {
		this.button = button;
		button.BlueButton();
	}
	

	public static void main(String[] info) {
		Shirt shirt = new Shirt();
		Button button = new Button();
		button.BlueButton();
		shirt.Button(button);
		System.out.println(button.name);
		

	}

}
