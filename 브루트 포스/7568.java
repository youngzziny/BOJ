package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 사람 수
		
		int weight[] = new int[n];
		int height[] = new int[n];
		int rank[] = new int[n]; // 출력될 등수를 저장할 배열
		
		for(int i=0; i<n; i++) {
			weight[i] = sc.nextInt(); // 몸무게 정보 저장
			height[i] = sc.nextInt(); // 키 정보 저장
			rank[i] = 1; // 모든 등수를 1등으로 초기화
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i != j) { // 자기자신과 비교하는 경우를 제외함
					if(weight[i] < weight[j]) { // 몸무게를 비교
						if(height[i] < height[j]) { // 본인의 몸무게가 더 작다면 키를 비교
							rank[i]++; // 키도 작다면 등수 하나가 밀려남
						}
					}
				}
			}
			System.out.print(rank[i] + " "); // 확정된 등수 출력
		}

	}
}
