import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        kb.close();
        
        if(a>b)
        System.out.println(">");
                
        if(a<b)
        System.out.println("<");
        
        if(a==b)
        System.out.println("==");
		        
	}
			
}