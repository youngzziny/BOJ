import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		int bag = 0;		
		
		while(true) {
			
			if(kg < 3) {
				bag = -1;
				break;
			}else if(kg % 5 == 0) {
				bag += kg / 5;
				break;
			}else{				
				kg -= 3;
				bag++;
				if(kg == 0) break;
			}
			
		}
		
		System.out.println(bag);
	}
}