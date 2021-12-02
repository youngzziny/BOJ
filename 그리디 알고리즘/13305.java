package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������ ����
		long total = 0; // �� ��� - '���ʹ� ������ 1 �̻� 1,000,000,000 ������ �ڿ����̴�' ���� ������ ���� long�� ���
		
		long length[] = new long[n-1]; // �� ���ð��� ����
		
		for(int i=0; i<n-1; i++) {
			length[i] = sc.nextLong();
		}
		
		long price[] = new long [n]; // �� ���ú� �⸧��
		
		for(int i=0; i<n; i++) {
			price[i] = sc.nextLong();
		}
		
		for(int i=0; i<n; i++) {
			
			long temp = 0;
			
			for(int j=i+1; j<n; j++) {
				if(price[i] <= price[j]) { // ���� ���ú��� �⸧���� �� ���ø� ������ ������ �Ÿ��� ����
					temp += length[j-1];
					if(j == n-1) { // ������ ���ÿ� ���ص� ���� ���ð� ���� �Ҷ��� �� ������ �ݿ���
						total += temp * price[i];
						i = j-1;
						break;
					}
				}else if(price[i] > price[j]){ // ���� ���ú��� �⸧���� �� ���ø� ������ ���
					temp += length[j-1]; // �ش� ���ñ��� ���� �Ÿ��� ����
					total += temp * price[i]; 
					i = j-1; // j ���ø� �ٽ� ���������� ��� ����
					break;
				}
			}
		}
		System.out.println(total);
	}
}
