package com.xworkz.app;

public class LocationRepositoryImpl implements LocationRepository {
	String[] S = new String[10];
	int pos;

	public boolean store(String location) {
		if(pos<S.length)
		{
			System.out.println("it cleared first round");
			for(int i=0;i<=pos;i++) {
				if(S[i]!=null && S[i].equals(location)) {
					System.out.println("it is already stored");
					return false;
				}
			}
				this.S[pos]=location;
				System.out.println(location + " "+pos);
				pos++;
			
		
		}
		return false;
	}

	public static void main(String[] info) {
		LocationRepositoryImpl impl = new LocationRepositoryImpl();
		impl.store("bangalore");
		impl.store("bangalore");

	}
}