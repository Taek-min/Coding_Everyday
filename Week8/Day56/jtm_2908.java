import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(flip(num1) <= flip(num2)) {
        	System.out.println(flip(num2));
        }
        else {
        	System.out.println(flip(num1));
        }
    }
    
    public static int flip(int num){ //// oh nice:함수좋다잉~ :2
        int result=0;
        while(num!=0){
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
