import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // 문제 조건 : N은 항상 32비트 부호있는 정수로 표현할 수 있다
	    					  // = -2,147,483,648 ~ 2,147,483,647
	    					  // = int
	    
	    int divisor[] = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	divisor[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(divisor);
	    
	    if(n == 1) {
	    	System.out.println(divisor[0] * divisor[0]);
	    }else {
	    	System.out.println(divisor[0] * divisor[n-1]);
	    }
	}
}