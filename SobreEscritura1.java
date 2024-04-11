class A{
	public String metodo1(){return "A";}
}

class B extends A{
	public String metodo1(){return "B";}
}

class C extends B{
	public String metodo1(){return "C";}
}

public class SobreEscritura1{
	public static void main(String[] args) {
		B b = new B(); System.out.println(b.metodo1());
		A a = new B(); System.out.println(a.metodo1());
		//se manda a llamaer al objeto del cual yo hago instancia
		C c = new C(); System.out.println(c.metodo1());
		  a = new A(); System.out.println(a.metodo1());
		//Tipos incompatibles: { C x = new B();B y = new A();C z = new A(); }

	}
}