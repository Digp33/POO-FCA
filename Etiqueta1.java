public class Etiqueta1{
	public static void main(String[] args){
	int k=2;
	fuera:
		while(true){
			dentro:
				for(int j=6;j>2;j--){
					k=8-j;//6=2;5=3;4=4;3=5
					if(j==3){
						break fuera;
					}
					continue dentro;
				}
		}
		System.out.println(k);
	}
}