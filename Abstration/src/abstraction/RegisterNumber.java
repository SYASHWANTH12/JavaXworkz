package abstraction;

public class RegisterNumber {
	College college;

	public void usn(College college) {
		this.college = college;
		college.branch();
		College.fees();

	}

	public static void main(String[] info) {
		College C = new Admission();
		RegisterNumber R = new RegisterNumber();
		C.branch();
		R.usn(C);
		System.out.println(College.fees());
	}

}
