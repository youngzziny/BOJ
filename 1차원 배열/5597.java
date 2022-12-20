import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[31];
		
		for(int i=0; i<student.length; i++) {
			student[i]=i;
		}
		
		for(int i=0; i<28; i++) {
			student[sc.nextInt()] = 0;
		}
		
	    Arrays.sort(student);
	    
	    for(int i=0; i<student.length; i++) {
	    	if(student[i] != 0) {
	    		System.out.println(student[i]);
	    	}
	    }
	    
	}
}