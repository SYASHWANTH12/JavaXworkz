package valid;

import com.xworkz.app.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {
	PincodeRepository pincode;

	public PincodeServiceImpl(PincodeRepository pincode) {
		this.pincode = pincode;
	}

	@Override
	public boolean validation(String name) {
		System.out.println("Checking it is valid to store or not");

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 10)

		{
			System.out.println("The first condition is ok");
			boolean ref = pincode.isExist(name);
			if (ref == false) {
				pincode.store(name);
				System.out.println("it is valid ");
			} else {
				System.err.println("it is not valid");
			}

		} else {
			System.out.println("it is nots valid");
		}
		return false;
	}

}
