public class Bidimencionales {
	public static void main(String[] args) {
		int [][] dosDim = new int [4][];
		int arr1[] = {4,8,9};
		int arr2[] = {12,18,23,6,33};
		int arr3[] = {5,45,7,50};
		int arr4[] = {28,4,31,49,93,73};
		//Asignaciones al arreglo bidimensional
		dosDim[0]=arr1;
		dosDim[1]=arr2;
		dosDim[2]=arr3;
		dosDim[3]=arr4;
		//EJERCICIO: presenta cada elemento del arreglo


		for (int i=0;i<dosDim.length ;i++ ) {
			for(int j=0;j<dosDim[i].length;j++){
				//int contador1 = i+1;
				//int contador2 = j+1;
				System.out.println("este es el arreglo: "+(i+1)+" con valor de: "+dosDim[i][j]+" en su posicion:"+(j+1));
			}
		 	
		 } 
	}}