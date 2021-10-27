package week04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int testCase = sc.nextInt();
    	
    	for(int i = 0; i < testCase; i++) {
        	int brainNum = sc.nextInt();
        	int requiredBrain = sc.nextInt();
			if (brainNum < requiredBrain) {
				System.out.println("NO BRAINS");
			}
			else {
				System.out.println("MMM BRAINS");
			}
    	}
    }
}
//갤곰 :곰곰갤곰 : 빽곰?