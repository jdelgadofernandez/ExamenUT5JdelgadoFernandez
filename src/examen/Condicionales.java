package examen;

import java.util.Scanner;

public class Condicionales {
	static Scanner sc = new Scanner(System.in);
	public static void parImpar(){
		int numero=0;
		System.out.println("Dime un numero");
		numero = sc.nextInt();
		if (numero%2==0) {
			System.out.println("Tu numero es par");
		}
		else {
			System.out.println("Tu numero es impar");
		}
	}
	public static void posNegCero(){
		int numero=0;
		System.out.println("Dime un numero");
		numero = sc.nextInt();
		if (numero>0) {
			System.out.println("Tu numero es positivo");
		}
		else if (numero==0){
			System.out.println("Tu numero es cero");
		}
		else {
			System.out.println("Tu numero es negativo");
		}
	}
}
