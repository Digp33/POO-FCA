public class Etiqueta2 {
	public static void main(String[] args) {
		int a=4, b=1;
		exterior:
			while (a>2){
				while(b<3){
					if (a==3&&b==2){
						break exterior;
					}
					System.out.println(a+" "+b);//4-1;4-2;3-1;break
					b++;
				}
				a--;
				b=1;

			}
}
}