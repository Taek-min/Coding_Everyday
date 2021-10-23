import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
		
		while(true) {
			String scale = sc.nextLine();
			if(scale.equals("***")) {
				break;
			}
			
			String s[] = scale.split(" ");
			for(int i = 0; i < s.length; i++) {
				if(s[i].equals("Bb")) {
					s[i] = "A#";
				}
				else if(s[i].equals("B#")){
					s[i] = "C";
				}
				else if(s[i].equals("Cb")) {
					s[i] = "B";
				}
				else if(s[i].equals("Db")) {
					s[i] = "C#";
				}
				else if(s[i].equals("Eb")) {
					s[i] = "D#";
				}
				else if(s[i].equals("E#")) {
					s[i] = "F";
				}
				else if(s[i].equals("Fb")) {
					s[i] = "E";
				}
			}
			int change = sc.nextInt();
			sc.nextLine();
			int cnt = 0;
			for(int j = 0; j < s.length; j++) {
				for(int k = 0; k < arr.length; k++) {
					if(s[j].equals(arr[k])) {
						cnt = k;
						cnt += change;
						if(cnt > 11) {
							cnt -= 12;
						}
						else if(cnt < 0) {
							cnt += 12;
						}
						System.out.printf("%s ", arr[cnt]);
					}
				}
			}
			System.out.println();
		}
	}
}
