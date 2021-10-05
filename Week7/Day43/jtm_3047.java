import java.util.*;

public class Main {////저랑 유사하게 풀이하셨군요 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] num = new int[3];
    	for(int i = 0; i < num.length; i++) {
    		num[i] = sc.nextInt();
    	}
    	String str = sc.next();
    	Arrays.sort(num);
        for (int j = 0; j < num.length; j++) {
            //// if 없이 num[str.charAt(i) - 'A'] 출력해도 됨
            if ('A' == str.charAt(j)) {
                System.out.print(num[0] + " ");
            } else if ('B' == str.charAt(j)) {
                System.out.print(num[1] + " ");
            } else if ('C' == str.charAt(j)) {
                System.out.print(num[2] + " ");
            }
        }
    }
}
//// 다들 비슷하게 풀엇네요
//// 잘해~:22