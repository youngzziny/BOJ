import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // ȸ���� ����
	
	    int meeting[][] = new int [n][3];
	
	    for(int i=0; i<n; i++) {
	        meeting[i][0] = sc.nextInt(); // ȸ�� ���۽ð�
	        meeting[i][1] = sc.nextInt(); // ȸ�� ����ð�
	    }
	    
		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) { 
				if (o1[1] == o2[1]) { // ȸ�� ���� �ð��� �������� �����ϵ�, ����ð��� ���� �� ���۽ð��� �� �������� �켱��
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		// System.out.println(Arrays.deepToString(meeting));
	
	    int count = 1; // �ּ� 1���� ȸ�Ǹ� ������
	    int end = meeting[0][1]; // ù��° ȸ�ǰ� ������ �ð�
	
        for(int i=1; i<n; i++) {
            if(meeting[i][0] >= end) { // ���� ȸ�ǰ� ���� ������ �����ϴ� ȸ�Ǹ� ã��
                count++;
                end = meeting[i][1]; // ���� ȸ�ǰ� ������ �ð�
            }
        }

	    System.out.println(count);
	}
}