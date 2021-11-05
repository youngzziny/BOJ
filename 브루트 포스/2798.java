package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int card[] = new int[n];
		
		for(int i=0; i<n; i++) {
			card[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					
					int sum = card[i] + card[j] + card[k];

					if(sum <= m && sum > max) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}
