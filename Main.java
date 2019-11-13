public class Main {

	 public static void main(String[] args) {
		Produto assunto = new Produto();

		Cliente o1 = new Cliente("Joao");
		Cliente o2 = new Cliente("Fernando");
		Cliente o3 = new Cliente("Mateus");
		Cliente o4 = new Cliente("Gabriel");

		assunto.attach(o1);
		assunto.attach(o2);
		assunto.attach(o3);
		assunto.attach(o4);
		
		assunto.Baixarpreçopruduto();
		System.out.println("------");
		assunto.detach(o3);
		

		assunto.Baixarpreçopruduto();
		
	}
	
}
