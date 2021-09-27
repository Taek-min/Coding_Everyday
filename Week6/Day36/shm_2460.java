import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int existPerson = 0;
		int maxPerson = 0;
		
		for(int i = 0; i < 10; i++) {
			int leavePerson = sc.nextInt();
			int ridePerson = sc.nextInt();
			
			existPerson -= leavePerson;
			existPerson += ridePerson;
			
			if(maxPerson < existPerson) {
				maxPerson = existPerson;
			}
		}
		System.out.println(maxPerson);
	}
}
//// 그만 통하자구 우리;;;