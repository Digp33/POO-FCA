class Padre{
	public void metodo1(){
			System.out.println("M1, desde el padre");
	}
	public void metodo2(){
			System.out.println("M2, desde el padre");
	}
}

class Hijo extends Padre{
	@Override
	public void metodo1(){
			System.out.println("M1, desde el hijo");
	}
}
public class SobreEscritura2{
	public static void main(String[] args) {
		new Hijo().metodo1();
		new Hijo().metodo2(); //Invocacion virtual
		/*las funciones padre van a ser generalizadas
		 y las que estan en las hijas van a ser mas específicas*/
		new Padre().metodo1();
	}
}