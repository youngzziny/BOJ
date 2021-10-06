package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		double squareRoot = Math.sqrt(246912);
		
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
		
		boolean arr[] = new boolean[246913];
		
		arr[1] = false;
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = true;
		}
		
		for(int i=0; i<primeList.size(); i++) {
			for(int j=2; j<arr.length; j++) {
				if(arr[j] == true) {
					if(j != primeList.get(i)) {
						if(j % primeList.get(i) == 0) {
							arr[j] = false;
						}
					}
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int n = sc.nextInt();
			int count = 0;
			
			if(n == 0) {
				break;
			}			
			
			for(int i=n+1; i<=2*n; i++) {
				if(arr[i] == true) {
					count++;
				}
			}
			
			System.out.println(count);
		}		
	}
}
