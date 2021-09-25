package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int tempNum = num;
		int cycle = 0;

		while(true) {
			int newNum = (tempNum%10)*10 + ((tempNum/10) + (tempNum%10))%10;
			cycle++;
			if(newNum == num){
				break;
			}
			tempNum = newNum;
		}		
		System.out.println(cycle);
	}
}