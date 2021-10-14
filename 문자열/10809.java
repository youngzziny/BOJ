import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			int order = (int)temp-97;
			
			if(alphabet[order]==-1)
				alphabet[order] = i;		
		}		
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
		
	}

}