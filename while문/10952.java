package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int sum = sc.nextInt() + sc.nextInt();
			if(sum == 0)
				break;
			System.out.println(sum);
		}
		
		sc.close();
	}
}
