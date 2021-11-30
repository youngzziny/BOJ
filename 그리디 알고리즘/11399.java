import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // 줄 선 사람의 수
	    
	    int time[] = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	time[i] = sc.nextInt();
	    }
	
	    Arrays.sort(time);
	    
	    int sum = 0;
	    
	    for(int i=0; i<n; i++) {
	    	sum += time[i] * (n - i);
	    }
	    
	    System.out.println(sum);
	}
}