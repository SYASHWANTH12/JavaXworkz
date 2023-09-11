package com.xworkz.app;

public class EngineerRepositoryImp implements EngineerRepository {
	
	EngineerDTO[] dto=new EngineerDTO[TOTAL_ITEMS];
	int position;
	
	public void save(EngineerDTO D) {
		
		if(position<TOTAL_ITEMS) {
			System.out.println("it is within the boundry");
		this.dto[position]=D;
		
		System.out.println("Engineer"  + "position" +this.position);
		position++;
		}
		
	}
	@Override
	public boolean isExist(EngineerDTO D) {
		for(int i=0;i<=this.position;i++) {
			EngineerDTO temp=dto[i];
			if(temp!=null&& temp.equals(D)) {
				System.out.println("it cant not store");
				return true;
			}
		}
		
		return EngineerRepository.super.isExist(D);
		
	}
	@Override
	public EngineerDTO findBy(String name) {
		for(int i=0;i<=this.position;i++) {
			EngineerDTO ref=dto[i];
			if(ref.getName().equals(name)) {
				return ref;
			}
		}
		return null;
	}

}
