import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[][] member = new String[n][2];
		
		for(int i=0; i<n; i++) {
			member[i][0] = sc.next();
			member[i][1] = sc.next();
			// System.out.println(member[i][0] + " " + member[i][1]);
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			
		// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(member[i][0] + " " + member[i][1]);
		}
		
	}
}