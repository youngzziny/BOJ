import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		int find = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			if(num[i] == find) {
				result++;
			}
		}
	
		System.out.println(result);
	    
	}
}