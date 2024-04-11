public class Operadores{
	public static void main(String[] args){
	int a= 20;
	int b=10;
	++a; //preincremento
	b++;//postincremento
	//cuando es pre o post al siguiente uso de la variable se aplica. 
	System.out.println(a+" "+b);
	int c =20;
	int d =10;
	int e= c-++d;//posicionamiento de d (lo hace despues)
	System.out.println(e+" "+d);

	int f = 10;
	f = f++ + f - f-- -f-- + ++f;
	System.out.println(f);
	int g =20;
	int h =++g - g-- + g++ - g--;
	System.out.println(h+" "+g);

	}
}