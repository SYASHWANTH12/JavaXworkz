package toString;

public class Karchief {
	private int cost;
	private String brand;
	private boolean waterProof;
	private String colour;
	private char size;
	private int height;
	private int weidth;

	Karchief(int cost, String brand, boolean waterProof, String colour, char size, int height, int weidth) {
		this.cost = cost;
		this.brand = brand;
		this.waterProof = waterProof;
		this.colour = colour;
		this.size = size;
		this.height = height;
		this.weidth = weidth;
	}

	public String toString() {
		return "cost=" + cost + ",brand=" + brand + "waterproof=" + waterProof + ",colour=" + colour + ",size=" + size
				+ ",heigth=" + height + ",weidth=" + weidth;
	}
}
