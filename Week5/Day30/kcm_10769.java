import java.util.Scanner;
////깔끔해요
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();
		String emotion[] = message.split("");
		int sad = 0;
		int happy = 0;
		if(message.contains(":-)") | message.contains(":-(")) { ////contains 배워갑니당 good
			for(int i = 0; i < message.length()-1; i++) {
				if(emotion[i].equals("(")) {
					sad++;
				}
				else if(emotion[i].equals(")")) {
					happy++;
				}
			}
			if(sad == happy) {
				System.out.println("unsure");
			}
			else if(sad < happy) {
				System.out.println("happy");
			}
			else
				System.out.println("sad");
		}
		else {
			System.out.println("none");
		}
	}
}
