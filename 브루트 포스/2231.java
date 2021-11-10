package baekjoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int min = 0;
		int sum = 0; // i의 분해합
		
		for(int i=1; i<=1000000; i++) {
			
			int temp = i;			
			int len = (int)(Math.log10(temp)+1); // temp의 자릿수
			
			sum += temp; // 분해합에 자기자신을 더해줌
			
			for(int j=0; j<len; j++) { 
				sum += temp%10; // 분해합에 1의자리값을 더해주고
				temp = temp/10; // 1의자리를 없앰
			}
			// 여기까지 수행시 temp의 분해합 완성
						
			if(n == sum) { // 가장 작은 생성자를 찾을 경우 break
				min = i; 
				break;
			}
			
			sum = 0; // i의 분해합 검증 후에는 sum 초기화
			
		} // 끝까지 수행 후에도 min이 0일 경우 생성자가 없는 것으로 간주, 0을 출력
		
		System.out.println(min);
	}
}
