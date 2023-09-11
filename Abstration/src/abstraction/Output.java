package abstraction;

public class Output {
	WashingMachine washingmachine;

	public void cloths(WashingMachine washingmachine) {
		this.washingmachine = washingmachine;
		System.out.println("Invoking the ref of washing machine");
	}

	public static void main(String[] info) {
		WashingMachine M = new WorkingPrinciple();
		Output O = new Output();
		O.cloths(M);
		M.rotate();
	}
}
