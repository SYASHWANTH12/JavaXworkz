package com.xworkz.app;

public class PhoneRepositaryImpl implements PhoneRepository {
long[] no=new long[TOTAL_VALUE];
int pos;
	@Override
	public void store(long  number) {
		this.no[pos]=number;
		System.out.println("The phone number stored is  "+number+"  In the position  "+pos);
		pos++;
		
	}
	public boolean isExist(long numbers) {
		for(int i=0;i<=pos;i++) {
			long ref=no[i];
	if( ref!=0 && ref==numbers)
	{
				System.err.println("This numbers is already stored sry try with another number");
				return true;
			}else {
				System.out.println("These number is not stored ");
			}
		}
		return false;
	}
	

}
