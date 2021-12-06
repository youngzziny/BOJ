import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    int max = 0;
	    int min = 0;
	    
	    // 최대공약수
	    for(int i=1; i<=10000; i++) {
	    	if(a%i == 0 && b%i == 0) {
	    		max = i;
	    	}
	    }
	    
	    System.out.println(max);
	    
	    // 최소공배수
	    loop : for(int i=1; i<=b; i++) {
	    	for(int j=1; j<=a; j++) {
	    		if(a*i == b*j) {
	    			System.out.println(a*i);
	    			break loop;
	    		}
	    	}
	    }
	}
}