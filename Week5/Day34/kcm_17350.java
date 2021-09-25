package Day34;

import java.util.Scanner;

public class kcm_17350 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loop = in.nextInt();
		in.nextLine();
		String names[] = new String[loop+1];
		boolean Ismember = false;
		for(int i = 0; i <loop; i++) {
			names[i] = in.nextLine();
			if(names[i].equals("anj")) {
				Ismember = true;
			}
		}
		if(Ismember) {
			System.out.println("뭐야;");
		}
		else {
			System.out.println("뭐야?");
		}
	}

}