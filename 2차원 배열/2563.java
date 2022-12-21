
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		int width = 0;
		
		int[][] paper = new int[100][100];
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				paper[i][j] = 0;
			}			
		}
		
		for(int i=0; i<n; i++) { // 색종이 개수만큼 반복
			
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				
				for(int k=y; k<y+10; k++) {
					paper[j][k] = 1;
				}
				
			}	

		}
		
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(paper[i][j] == 1) {
					width++;
				}
			}
		}
		
		bw.write(width + "");

		bw.flush();
		bw.close();
		
	}
}