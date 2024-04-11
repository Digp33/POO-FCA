class Animal{
	void hacerRuido(){System.out.println("GRRRRRRRRRRR");}
}
class Perro extends Animal{
	void hacerRuido(){System.out.println("Guau Guau");}
	void hacerElMuertito(){System.out.println("Gira patas arriba");}
}
class Gato extends Animal{
	Correa c = null;
	Gato(){ c = new Correa();}// El gato tiene un "has a" Correa.
	void hacerRuido(){System.out.println("Miau Miau");}
	void tieneCorrea(){System.out.println("El gato tiene correa?"+(c instanceof Correa));}
}
class Correa{}
public class Mascotas{
	public static void main (String args[]){
	Animal [] a = { new Animal(), new Perro(), new Gato()};
	for (Animal animal:a){
		animal.hacerRuido();
		if(animal instanceof Perro){
			Perro p = (Perro)animal;
			p.hacerElMuertito();
			}
		}
		Gato g = (Gato)Mascotas.comprar();
		g.hacerRuido();
		g.tieneCorrea();
	}
	public static Animal comprar(){
		return new Gato();//Gato es un animal
	}
}

