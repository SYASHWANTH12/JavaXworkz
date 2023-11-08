package Interview;

public class Save {

	String[] S = new String[10];

	int pos;
	String name;

	public boolean save(String name) {

		for (int i = 0; i <= pos; i++) {
			String ref = S[i];
			if (ref != null && ref.equals(name)) {
				System.out.println("It is already stored try with the another name");
				return false;
			}

		}
		System.out.println("It can store the value ");
		this.S[pos] = name;
		System.out.println(name + " " + pos);
		pos++;
		return true;
	}

	public void getName() {
		for (int i = 0; i < pos; i++) {
			String F = S[i];
			System.out.println(F);
		}

	}

	public String findByName(String name) {

		for (int i = 0; i < pos; i++) {
			String temp = S[i];

			if (temp != null && temp.equals(name)) {
				System.out.println("It is found=" + temp + " " + i);
				return temp;
			}
		}
		System.out.println("it is not found");
		return null;
	}

	public static void main(String[] args) {
		Save D = new Save();
		D.save("yashu");
		D.save("bindu");

		D.getName();
		D.findByName("bindu");

	}
}
