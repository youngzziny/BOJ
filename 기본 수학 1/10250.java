import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int ho = 0;
			int F = 0;
			
			if(N%H == 0) {
				ho = N/H;
				F = H;
			}else {
				ho = (N/H)+1;
				F = N%H;
			}			
			
			if(ho>=10) {
				System.out.println(F+""+ho);				
			}else {
				System.out.println(F+"0"+ho);
			}
		}		
	}
}