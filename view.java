import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class view implements Subject{
	
	private List<Observer> observers;
	private int Preço;
	
	public void viewSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(this, Preço);
		}
	}
	
	public void generateNewNumber() {
		Random random = new Random();
		Preço = random.nextInt();
		// Após a modificacao, avisa os observadores
		notifyObservers();
	}
	

}
