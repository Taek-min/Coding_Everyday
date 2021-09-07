package algorithm;
import java.util.Scanner;

//// 깔끔 :2 잘 보다가 갑니다 
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        
        //// strTotal이라는 이름만으로는 의미가 잘 전달되지 않는 것 같아요
        int strTotal = 0;
        
        for(int i=0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                //// - 96말고 - 'A'로 써도 돼요 ,  아 그래요?
                strTotal += (int)ch - 38;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                strTotal += (int)ch - 96;
            }
        }
        
        //// 요 부분 함수로 만들었으면 깔끔했을 듯
        boolean check = false; 
        
        for(int i=2; i <= strTotal; i++) {
            //// if 한번만 써도 돼요. lye 코드 참고!
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
