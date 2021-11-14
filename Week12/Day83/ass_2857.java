import java.util.*;

public class Main {
    public static void main(String[] args) { //// 깔끔하게 잘풀었다
        Scanner sc = new Scanner(System.in);
        String name[] = new String[5];
        boolean check = true;

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {
            if(name[i].contains("FBI")) {
                System.out.print(i+1+" ");
                check = false;
            }
        }

        if(check) {
            System.out.print("HE GOT AWAY!");
        }
    }
}