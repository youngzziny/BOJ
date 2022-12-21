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
		
		int[][] grid = new int[9][9];
		
		for(int i=0; i<9; i++) {
			
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			for(int j=0; j<9; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		int max = 99;
		int column; // 행
		int row; // 열
		
		Loop:
		while(true) {
			
			for(int i=0; i<9; i++) {
				
				for(int j=0; j<9; j++) {
					
					if(grid[i][j] == max) {
						column = i+1;
						row = j+1;
						break Loop;
					}
					
				}
				
			}
			
			max--;
		}


		bw.write(max + "\n" + column + " " + row);

		
		bw.flush();
		bw.close();
		
	}
}