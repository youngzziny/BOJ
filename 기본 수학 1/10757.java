package test;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		 
		 BigInteger result;
		
		 Scanner kb = new Scanner(System.in);		 
		 BigInteger n = kb.nextBigInteger();
		 BigInteger m = kb.nextBigInteger();
		 
		 result = n.add(m);
		 
		 System.out.println(result);
	}
}
