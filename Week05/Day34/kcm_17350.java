import java.util.Scanner;

public class Main {////뭐야 나랑 똑같잖아~? : 22

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loop = in.nextInt();
		in.nextLine();
		String names[] = new String[loop+1];
		boolean Ismember = false;
		for(int i = 0; i <loop; i++) {
			names[i] = in.nextLine();
			////찾고 바로 종료해주느것도 좋을듯? :2
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