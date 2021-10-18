import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = 1;
		
		if(s.equals(" ")) {
			count=0;
		}else {			
			s = s.trim();			
			
			for(int i=0; i<s.length(); i++) {
				char temp = s.charAt(i);
				if(temp==' ') {
					count++;
				}			
			}
		}
		System.out.println(count);
	}
}
