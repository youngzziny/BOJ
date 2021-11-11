package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ��� ��
		
		int weight[] = new int[n];
		int height[] = new int[n];
		int rank[] = new int[n]; // ��µ� ����� ������ �迭
		
		for(int i=0; i<n; i++) {
			weight[i] = sc.nextInt(); // ������ ���� ����
			height[i] = sc.nextInt(); // Ű ���� ����
			rank[i] = 1; // ��� ����� 1������ �ʱ�ȭ
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i != j) { // �ڱ��ڽŰ� ���ϴ� ��츦 ������
					if(weight[i] < weight[j]) { // �����Ը� ��
						if(height[i] < height[j]) { // ������ �����԰� �� �۴ٸ� Ű�� ��
							rank[i]++; // Ű�� �۴ٸ� ��� �ϳ��� �з���
						}
					}
				}
			}
			System.out.print(rank[i] + " "); // Ȯ���� ��� ���
		}

	}
}
