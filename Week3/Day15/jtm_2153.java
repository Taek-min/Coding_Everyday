package algorithm;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        
        int strTotal = 0;
        
        for(int i=0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                strTotal += (int)ch - 38;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                strTotal += (int)ch - 96;
            }
        }
        
        boolean check = false;
        
        for(int i=2; i <= strTotal; i++) {
            if(i < strTotal && strTotal % i == 0) {
                break;
            }
            
            if(i == strTotal && strTotal % i ==0 ) {
                check = true;
            }
        }
        
        
        if(check || strTotal == 1) {
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
        
        sc.close();
	}
}
