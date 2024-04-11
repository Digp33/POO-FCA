public class Constructores1 {
	public static void main(String[] args) {
			new Hombre();
				//Las super clases son las que se crean primero y posteriormente las subclases
	}}

	class Chango{
		public Chango(){
			System.out.println("chango");
		}
	}
	class Homosapiens extends Chango{
		public Homosapiens(){
			System.out.println("Homosapiens");
		}
	}
	class Hombre extends Homosapiens{
		public Hombre(){
			System.out.println("Hombre");
		}
	}