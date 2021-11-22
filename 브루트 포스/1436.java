import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 0;
		int series = 0;
		
		while(true) {
			num++;
			String st = Integer.toString(num);
			 if(st.contains("666")) {
				 series++;
			 }
			 if(series == n) {
				 break;
			 }
		}
		System.out.println(num);
	}
}
