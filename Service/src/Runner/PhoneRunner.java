package Runner;

import com.xworkz.app.PhoneRepositaryImpl;
import com.xworkz.app.PhoneRepository;

import valid.PhoneServiceImpl;

public class PhoneRunner {
	public static void main(String[] info) {
		
	
	PhoneRepository  phone=new PhoneRepositaryImpl();
	PhoneServiceImpl phone1=new  PhoneServiceImpl(phone);
	phone1.validation(9945893812l);
	phone1.validation(6366006136l);
	phone1.validation(7204459493l);
}
}
