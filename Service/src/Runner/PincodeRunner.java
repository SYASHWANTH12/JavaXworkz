package Runner;

import com.xworkz.app.PincodeRepository;
import com.xworkz.app.PincodeRepositoryImpl;

import valid.PincodeServiceImpl;

public class PincodeRunner {
	public static void main(String[] info) {

		PincodeRepository pincode1 = new PincodeRepositoryImpl();
		PincodeServiceImpl ref1 = new PincodeServiceImpl(pincode1);
		ref1.validation("577201");
		ref1.validation("577202");
	}

}
