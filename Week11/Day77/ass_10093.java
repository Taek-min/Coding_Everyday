import java.util.*;

public class Main{
    public static void main(String[] args){ //// 굳  :2 :3 : 4
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
        if(a>b) {
            System.out.println(a-b-1);
            for(long i = b+1 ; i < a ; i++) {
                System.out.printf("%d ",i);
            }
        }else if(b>a) {
            System.out.println(b-a-1);
            for(long i = a+1 ; i< b ; i++) {
                System.out.printf("%d ",i);
            }
        }else if(a==b) {
		    System.out.println(0);
        }
    }
}