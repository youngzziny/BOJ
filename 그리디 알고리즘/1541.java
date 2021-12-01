import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    String expression = sc.nextLine();
	    
	    String num = "";
	    boolean isPlus = true;
	    int result = 0;
	    
	    for(int i=0; i<expression.length(); i++) {
	    	
	    	if(expression.charAt(i) == '+' || expression.charAt(i) == '-') {
	    		if(isPlus == true) {
	    			result += Integer.parseInt(num);
	    			num = "";
	    		}else {
	    			result -= Integer.parseInt(num);
	    			num = "";
	    		}
	    		
	    		if(expression.charAt(i) == '-') {
	    			isPlus = false;
	    		}
	    	}else {
	    		num += expression.charAt(i);
	    		
	    		if(i == expression.length()-1) {
	    			if(isPlus == true) {
		    			result += Integer.parseInt(num);
		    			num = "";
		    		}else {
		    			result -= Integer.parseInt(num);
		    			num = "";
		    		}
	    		}
	    	}
	    }
	    
	    System.out.println(result);
	}
}