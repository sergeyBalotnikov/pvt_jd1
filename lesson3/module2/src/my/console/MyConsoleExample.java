package my.console;

import java.io.Console;

public class MyConsoleExample {
	public static void main(String[] args){
		Console console = System.console();
		System.out.println("enter length a: ");
		String A = console.readLine();
		System.out.println("enter width b: ");
		String B = console.readLine();
		System.out.println("enter radius r: ");
		String R = console.readLine();
		
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);
		int r = Integer.parseInt(R);
		
		if(Math.sqrt(a*a + b*b)<r*2){
		System.out.println("A circle of radius "+r+" can close the hole");
			
		} else {	
		System.out.println("A circle of radius "+r+" can't close the hole");
	}
		
	}
	
}