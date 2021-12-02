package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 도시의 갯수
		long total = 0; // 총 비용 - '리터당 가격은 1 이상 1,000,000,000 이하의 자연수이다' 조건 충족을 위해 long형 사용
		
		long length[] = new long[n-1]; // 각 도시간의 길이
		
		for(int i=0; i<n-1; i++) {
			length[i] = sc.nextLong();
		}
		
		long price[] = new long [n]; // 각 도시별 기름값
		
		for(int i=0; i<n; i++) {
			price[i] = sc.nextLong();
		}
		
		for(int i=0; i<n; i++) {
			
			long temp = 0;
			
			for(int j=i+1; j<n; j++) {
				if(price[i] <= price[j]) { // 현재 도시보다 기름값이 싼 도시를 만나기 전까지 거리를 더함
					temp += length[j-1];
					if(j == n-1) { // 마지막 도시와 비교해도 현재 도시가 가장 쌀때는 그 가격을 반영함
						total += temp * price[i];
						i = j-1;
						break;
					}
				}else if(price[i] > price[j]){ // 현재 도시보다 기름값이 싼 도시를 만났을 경우
					temp += length[j-1]; // 해당 도시까지 가는 거리를 더함
					total += temp * price[i]; 
					i = j-1; // j 도시를 다시 기준점으로 잡기 위함
					break;
				}
			}
		}
		System.out.println(total);
	}
}
