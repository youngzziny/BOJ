import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        int x = kb.nextInt();
        int y = kb.nextInt();
        
        kb.close();
        
        if(x>0 && y>0) {
        	System.out.println("1");
        } else if(x<0 && y>0){
        	System.out.println("2");
        } else if(x<0 && y<0){
        	System.out.println("3");
        } else if(x>0 && y<0){
        	System.out.println("4");
        }
			
	}

}