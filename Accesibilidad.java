public class Accesibilidad{
	public static void main (String [] args){
		Padre p = new Hijo();
		p.saludo();
	}
}
/*Los miembros de la clase padre deben de ser más abiertos*/
class Padre{
	private Padre(){this("A");}
	private Padre (String a){}
	public void saludo(){
		System.out.println("Padre");
	}
}
/* Las subclases deben de ser igual de accesibles, pero no menos accesibles*/
class Hijo extends Padre{
	protected Hijo(){super();}
	public void saludo(){
		System.out.println("Hijo");
	}
}