import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt(); // �׽�Ʈ ���̽��� ����

	    for(int i=0; i<t; i++) {
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	
		    int gcd = 0; // �ִ�����
		    int lcm = a*b; // �ּҰ���� (a*b/gcd�� ������ֱ� ����)
	    	
			/*
			 * ��Ŭ���� ȣ���� 
			 * 2���� �ڿ��� a, b(a > b)�� ���ؼ� a�� b�� ���� �������� r�� ��, 
			 * a�� b�� �ִ������� b�� r�� �ִ������� ����.
			 * �� ������ ����, b�� r�� ���� ������ r'�� ���ϰ�, �ٽ� r�� r'�� ���� �������� ���ϴ� ������ �ݺ��Ͽ� 
			 * �������� 0�� �Ǿ��� �� ������ ���� a�� b�� �ִ������̴�
			 */
	    	
	    	if(b > a) { // (a > b) �� ������ֱ� ����
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
	    	 * �ּҰ����
	    	 * �� �� a�� b�� �ּҰ������ a�� b�� ���� a�� b�� �ִ������� ���� �Ͱ� ����
	    	 */
	    	
	    	lcm /= gcd;

	    	System.out.println(lcm);	    	
	    }	    
	}
}