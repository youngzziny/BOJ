package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 단어의 갯수

		HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<n; i++){
            hashSet.add(sc.next());
        }
        
		String word[] = new String[hashSet.size()]; // 단어를 담을 배열 생성
		Iterator<String> iter = hashSet.iterator(); // hashSet에 저장된 값을 가져오기 위해 반복자 생성

		for(int i=0; i<hashSet.size(); i++) { // 단어를 배열에 저장
			word[i] = iter.next(); // 중복단어가 제거된 배열 완성
		}
		
		Arrays.sort(word); // 알파벳 오름차순으로 정렬
		
		Arrays.sort(word, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length()); // 문자열의 길이 오름차순으로 정렬
			}
		});
		
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}

	}
}
