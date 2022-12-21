import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] num = new int[n];
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		// 산술평균
		System.out.println(Math.round(sum / n));

		// 중앙값
		Arrays.sort(num);
		System.out.println(num[n / 2]);
		
		// 최빈값	
		Map<Integer, Integer> freq = new HashMap();
		
		for(int i=0; i<n; i++) {
			
			if(freq.containsKey(num[i])) {
				
				int temp = freq.get(num[i]) + 1;
				freq.put(num[i], temp);
				
			}else {
				freq.put(num[i], 1);
			}
			
		}
		
		// System.out.println(freq);
		
		List<Integer> listKeySet = new ArrayList<>(freq.keySet());
		Collections.sort(listKeySet); // key 기준 오름차순
		Collections.sort(listKeySet, (value1, value2) -> (freq.get(value2).compareTo(freq.get(value1)))); // value(빈도) 기준 내림차순 정렬
		
		// System.out.println(listKeySet.get(0));
		// System.out.println(freq.get(listKeySet.get(0)));
		
		// 주어진 수가 단 한개일 경우 오류 방지
		if(n != 1) { 
			if(freq.get(listKeySet.get(0)) != freq.get(listKeySet.get(1))) { // 최빈값이 하나일 경우
				System.out.println(listKeySet.get(0)); // 첫번째 최빈값 출력
			}else {
				System.out.println(listKeySet.get(1)); // 최빈값이 두개일 경우 두번째 값 출력
			}
		}else {
			System.out.println(listKeySet.get(0));
		}
		
		// 범위
		System.out.println(num[n-1] - num[0]);
	}
}