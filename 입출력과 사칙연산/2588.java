import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        kb.close();
        
        System.out.println(a*(b%10));
        System.out.println(a*((b/10)%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);

		        
	}
			
}