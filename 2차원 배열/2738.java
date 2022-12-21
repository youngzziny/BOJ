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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());

		String[] a = new String[n1];
		String[] b = new String[n1];
		String[] result = new String[n1];
		
		for(int i=0; i<n1; i++) {
			a[i] = bf.readLine();
		}
		
		for(int i=0; i<n1; i++) {
			b[i] = bf.readLine();
		}
		
		for(int i=0; i<n1; i++) {
			
			String sum ="";
			String aa;
			String bb;
			
			aa = a[i];
			String[] aaCut = aa.split(" ");
			
			bb = b[i];
			String[] bbCut = bb.split(" ");
			
			for(int j=0; j<n2; j++) {
				sum += Integer.toString(Integer.parseInt(aaCut[j]) + Integer.parseInt(bbCut[j])) + " " ;	
			}
			
			result[i] = sum;
		}

		for(int i=0; i<n1; i++) {
			bw.write(result[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}