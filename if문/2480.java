import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int[] d = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int n;
		
		if(d[0] == d[1] && d[1] == d[2]) {
			n = 10000 + d[0] * 1000;
		}else if(d[0] == d[1]) {
			n = 1000 + d[0] * 100;
		}else if(d[1] == d[2]) {
			n = 1000 + d[1] * 100;
		}else if(d[2] == d[0]) {
			n = 1000 + d[2] * 100;
		}else {
			Arrays.sort(d);
			n = d[2] * 100;
		}
		
		System.out.println(n);
	    
	}
}