import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int num1 = 0;
		int num2 = 0;

		int num = 1;
		int count = 1;
		
		while(true) {
			num = num+count;			
			
			if(num > x) {
				num = num - count; // 대각선 순서
				break;
			}
			
			count++;
		}
		
		if(count%2 == 0) {
			num1 = x-num+1;
			num2 = count+1-num1;
		}else {
			num2 = x-num+1;
			num1 = count+1-num2;
		}
		
		System.out.println(num1+"/"+num2);
		
	}
}