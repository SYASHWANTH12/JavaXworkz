package com.xworks.repositary;

import com.xworks.dto.AadharDTO;

public class AadharRepositaryImpl implements AadharRepositary{
	private final int TOTAL_VALUE=10;
	AadharDTO[] aadhar=new AadharDTO[TOTAL_VALUE];
	int pos;
	
	@Override
	public void save(AadharDTO dto) {
		if(pos<TOTAL_VALUE)
		{
			this.aadhar[pos]=dto;
			System.out.println(dto+" "+pos);
			pos++;
			
		}
		
		
	}

}
