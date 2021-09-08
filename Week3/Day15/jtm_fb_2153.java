import java.util.Scanner;

//// 깔끔 :2 잘 보다가 갑니다 
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        
        //// strTotal이라는 이름만으로는 의미가 잘 전달되지 않는 것 같아요
        //// string Total 의 의미라 문자열의 총합이면 충분히 전달이 될거같음 어떤부분에서 의미가 전달이 안된다고 말한지 모르겠어
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
        
        //// 요 부분 함수로 만들었으면 깔끔했을 듯
	//// 함수는 쓰고싶은 날이 있어 이날의 내가 함수 쓰기 싫었던거같음
        boolean check = true; 
        
        for(int i=2; i < strTotal; i++) {
            if(strTotal % i == 0) {
		        check = false;
		        break;
	        }
        }

        
        if(check) {
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
        
        sc.close();
}