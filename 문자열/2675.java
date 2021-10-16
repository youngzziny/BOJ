import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String p = "";
		
		for(int i=0; i<t; i++) {
			
			int r = sc.nextInt();
			String s = sc.next();			
			
			for(int j=0; j<s.length(); j++) {
				
				char temp = s.charAt(j);
				
				for(int k=0; k<r; k++) {
					p += temp;
				}
			}
			System.out.println(p);
			p = "";
		}		
	}
}