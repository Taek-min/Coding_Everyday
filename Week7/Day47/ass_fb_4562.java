import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
        int xBrains;
        int yBrains;
		for(int i =0 ; i < line ; i++){
		    xBrains = scan.nextInt();
		    yBrains = scan.nextInt();
			if(xBrains<yBrains){
		        System.out.println("NO BRAINS");
		    }else{
		        System.out.println("MMM BRAINS");
		    }
		}
	}
}