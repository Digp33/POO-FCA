//atributo de clase y atributo local

class Alcance{//scope
	private int i=0;//atributo de la clase
	public void primerMetodo(){
		int i=4, j=5;//variable local
		i=i+j;//this hace referencia al atributo de la clase
		segundoMetodo(j);
	}
	public void segundoMetodo(int i){
		int j=9;//variable local
		this.i=i+j;//this hace referencia al atributo de la clase
	}
	public int getI(){
		return i;//Regresa la variable local si no existe el atributo de clase
	}
}

public class PruebaAlcance{
	public static void main(String[] args){
	Alcance alcance = new Alcance();
	alcance.primerMetodo();
	System.out.println(alcance.getI());
	}
}
