import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int room = sc.nextInt();
		int result = 0;
		int min = 2;
		int max = 2;
		
		if(room == 1) {
			result = 1;
		}else {
			for(int i=0; ; i++) {
				
				min = min + 6*i;
				max = max + 6*(i+1);

				if(min<=room && room<max) {
					result = i+2;
					break;
				}	
			}	
		}
		System.out.println(result);
	}
}