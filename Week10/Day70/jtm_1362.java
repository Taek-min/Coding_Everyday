import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i = 1;
		while(true) {
			int properWeight = sc.nextInt();
			int weight = sc.nextInt();
			boolean dead = false;
			if(properWeight == 0 && weight == 0) {
				break;
			}
			
			while(true) {
				char command = sc.next().charAt(0);
				int num = sc.nextInt();
				if(weight <= 0) {
					dead = true;
				}
				if(command == 'F') {
					weight = weight + num;
				}
				else if(command == 'E') {
					weight = weight - num;
				}
				else if(command == '#') {
					if(dead) {
						System.out.println(i + " RIP");
					}
					else if(properWeight / 2 < weight && weight < properWeight * 2)
						System.out.println(i + " :-)");
					else 
						System.out.println(i + " :-(");
					break;
				}
			}
			i++;
		}
	}
}
