//1-7;2-6;3-5;4-4
public class DeEtiqueta1 {
	public static void main(String[] args) {
		int x = 7;
		int y = 3;
		exterior:
		while(x > y) {
			for(int i=1; i<y; i++) {
				System.out.println(i);
				System.out.println(x);
				if(x==y) {
					break exterior;
				} else {
					x--;
					System.out.println(x);
				}
			}
		}
	}
}