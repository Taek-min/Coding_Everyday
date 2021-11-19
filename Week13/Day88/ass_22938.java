import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
		    for (int k = 0; k < 3; k++) {
			    target[i][k] = sc.nextInt();
		    }
	    }
		
		double targetXY = Math.pow((target[0][0] - target[1][0]), 2) + Math.pow((target[0][1] - target[1][1]), 2);
		double targetR = Math.pow((target[0][2] + target[1][2]), 2);

		if(targetR > targetXY){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
    }
}