import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Produto implements Subject{
	
	private List<Observer> observers;
	private int Preço;
	
	public Produto() {
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
	
	public void Baixarpreçopruduto() {
		Random random = new Random();
		Preço = random.nextInt();
		// Após a modificacao, avisa os observadores
		notifyObservers();
	}
	

}
