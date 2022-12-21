import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);

		int[] original = new int[n]; // 입력값 그대로 저장할 배열
		int[] temp = new int[n]; // 입력값을 오름차순으로 저장할 배열

		for (int i = 0; i < n; i++) {
			original[i] = Integer.parseInt(st.nextToken());
			temp[i] = original[i];
		}

		Arrays.sort(temp); // 오름차순 정렬

		// for (int i = 0; i < n; i++) { System.out.println(temp[i]); }
		
		HashMap<Integer, Integer> compression = new HashMap<Integer, Integer>(); // key: 원래 좌표, value: 압축된 좌표
		
		int order = 0; // 압축 좌표 0부터 시작
		
		for(int i=0; i<n; i++) { 
			
			if(!compression.containsKey(temp[i])) { // 압축좌표가 부여되지 않은 좌표에게 압축좌표를 0부터 순서대로 부여
				compression.put(temp[i], order);
				order++;
			}
			
		}
		
		// System.out.println(compression);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < n; i++) { 
			
			bw.write(compression.get(original[i]) + " ");
			
		}
		
		bw.flush();
		bw.close();
		
	}
}