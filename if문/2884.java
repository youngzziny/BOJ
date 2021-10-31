import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        int h = kb.nextInt();
        int m = kb.nextInt();
        
        kb.close();
        
        if(m>=45) {
        	System.out.println(h+" "+(m-45));
        } else if(h==0 && m<45){
        	System.out.println("23"+" "+(m+15));
        } else if(h!=0 && m<45) {
        	System.out.println((h-1)+" "+(m+15));
        }
			
	}

}