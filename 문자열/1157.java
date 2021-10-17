import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] arr = new int[26];
		int max = 0;
		int maxOrder = 0;
		int count = 0;
		int result;
		
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			int arrOrder = (int)temp;
			
			if('a'<=arrOrder && arrOrder<='z') {
				arrOrder = temp - 'a';
				arr[arrOrder]++;
			}
			if('A'<=arrOrder && arrOrder<='Z') {
				arrOrder = temp - 'A';
				arr[arrOrder]++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max<=arr[i]) {
				max = arr[i];
				maxOrder = i;
			}			
		}
		
		for(int i=0; i<arr.length; i++) {			
			if(arr[i]==max) {
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("?");
		} else if(count == 1){
			result = maxOrder +'A';
			System.out.println((char)result);
		}			
	}
}