import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // 원의 갯수
	    
	    int circle[] = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	circle[i] = sc.nextInt();       	
	    }
	    
	    for(int i=1; i<n; i++) {
	    	int a = circle[0];
	    	int b = circle[i];
	    	
	    	// 약분의 원리 - 분모와 분자를 최대공약수로 나누어줌
	    	
		    int gcd = 0; // 최대공약수

			/*
			 * 유클리드 호제법 
			 * 2개의 자연수 a, b(a > b)에 대해서 a를 b로 나눈 나머지가 r일 때, 
			 * a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
			 * 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 
			 * 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다
			 */

	    	if(b > a) { // (a > b) 를 만들어주기 위함
	    		int temp = a;
	    		a = b;
	    		b = temp;
	    	}

	    	int r = 0;

	    	while(true) {
	    		r = a % b;
	    		if(r == 0) break;
	    		a = b;
	    		b = r;
	    	}

	    	gcd = b;
	    	
	    	System.out.println(circle[0]/gcd + "/" + circle[i]/gcd);
	    }
	}
}