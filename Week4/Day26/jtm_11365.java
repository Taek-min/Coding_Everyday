import java.util.Scanner;

////아유 참 잘하셨더요 :2 :3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String inputStr = sc.nextLine();
            
            if(inputStr.equals("END")) {
            	break;
            }
            else {
            	System.out.println(new StringBuffer(inputStr).reverse().toString()); ////디게 깔끔하네요 StringBuffer().reverse().toString() 배워가요
            }
        }
    }    
}