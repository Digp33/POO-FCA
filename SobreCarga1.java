class Animal{
	String nombre;
	double peso;
	public Animal (String nombre,double peso){
		this.nombre=nombre;
		this.peso=peso;
	}
	public String getNombre(){return nombre;}
	public double getPeso(){return peso;}
}

class Pez extends Animal{
	char calidad;
	public Pez(String nombre, double peso){
		super(nombre,peso);
	}
	public void setCalidad(char calidad){this.calidad=calidad;}
	public char getCalidad(){return calidad;}
}

class Cazador{
	//El metodo cazar tiene sobrecarga (Overload)
	public void cazar(Animal a){
	System.out.println("Caza un animal: "+a.getNombre()+", peso: "+a.getPeso());
	}
	public void cazar(Pez p){
	System.out.println("Caza un pez: "+p.getNombre()+", peso: "+p.getPeso()+", Calidad: "+p.getCalidad());
	}
}

public class SobreCarga1{
	public static void main(String[] args) {
		Animal animal = new Animal("Yeti",210.50);
		Pez pez = new Pez("carpa",20.50);
		Pez delfin = new Pez("delfin",60.50);
		pez.setCalidad('A');
		Cazador cazador = new Cazador();
		cazador.cazar(animal);
		cazador.cazar(pez);
		cazador.cazar(delfin);
	}
}
