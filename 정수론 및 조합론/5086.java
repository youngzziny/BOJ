package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			if(first == 0) break;
			
			if(first > second) {
				if(first%second == 0) {
					System.out.println("multiple");
				}else {
					System.out.println("neither");
				}
			}else {
				if(second%first == 0) {
					System.out.println("factor");
				}else {
					System.out.println("neither");
				}
			}
		}
	}
}
