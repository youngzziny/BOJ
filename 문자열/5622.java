import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int[] arr = new int[26];
		int n = 3;
		int result = 0;
		int sum = 0;		
		
		for(int i=0; i<18; i+=3) {
			arr[i] = n;
			arr[i+1] = n;
			arr[i+2] = n;
			arr[18] = n;
			n++;
		}
		for(int i=19; i<26; i++) {
			if(19<=i && i<=21)
				arr[i] = n;
			if(22<=i && i<26)
				arr[i] = n+1;
		}

		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			result = (int)temp -'A';
			sum += arr[result];
		}
		
		System.out.println(sum);
		
	}
}
