public class SobreEscritura3{
	public static void main(String[] args) {
		A a = new C();
		B b = (B)a;/*se hace un casteo de C a B, si se quitan los parentesis no va a funcionar por que 
		no se puede asignar un B a un C*/
		System.out.println(b.g());
	}
}

class A{
	public int f(){return 0;}
	public int g(){return 3;}
}
class B extends A{
	public int f(){return 1;}//si se instancia "a" en B y esta no existe se llama a la clase padre
	public int g(){return f();}/*regresa a C ya que la funcion f() si existe en la clase por ello no
	necesita tonar la f() en B*/
}

class C extends B{
	public int f(){return 2;}
}