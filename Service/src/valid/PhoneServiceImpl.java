package valid;

import com.xworkz.app.PhoneRepository;

public class PhoneServiceImpl implements Phoneservice {
	private PhoneRepository phone;
public PhoneServiceImpl(PhoneRepository phone) {
	this.phone=phone;
}
	@Override
	public boolean validation(long numbers) {
		if (numbers != 0) {
			System.out.println("It as cleared First check");
			boolean temp = phone.isExist(numbers);
			if (temp==false) {
				phone.store(numbers);
				System.out.println("The value is stored inside the database");
                  return true;
			}
			else {
				System.out.println("It can not be stored");
			}
		}else {
			System.out.println("It as not cleared first round");
		}
		return false;
	}

}
