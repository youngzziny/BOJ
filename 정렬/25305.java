import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cut = sc.nextInt() - 1;
		
		Integer[] score = new Integer[num];
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score, Collections.reverseOrder());
		
		System.out.println(score[cut]);
	}
}