package valid;

import com.xworkz.app.JuiceRepository;

public class JuiceServiceImp implements JuiceService {

	public JuiceRepository juice;

	public JuiceServiceImp(JuiceRepository juice) {
		this.juice = juice;

	}

	public boolean validation(String name) {

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 10) {
			boolean exist = juice.isExist(name);
			if (!exist) {
				juice.store(name);
				System.out.println("valid to work");
				return true;
			} else {
				System.err.println("it is same");
			}
		} else {
			System.out.println("not an valid name");
		}
		return false;
	}

}
