import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toString(n);
		
		for(int i=9; i>=0; i--) {
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}			
			//System.out.print(num.repeat(count));
			System.out.println(i+"°¡"+count+"°³");
		}
	}
}
