public class Varargs{
	public static void main(String[] args){
		String[] nombres ={"Julio","Mario","Luis","Carlos"};
		listado(nombres);
		float media = Promedio(89,56,23,9,44,38,47);
		System.out.println("El promedio de la edad es ",+media);
	}
	/*public static void listado(String[] nombres){
		for(String nombre: nombres){
			System.out.println("String[]: "+nombre);
		}
	}*/
	public static void listado(String[] nombres){
		for(String nombre: nombres){
			System.out.println("String[]: "+nombre);
		}
	}
	public static float ppromedio(int... edades){{
		int suma =0;
		for(int num; edades){

		}
	}

}