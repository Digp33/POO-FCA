public class Herencia1 {
	public static void main(String[] args) {
		new Delta();	
	}
}

class Alfa {
	public Alfa(){
		System.out.println("Alfa");
	}
}

class Beta extends Alfa {
	public Beta() {
		System.out.println("Beta");
	}
	public Beta(String b) {
		System.out.println(b);
	}
}

class Delta extends Beta {
	public Delta() {
		this("delta");
		System.out.println("Delta");
	}
	public Delta(String d) {
		super("beta");
		System.out.println(d);
	}
}

