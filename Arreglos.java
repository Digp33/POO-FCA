//los arreglos en java son objetos
//las funciones deben de llevar corchetes 
//
public class Arreglos {
	public static void main(String[] args) {
		char [] letras = new char[4];
		letras[0]='H';
		letras[1]='o';
		letras[2]='l';
		letras[3]='a';
		for(char c:letras){
			System.out.println(c);
		}

		String[]computadora ={"mouse","monitor", new String("Webcam"),new String("Teclado")};
			System.out.println(computadora.length);
			for(int i =0;i<computadora.length;i++){
				System.out.println(computadora[i]);
			}
			System.out.println(computadora);

		String texto = "anita lava la tina";
		String inverso ="";
		for(int i=texto.length();i>0;i--){
			inverso += texto.charAt(i-1);
		}
		System.out.println(inverso+"\r\n");
		byte[] miArreglo = {1,9,5,6,2,10,8,3};
		byte[] otroArreglo=new byte[miArreglo.length];
		System.arraycopy(miArreglo,0,otroArreglo,0,miArreglo.length);
		for (byte e:otroArreglo ) {
			System.out.println(e);
		}
		
}
}

