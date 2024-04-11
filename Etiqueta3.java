public class Etiqueta3 {
	public static void main(String[] args) {
		System.out.println("etiqueta con contiene en for ");
		primero:
			for (int i =0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i==1){
						continue primero;
					}
					System.out.println("i="+i+", j="+j);
				}
			}

			System.out.println("etiqueta con contiene en for ");
		segundo:
			for (int i =0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i==1){
						break segundo;
					}
					System.out.println("i="+i+", j="+j);
				}
			}
}
}