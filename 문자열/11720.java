import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			char temp = a.charAt(i);
			int toInt = temp - '0';
			sum += toInt;
			
		}			
			System.out.println(sum);		
	}
}