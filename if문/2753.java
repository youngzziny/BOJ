import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        int year = kb.nextInt();
        
        kb.close();
        
        if((year%4==0 && year%100!=0) || year%400==0) {
        	System.out.println("1");
        } else {
        	System.out.println("0");
        }
	}
			
}