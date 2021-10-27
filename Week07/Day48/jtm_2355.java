import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long num1 = sc.nextInt();
    	long num2 = sc.nextInt();
    	long max = 0, min = 0;
    	
    	if(num1 < num2) { //// 컴파일 에러 나요 //// 수정했어요
    		max = num2;
    		min = num1;
    	} //이거 붙여주세요.
    	else {
    		max = num1;
    		min = num2;
    	}
    	
    	long result = (max - min + 1) * (max + min) / 2;
    	System.out.println(result);
    }
}

//// 다들 잘푸셧네요:22:33
