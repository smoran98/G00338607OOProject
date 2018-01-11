package ie.gmit.sw;

import java.util.Scanner;

public class Menu {

	private Scanner console = new Scanner(System.in);

	public Menu() throws InterruptedException {

		System.out.println("Enter file name 1: ");
		String f1 = console.next();

		System.out.println("Enter file name 2: ");
		String f2 = console.next();

		System.out.println("Enter Shingle size: ");
		int shingleSize = console.nextInt();

		System.out.println("Enter k size: ");
		int k = console.nextInt();

		System.out.println("Enter pool size: ");
		int poolSize = console.nextInt();

		new Launcher().Launch(f1, f2, shingleSize, k, poolSize);

	}

}