import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int check = 0;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			String s = sc.next();
			
			if(s.length() == 1) {
				count ++;
			}else {
			
				char[] temp = new char[s.length()];
				
				for(int k=0; k<temp.length; k++) {
					temp[k] = '0';
				}
				
				for(int j=0; j<s.length(); j++) {			
				
					if(s.length()-j>1) {
					
						if(s.charAt(j) != s.charAt(j+1)) {
							temp[j] = s.charAt(j);
						}
					}else {
						temp[j] = s.charAt(j);
					}
				
				} // for j			
			
				for(int l=0; l<temp.length-1; l++) {
					if(temp[l]!='0') {
						for(int m=l+1; m<temp.length; m++) {					
							if(temp[m]!='0') {
								if(temp[l]==temp[m]) {
									check++;
								}
							}
						}
					}
				}
				
				if(check==0) {
					count++;
				}
				
				check = 0;
			}
				
		} // for i
				
		System.out.println(count);
		
	} // main
} // class
