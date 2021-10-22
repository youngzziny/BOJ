import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			char temp = s.charAt(i);
			
			if((s.length()-i)>1) {
			
				if(temp == 'c') {
					
					if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
						count++;
						i = i+1;
					}else {
						count++;
					}			
					
				}else if(temp == 'd') {
					
					if((s.length()-i)>2) {
					
						if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
							count++;
							i = i+2;
						}else if(s.charAt(i+1) == '-') {
							count++;
							i = i+1;
						}else {
							count++;
						}	

					}else {
						if(s.charAt(i+1) == '-') {
						count++;
						i = i+1;
						}else {
							count++;
						}
					}
					
				}else if(temp == 'l') {
					
					if(s.charAt(i+1) == 'j') {
						count++;
						i = i+1;
					}else {
						count++;
					}
					
				}else if(temp == 'n') {
					
					if(s.charAt(i+1) == 'j') {
						count++;
						i = i+1;
					}else {
						count++;
					}
					
				}else if(temp == 's') {
					
					if(s.charAt(i+1) == '=') {
						count++;
						i = i+1;
					}else {
						count++;
					}
					
				}else if(temp == 'z') {
					
					if(s.charAt(i+1) == '=') {
						count++;
						i = i+1;
					}else {
						count++;
					}
					
				}else {
					count++;
				}
			}else {
				count++;
			}
			
		}
				
		System.out.println(count);
	}
}
