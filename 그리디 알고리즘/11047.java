import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int coin[] = new int [n];
		int count = 0;
		
		int max = 0;
		int maxIndex = 0;
		
		for(int i=0; i<n; i++) {
			coin[i] = sc.nextInt();
			
			if( (k - coin[i]) >= 0) {
				max = coin[i];
				maxIndex = i;
			}
		}
		
		while(true) {
			
			if(k < coin[maxIndex]) {
				maxIndex--;
			}else {			
				// System.out.println(coin[maxIndex]);
				k = k - coin[maxIndex];
				count ++;
			}
			
			if(k == 0) {
				System.out.println(count);
				break;
			}
		}
			
	}
}
