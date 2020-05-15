package Golf;
import java.util.*;
public class Golfer implements Subject {
	ArrayList Observers = new ArrayList() ;
	String Name;
	int Strokes;
	int Par;
	
	public Golfer(String name)
	{
		Name = name;
	}
	public void registerObserver(Observer observer)
	{
		Observers.add(observer);
	}
	public void removeObserver(Observer observer)
	{
		if(Observers.contains(observer))
		{
			Observers.remove(observer);
		}
		else
			return;
	}
	public void notifyObserver(int strokes, int par)
	{
		
	}
	public void enterScore(int strokes, int par)
	{
		
	}
	public String getName() {
		return Name;
	}
	@Override
	public void update(int strokes, int par) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
