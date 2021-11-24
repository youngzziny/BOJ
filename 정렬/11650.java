package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ��� ��

		int arr[][] = new int[n][2];

		for (int i = 0; i < n; i++) { // ��ǥ���� arr �迭�� ����
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		// System.out.println(Arrays.deepToString(arr));

		Arrays.sort(arr, new Comparator<int[]>() { // Comparator - �迭�� ���� �� �� ���ϴ� �������� �����ϰ� ����
												   // ������ �����ϱ� ������ int�Ӽ����� ����
			@Override
			public int compare(int[] o1, int[] o2) { // ���ϴ� ������ compare �ȿ� �ۼ���
				if (o1[0] == o2[0]) { // �迭�� 0��° index�� ���Ͽ� �ش� �迭�� ��ġ�� ���� ���
					return o1[1] - o2[1]; // �迭�� 1��° index�� ���Ͽ� �������� ����, �յ� ������ �ٲ� ��� ��������
				} else {
					return o1[0] - o2[0]; // 0��° index���� �ٸ� ��� �ش� �κ��� �������� ����
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}

	}
}
