public class Cast{
	public static void main(String[] args){
	long largo = 99;
	int entero = (int) largo;
	System.out.println(entero);
	
	int entero2=30;
	short corto =(short)entero2;
	System.out.println(corto);

	short corto2 = 12;
	byte unbyte =(byte) corto2;
	System.out.println(unbyte);

	int entero3 =11;
	short corto3 = (byte)entero3;
	System.out.println(corto3);

	double undouble = 26.78;
	float unfloat = (float)undouble;
	System.out.println(unfloat);

	float otrofloat = 123.45f;
	int otroentero = (int)otrofloat;
	System.out.println(otroentero);
	}
}