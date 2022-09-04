package Application;

import java.util.Scanner;

import util.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Students std = new Students();
		
		System.out.println("Enter the student's name: ");
		std.nome = sc.nextLine();
		
		System.out.println("Grade 1: ");
		std.grade1 = sc.nextDouble();
		
		System.out.println("Grade 2: ");
		std.grade2 = sc.nextDouble();
		
		System.out.println("Grade 3: ");
		std.grade3 = sc.nextDouble();
		
		System.out.printf(std.result());

	}

}
