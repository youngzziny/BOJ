import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		if(A==V) {
			count = 1;
		}else if((V-A)%(A-B) == 0){
			count = (V-A)/(A-B) + 1;
		}else {
			count = (V-A)/(A-B) +2;
		}
		
		System.out.println(count);
	}
}