package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �ܾ��� ����

		HashSet<String> hashSet = new HashSet<>();
        for(int i=0; i<n; i++){
            hashSet.add(sc.next());
        }
        
		String word[] = new String[hashSet.size()]; // �ܾ ���� �迭 ����
		Iterator<String> iter = hashSet.iterator(); // hashSet�� ����� ���� �������� ���� �ݺ��� ����

		for(int i=0; i<hashSet.size(); i++) { // �ܾ �迭�� ����
			word[i] = iter.next(); // �ߺ��ܾ ���ŵ� �迭 �ϼ�
		}
		
		Arrays.sort(word); // ���ĺ� ������������ ����
		
		Arrays.sort(word, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length()); // ���ڿ��� ���� ������������ ����
			}
		});
		
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}

	}
}
