package examen;

import java.util.Scanner;

public class TratamientoCadenas {
	static Scanner sc = new Scanner(System.in);
	
	public static void cadena() {
		String palabra1 = "";
		String palabra2 = "";
		String completo = "";
		System.out.println("Dime una palabra");
		palabra1 = sc.nextLine();
		System.out.println("Dime una segunda palabra");
		palabra2= sc.nextLine();
		completo = palabra1+palabra2;
		System.out.println("La palabra completa es " + completo);
	}
	
	public static void contarA() {
		String palabra = "";
		int numeroA= 0;
		System.out.println("Dime una palabra");
		palabra = sc.nextLine();
		for (int i = 0; i<palabra.length();i++) {
			String letra = palabra.substring(i,i+1);
			if (letra.equals("a")) {
				numeroA++;
			}
		}
		System.out.println("Tu palabra tiene "+ numeroA + " As");
	}
}
