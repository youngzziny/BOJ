package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static int factorial(int n) {
		
		if(n == 0) return factorial(1);
		if(n == 1) return n;
		
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(factorial(sc.nextInt()));
		
	}
}
