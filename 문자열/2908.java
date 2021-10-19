import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		num1 = (num1/100)+(num1/10%10)*10+(num1%10)*100;
		num2 = (num2/100)+(num2/10%10)*10+(num2%10)*100;
				
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}
}