package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = w-x <= x ? w-x : x;
		int b = h-y <= y ? h-y : y;
		
		System.out.println(a <= b ? a : b);
		
	}
}
