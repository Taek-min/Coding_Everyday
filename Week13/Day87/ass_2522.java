import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
		    for (int k = 1; k <= num - i; k++) {
		        System.out.printf(" ");
		    }
		    for (int k = 1; k <= i; k++) {
			    System.out.printf("*");
		    }
		    System.out.println();
	    }
	
	    for (int i = num - 1; i > 0; i--) {
		    for (int k = 1; k <= num - i; k++) {
			    System.out.printf(" ");
		    }
		    for (int k = 1; k <= i; k++) {
			    System.out.printf("*");
		    }
		    System.out.println();
	    }
    }
}