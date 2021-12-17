import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // ���� ����
	    
	    int circle[] = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	circle[i] = sc.nextInt();       	
	    }
	    
	    for(int i=1; i<n; i++) {
	    	int a = circle[0];
	    	int b = circle[i];
	    	
	    	// ����� ���� - �и�� ���ڸ� �ִ������� ��������
	    	
		    int gcd = 0; // �ִ�����

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
	    	
	    	System.out.println(circle[0]/gcd + "/" + circle[i]/gcd);
	    }
	}
}