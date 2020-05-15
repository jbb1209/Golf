package Golf;

public class RoundScoreDisplay implements Observer {
	Observer Golfer;
	public RoundScoreDisplay(Observer golfer)
	{
		Golfer = golfer;
	}
	int tStrokes=0;
	int tPar=0;
	public void RoundScoreDisplay(Golfer golfer)
	{
		Golfer = golfer;
	}
	public void update(int strokes, int par)
	{
		tPar = tPar + par;
		tStrokes= tStrokes +strokes;
	}
	public void displayRoundScore()
	{
		System.out.print("Made par, "+ tStrokes+ " under par, "+ tPar+ "over par");
	}
}
