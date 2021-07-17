package exerciciosfixacao1;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle widht and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
	
}
