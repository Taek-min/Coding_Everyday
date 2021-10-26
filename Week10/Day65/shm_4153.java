import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String sides = sc.nextLine();
			String arraySides[] = sides.split(" ");
			int max = 0;
			int sum = 0;
			
			for(int i = 0; i < arraySides.length; i++) {
				if(arraySides[i].equals("0")) {
					return;
				}
				if(max < Integer.parseInt(arraySides[i])) {
					max = Integer.parseInt(arraySides[i]);
				}
			}
			
			for(int i = 0; i < arraySides.length; i++) {
				if(max == Integer.parseInt(arraySides[i])) {
					continue;
				}
				sum += Integer.parseInt(arraySides[i]) * Integer.parseInt(arraySides[i]);
			}
			
			if(max * max == sum) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}
