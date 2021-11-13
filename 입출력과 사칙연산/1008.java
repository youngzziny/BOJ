import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    
        Scanner kb = new Scanner(System.in);
        
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        
        kb.close();
        
        System.out.print(a/b);
        
    }
}