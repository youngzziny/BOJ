import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i=0; i<T; i++) {
			
			int floor = sc.nextInt();
			int ho = sc.nextInt()-1;
			
			int arr[][] = new int [floor+1][ho+1];
			
			for(int f=0; f<floor+1; f++) {
				arr[f][0] = 1;
			}
			
			
			for(int h=0; h<ho+1; h++) {
				arr[0][h] = h+1;
			}
			
			for(int f=1; f<floor+1; f++) {
				for(int h=1; h<ho+1; h++) {
					arr[f][h] = arr[f-1][h] + arr[f][h-1];
				}
			}
			
			System.out.println(arr[floor][ho]);
			
		}		
	}
}