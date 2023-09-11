package abstraction;

public class FillUp implements Custom{
	
	public String name="yashu";
	@Override
	public String verifyCitizen() {
		System.out.println("Running the verifyCitizen");
		return name;
	}
	


}
