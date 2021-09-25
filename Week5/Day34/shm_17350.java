import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int memberNum = sc.nextInt();
		boolean anjFind = false;
		for(int i = 0; i < memberNum; i++) {
			String name = sc.next();
			if(name.equals("anj")) {
				anjFind = true;
			}
		}
		if(anjFind) {
			System.out.println("뭐야;");
		}
		else {
			System.out.println("뭐야?");
		}
	}
}
