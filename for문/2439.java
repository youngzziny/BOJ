package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		String star = "*";
		String space = " ";
		
		for(int i=1; i<=t; i++) {
			System.out.print(space.repeat(t-i));
			System.out.println(star.repeat(i));
		}
	}
}
