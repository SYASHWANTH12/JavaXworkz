package toString;

public class Pendent {
	private String Hanging;
	private String Suspended;
	private String	Dangling;
	private String Vertical;
	private String Gravityaffected;
	private String Centered;
	private String Aligned;
	private String Elongated;
	private String Tethered;
	private String Unobstructed;
	private String Freemoving;
	private String Pendulous;
	@Override
	public String toString() {
		return "Pendent [Hanging=" + Hanging + ", Suspended=" + Suspended + ", Dangling=" + Dangling + ", Vertical="
				+ Vertical + ", Gravityaffected=" + Gravityaffected + ", Centered=" + Centered + ", Aligned=" + Aligned
				+ ", Elongated=" + Elongated + ", Tethered=" + Tethered + ", Unobstructed=" + Unobstructed
				+ ", Freemoving=" + Freemoving + ", Pendulous=" + Pendulous + "]";
	}

	public Pendent(String hanging, String suspended, String dangling, String vertical, String gravityaffected,
			String centered, String aligned, String elongated, String tethered, String unobstructed, String freemoving,
			String pendulous) {
		super();
		Hanging = hanging;
		Suspended = suspended;
		Dangling = dangling;
		Vertical = vertical;
		Gravityaffected = gravityaffected;
		Centered = centered;
		Aligned = aligned;
		Elongated = elongated;
		Tethered = tethered;
		Unobstructed = unobstructed;
		Freemoving = freemoving;
		Pendulous = pendulous;
	}
	
	
}
