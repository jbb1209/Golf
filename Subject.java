package Golf;

public interface Subject extends Observer {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver(int strokes, int par);
	
}
