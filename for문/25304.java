import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int n = sc.nextInt();
		int temp = 0;
		
		for(int i=0; i<n; i++) {
			temp += sc.nextInt() * sc.nextInt();
		}
		
		if(total == temp) {
			System.out.println("Yes");			
		}else {
			System.out.println("No");	
		}
	    
	}
}