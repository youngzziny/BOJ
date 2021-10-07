package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Integer> primeList = new ArrayList<>();
		
		for(int i=2; i<=10000; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeList.add(i);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int n = sc.nextInt();
			int a = -1;
			int b = -1;
			
			exit: 
			for(int j=n/2; j<n; j++) {
				for(int k=0; k<primeList.size(); k++) {				
					if(primeList.get(k) == j) {
						for(int l=0; l<primeList.size(); l++) {
							if(primeList.get(l) == n-j) {
								a = n-j;
								b = j;
								break exit;
							}
						}
					}
				}
			}
			System.out.println(a + " " + b);
		}
	}
}
