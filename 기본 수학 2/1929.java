package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		double squareRoot = Math.sqrt(n);
		
		ArrayList<Integer> primeList = new ArrayList<>();
		
		for(int i=2; i<=squareRoot; i++) {
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

		boolean arr[] = new boolean[n+1];
		arr[1] = false;
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = true;
		}
		
		for(int i=0; i<primeList.size(); i++) {
			for(int j=m; j<=n; j++) {
				if(arr[j] == true) {
					if(j != primeList.get(i)) {
						if(j % primeList.get(i) == 0) {
							arr[j] = false;
						}
					}
				}
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(arr[i] == true) {
				System.out.println(i);
			}
		}
	}
}
