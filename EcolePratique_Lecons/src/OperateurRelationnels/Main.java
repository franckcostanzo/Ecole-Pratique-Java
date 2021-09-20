package OperateurRelationnels;

public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		boolean b1 = 1 < 2;
		boolean b2 = a <=3;
		boolean b3 = a == b;
		boolean b4 = 5 != b;
		boolean b5 = 2 > a;
		boolean b6 = a >= b;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2); 
		System.out.println("b3 = " + b3); 
		System.out.println("b4 = " + b4); 
		System.out.println("b5 = " + b5); 
		System.out.println("b6 = " + b6);
		
		String string1 = new String("oui");
		String string2 = new String("oui");
		
		boolean b7 = (string1 == string2);
		boolean b8 = string1.equals(string2);
		boolean b9 = string1.equals("oui");
		boolean b10 = string1.equals("non");
		
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
		System.out.println(b10);
		
	}

}
