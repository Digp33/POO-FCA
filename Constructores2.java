public class Constructores2 {
	public static void main(String[] args) {
			new Abajo("D");

	}}

	class Arriba {
	public Arriba (){//constructor por defecto
			System.out.println("A");
	}
	public Arriba(String s) {
			this();//llama al primer constructor
			System.out.println(s);
	}
	}
class Intermedia extends Arriba{
	public Intermedia(){
		//super("a");//llama al constructor de la clase padre
		System.out.println("B");
	}
}

class Abajo extends Intermedia{
	public Abajo(String x){
		System.out.println(x);
	}
}

