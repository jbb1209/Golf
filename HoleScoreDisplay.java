package Golf;

public class HoleScoreDisplay implements Observer  {
	Observer Golfer;
	public HoleScoreDisplay(Observer golfer)
	{
		Golfer = golfer;
		
		
	}
	int Strokes;
	int pars;
	public void update(int strokes, int par)
	{
		
		Strokes = strokes;
		pars = par;
		displayCurrentScore();
	}
	public void displayCurrentScore()
	{
		System.out.print("Made par, "+ Strokes+ " under par, "+ pars+ "over par");
	}
}
