package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int min = 0;
		int sum = 0; // i�� ������
		
		for(int i=1; i<=1000000; i++) {
			
			int temp = i;			
			int len = (int)(Math.log10(temp)+1); // temp�� �ڸ���
			
			sum += temp; // �����տ� �ڱ��ڽ��� ������
			
			for(int j=0; j<len; j++) { 
				sum += temp%10; // �����տ� 1���ڸ����� �����ְ�
				temp = temp/10; // 1���ڸ��� ����
			}
			// ������� ����� temp�� ������ �ϼ�
						
			if(n == sum) { // ���� ���� �����ڸ� ã�� ��� break
				min = i; 
				break;
			}
			
			sum = 0; // i�� ������ ���� �Ŀ��� sum �ʱ�ȭ
			
		} // ������ ���� �Ŀ��� min�� 0�� ��� �����ڰ� ���� ������ ����, 0�� ���
		
		System.out.println(min);
	}
}
