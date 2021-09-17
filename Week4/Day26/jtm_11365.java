import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String inputStr = sc.nextLine();
            
            if(inputStr.equals("END")) {
            	break;
            }
            else {
            	System.out.println(new StringBuffer(inputStr).reverse().toString());
            }
        }
    }    
}