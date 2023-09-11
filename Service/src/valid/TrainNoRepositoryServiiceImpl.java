package valid;

import com.xworkz.app.TrainNoRepository;

public class TrainNoRepositoryServiiceImpl implements TrainNoRepositoryServiice {
	private TrainNoRepository trainNoRepository;

	public TrainNoRepositoryServiiceImpl(TrainNoRepository trainNoRepository) {
		this.trainNoRepository = trainNoRepository;
	}

	@Override
	public boolean validation(String trainno) {
		System.out.println("It is valid or not");
		if (trainno != null && !trainno.isEmpty() && trainno.length() > 3 && trainno.length() < 10)

		{
			boolean ref = trainNoRepository.isExist(trainno);
			if (!ref) {
				System.out.println("It is valid to enter");
				trainNoRepository.store(trainno);
				return true;
			} else {
				System.out.println("It is already stored");
			}
		} else {
			System.out.println("it is not valid ");
		}
		return false;
	}
}
