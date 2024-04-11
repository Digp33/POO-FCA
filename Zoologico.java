public class Zoologico{
	public static void main (String[] args){
		Animal a1 = new Animal("Tigre",120.500);
		Animal a2 = new Animal("Salmon",true);
		Animal a3 = new Animal("Tiranosaurio",15000.00,true);
		//a1.setNombre("Tigre de Bengala");
		//a1.setVertebrado(true);
		a2.setPeso(300.500);
		a3.setNombre("Velocirraptor");
		a3.setPeso(220000.0);
		System.out.println("Objetos de Animal");
		System.out.println("Animal 1 es : " +a1.getNombre()+" peso "+a1.getPeso()+" Vertebrado "+a1.getVertebrado());
		System.out.println("Animal 2 es : " +a2.getNombre()+" peso "+a2.getPeso()+" Vertebrado "+a2.getVertebrado());
		System.out.println("Animal 1 es : " +a3.getNombre()+" peso "+a3.getPeso()+" Vertebrado "+a3.getVertebrado());
		System.out.println("");
		System.out.println("Animal 1 "+ a1.comer("pollo"));
		System.out.println("Animal 2 "+ a2.comer("charal"));
		System.out.println("Animal 1 "+ a3.comer("Mamut"));
	}
}