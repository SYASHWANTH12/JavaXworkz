package com.xworks.repositary;

import com.xworks.dto.NewsPaperDTO;

public class NewsPaperRepositaryImpl implements NewsPaperRepositary {
	NewsPaperDTO[] dto=new NewsPaperDTO[10];
	int pos;

	@Override
	public void save(NewsPaperDTO dtos) {
		if(pos<10) {
			dto[pos]=dtos;
			System.out.println(dtos+ "  "+pos);
			pos++;
			
		}
		

	}

}
