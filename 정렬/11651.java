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
		
		Arrays.sort(xy, (o1, o2) -> { // �迭�� �������� �����Ѵ�
			if(o1[1] == o2[1]) { // 0��° element(y��ǥ)�� ���� ���
				return Integer.compare(o1[0], o2[0]); // 1��° element(x��ǥ)�� compare ��
			}else { // 0��° element(y��ǥ)�� ���� ���� ���
				return Integer.compare(o1[1], o2[1]); // 0��° element(y��ǥ)�� compare ��
			}
		});		
		
		for(int i=0; i<n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
	
	
	
}
