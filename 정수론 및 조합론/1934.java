import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt(); // 테스트 케이스의 개수

	    for(int i=0; i<t; i++) {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	
		    int gcd = 0; // 최대공약수
		    int lcm = a*b; // 최소공배수 (a*b/gcd를 만들어주기 위함)
	    	
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
	    
	    	/*
	    	 * 최소공배수
	    	 * 두 수 a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수로 나눈 것과 같다
	    	 */
	    	
	    	lcm /= gcd;

	    	System.out.println(lcm);	    	
	    }	    
	}
}