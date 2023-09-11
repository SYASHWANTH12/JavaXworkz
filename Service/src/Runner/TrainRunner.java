package Runner;

import com.xworkz.app.TrainNoRepository;
import com.xworkz.app.TrianNoRepositoryImpl;

import valid.TrainNoRepositoryServiiceImpl;

public class TrainRunner {
public static void main(String[] args) {
	TrainNoRepository repo=new TrianNoRepositoryImpl();
	TrainNoRepositoryServiiceImpl trainNoRepositoryServiiceImpl  = new TrainNoRepositoryServiiceImpl(repo);
	trainNoRepositoryServiiceImpl.validation("09438");
	trainNoRepositoryServiiceImpl.validation("019438");
	
}
}
