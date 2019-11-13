
public class Cliente implements Observer{
	
	private int Usuario;
	private String name;
	
	public Cliente(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject s, Object o) {
		Usuario = (Integer) o;
		System.out.println("Observador "+name+" atualizado: Valor = "+Usuario);
	}

}
