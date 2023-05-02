package examen;

import java.util.Scanner;

public class Bucles {
	static Scanner sc = new Scanner(System.in);
	
	public static void contar(){
		int numero=0;
		System.out.println("Dime un numero");
		numero = sc.nextInt();
		for(int i = 1;i<numero;i++) {
			System.out.println(i);
		}
	}
	public static void todoPar(){
		int numero=0;
		System.out.println("Dime un numero");
		numero = sc.nextInt();
		for(int i = 1;i<numero;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
