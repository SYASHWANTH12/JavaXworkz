package com.xworks.repositary;

import com.xworks.dto.ApplicationDTO;

public class ApplicationRepositaryImpl implements ApplicationRepositary {
	ApplicationDTO[] A = new ApplicationDTO[10];
	int pos;

	public void save(ApplicationDTO dto) {
		this.A[pos] = dto;
		System.out.println(dto + "   " + pos);
		pos++;

	}

	@Override
	public boolean isExist(ApplicationDTO dto) {
          for(int i=0;i<=pos;i++)
          {
        	  ApplicationDTO G=A[i];
        	  if(G!=null && G.equals(dto))
        	  {
        		  System.err.println("Sry it can not store");
        		  return true;
        	  }else {
        		  System.out.println("It is not present in the database");
        	  }
          }
		return false;
	}

	@Override
	public ApplicationDTO findByName(String name) {
		for (int i = 0; i <= pos; i++) {
			ApplicationDTO B = A[i];
			if (B.getname().equals(name)) {
				System.out.println("it is found " + B);
				return B;
			}
		}
		return null;
	}
	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {
		for(int i=0;i<=pos;i++)
		{
			ApplicationDTO M=A[i];
			if(M!=null && M.getname().equals(name) && M.getdevelopedBy().equals(developedBy))
			{
				System.out.println(M);
				return M;
			}
		}
		return null;
	}

	public ApplicationDTO findAll() {
		for (int i = 0; i <= pos; i++) {
			ApplicationDTO B = A[i];
			System.out.println(B);

		}
		return null;
	}

	@Override
	public ApplicationDTO findByDevelopedBy(String name) {
		for (int i = 0; i < pos; i++) {
			ApplicationDTO H = A[i];
			if (H.getname().equals(name)) {
				System.out.println("The developer name=" + H.getdevelopedBy());
				return H;
			} else {

			}
		}
		return null;
	}
}