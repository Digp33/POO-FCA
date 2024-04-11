class saludo
{
	public void saludar(String nombre){
		System.out.println("Hola "+ nombre+" genio de la POO");
	}
}
public class primerP{
	public static void main(String[] args) {
		saludo s = new saludo();
		s.saludar("Daniel");
	}
}