package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int side1 = (int) Math.pow(sc.nextInt(), 2);
			int side2 = (int) Math.pow(sc.nextInt(), 2);
			int side3 = (int) Math.pow(sc.nextInt(), 2);
			
			if(side1 == 0) break;
			
			int a = side1;
			int b = side2;
			int c = side3;
			
			if(side1 > c) {
				a = side2;
				b = side3;
				c = side1;
			}
			if(side2 > c) {
				a = side3;
				b = side1;
				c = side2;
			}
			
			System.out.println(a+b == c ? "right" : "wrong");
		}
		
	}
}
