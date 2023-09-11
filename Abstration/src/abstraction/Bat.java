package abstraction;

public class Bat {
	Ball ball;
	public void winner(Ball ball) {
		System.out.println("Invoking  the ball");
	}
	public static void main(String[] info)
	{
		Ball ball=new Cricket();
		Bat bat=new Bat();
		ball.match();
		bat.winner(ball);
	}
}
