package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		int min = -1;
		
		for(int i=m; i<=n; i++) {			
			if(i != 1) {
				int isPrime = 1;
				
				for(int j=2; j<i; j++) {
					if(i != j) {
						if(i % j == 0) {
							isPrime = 0;
						}
					}
				}
				
				if(isPrime == 1) {
					sum += i;
					
					if(min == -1) {
						min = i;
					}
				}
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
		}
		System.out.println(min);
	}
}
