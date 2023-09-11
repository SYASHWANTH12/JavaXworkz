package Runner;

import com.xworkz.app.JuiceRepository;
import com.xworkz.app.JuiceRepositoryImp;

import valid.JuiceServiceImp;

public class JuiceRunner {

	public static void main(String[] args) {
		JuiceRepository p=new JuiceRepositoryImp();
		JuiceServiceImp s=new JuiceServiceImp(p);
		s.validation("rice");
		s.validation("chips");
		s.validation("onion");
		
	}

}
