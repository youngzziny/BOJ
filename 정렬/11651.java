import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int xy[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		
		Arrays.sort(xy, (o1, o2) -> { // 배열을 오름차순 정렬한다
			if(o1[1] == o2[1]) { // 0번째 element(y좌표)가 같을 경우
				return Integer.compare(o1[0], o2[0]); // 1번째 element(x좌표)로 compare 함
			}else { // 0번째 element(y좌표)가 같지 않을 경우
				return Integer.compare(o1[1], o2[1]); // 0번째 element(y좌표)로 compare 함
			}
		});		
		
		for(int i=0; i<n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
	
	
	
}
