package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 사람 수

		int arr[][] = new int[n][2];

		for (int i = 0; i < n; i++) { // 좌표값을 arr 배열에 저장
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		// System.out.println(Arrays.deepToString(arr));

		Arrays.sort(arr, new Comparator<int[]>() { // Comparator - 배열을 정렬 할 때 원하는 조건으로 정렬하게 해줌
												   // 정수를 정렬하기 때문에 int속성으로 선언
			@Override
			public int compare(int[] o1, int[] o2) { // 원하는 조건을 compare 안에 작선ㅇ
				if (o1[0] == o2[0]) { // 배열의 0번째 index를 비교하여 해당 배열의 위치가 같을 경우
					return o1[1] - o2[1]; // 배열의 1번째 index를 비교하여 오름차순 정렬, 앞뒤 순서를 바꿀 경우 내림차순
				} else {
					return o1[0] - o2[0]; // 0번째 index부터 다를 경우 해당 부분을 기준으로 정렬
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}

	}
}
