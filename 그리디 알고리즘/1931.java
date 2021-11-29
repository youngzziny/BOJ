import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); // 회의의 갯수
	
	    int meeting[][] = new int [n][3];
	
	    for(int i=0; i<n; i++) {
	        meeting[i][0] = sc.nextInt(); // 회의 시작시간
	        meeting[i][1] = sc.nextInt(); // 회의 종료시간
	    }
	    
		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) { 
				if (o1[1] == o2[1]) { // 회의 종료 시간을 기준으로 정렬하되, 종료시간이 같을 시 시작시간이 더 빠른것을 우선함
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		// System.out.println(Arrays.deepToString(meeting));
	
	    int count = 1; // 최소 1개의 회의를 진행함
	    int end = meeting[0][1]; // 첫번째 회의가 끝나는 시간
	
        for(int i=1; i<n; i++) {
            if(meeting[i][0] >= end) { // 현재 회의가 끝난 다음에 시작하는 회의를 찾기
                count++;
                end = meeting[i][1]; // 다음 회의가 끝나는 시간
            }
        }

	    System.out.println(count);
	}
}