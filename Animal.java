public class Animal{
	private String nombre;
	private double peso;
	 private boolean vertebrado;
	 //constructores
	 public Animal(String nombre, double peso){
	 	this.nombre = nombre;
	 	this.peso = peso;
	 }
	 public Animal(String nombre, boolean vertebrado){
	 this.nombre = nombre;
	 this.vertebrado = vertebrado;
	 }

	 public Animal (String nombre,double peso,boolean vertebrado){
	 this.nombre=nombre;
	 this.peso=peso;
	 this.vertebrado=vertebrado;
	 }

	 //metodo GET sirven para obtener valores
	 public String getNombre(){
	 return nombre;
	 }

	 public boolean getVertebrado() {
	 return vertebrado;
	 }

	 public double getPeso(){
	 return peso;
	 }

	 public void setNombre(String nombre){
	 this.nombre = nombre;
	 }

	 public void setVertebrado(boolean vertebrado){
	 this.vertebrado = vertebrado;
	 }

	 public void setPeso(double peso){
	 this.peso = peso;
	 }

	 public String comer (String alimento){
	 return nombre + " comiendo: " +alimento;
	 }
}