package tableau;

public class exerciceUn {
	
	public static void main(String[] args) {
		
		int array1 [] = new int [8];
		for (int i = 0; i < array1.length ; i++) {
			array1[i] = 3;
		}
		
		for ( int i=0 ; i<array1.length; i++) {
			System.out.println("Le rang" + i + " correspond à la valeur : " + array1[i]);
		}
		
//		for ( int eachInt : array1) {
//		System.out.println(array1);
//		}
		
	}
	
}
