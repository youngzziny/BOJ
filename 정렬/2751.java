import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
	    
		/* 시간초과로 실패
		 * 
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		
		int[] arr = new int[n]; 
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		*/
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[n]; 
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<n; i++) {
			bw.write(arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}