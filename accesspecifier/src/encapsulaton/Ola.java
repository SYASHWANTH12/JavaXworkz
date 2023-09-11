package encapsulaton;

public class Ola {
	private String name;
	private float distance;
	private int cost;
	private String board;

	int Name(String name) {
		this.name = name;
		System.out.println(name);
		return 5;
	}

	private void setDistance(float distance) {
		this.distance = distance;
	}

	public float getDistance() {
		distance = 27.5f;
		System.out.println(distance);
		return distance;
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("Running the cost of the ola=" + this.cost);
	}

	private int getCost() {
		return cost;
	}

	protected void setBoard(String whichBoard) {
		this.board=whichBoard;
		whichBoard = "white board";
		System.out.println("which board it is =" + whichBoard);
	}
	public String getBoard()
	{
		//System.out.println("which board it is =" + board);
		return board;
	}
	public String GetBoard()
	{
		setBoard("white board");
		return "white board";
	}

}
