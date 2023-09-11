package SToringMultiple;


public class ArtistServiceImpl implements ArtistService {
	Artist artist;
	

	public ArtistServiceImpl(Artist artist) {
		this.artist = artist;
	}

	public void Value(String name) {
		System.out.println("Checking the valid or invalid ");
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20)
		{
			System.out.println("it is valid");
			artist.name(name);
			

		}
		else {
			System.err.println("it is not valid");
		}
	}

	public static void main(String[] info) {
		
		Artist artist = new ArtistImpl();
		ArtistService S = new ArtistServiceImpl(artist);
		S.Value("onion");
		S.Value("");
	}
}
