package Interview;




	public class LocationRepositoryImpl1 implements LocationRepository {
	    String[] S = new String[10];
	    int pos = 0;

	    public boolean store(String location) {
	        if (pos < S.length) {
	            // Check for duplicates
	            for (int i = 0; i < pos; i++) {
	                if (S[i].equals(location)) {
	                    System.out.println("Location already exists in the storage.");
	                    return false; // Return false as location is already present
	                }
	            }
	            // Store the new location
	            S[pos] = location;
	            System.out.println(location +" "+pos);
	            pos++;
	            return true; // Return true as location was successfully stored
	        } else {
	            System.out.println("Out of storage");
	            return false; // Return false as storage is full
	        }
	    }

	    public static void main(String[] info) {
	        LocationRepositoryImpl1 impl = new LocationRepositoryImpl1();
	        impl.store("Shivamogga");
	        impl.store("bangalore");
	    }
	}

	interface LocationRepository {
	    boolean store(String location);
	}


