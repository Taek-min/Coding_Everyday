import java.util.*;

public class Main{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		String arr[] = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
		while(true) {
			String exNote = sc.nextLine();
			if(exNote.equals("***")) {
				break;
			}
			String notes[] = exNote.split(" ");
			for(int i = 0; i < notes.length; i++) {
				if(notes[i].equals("Bb")) {
						notes[i] = "A#";
				}
				else if(notes[i].equals("B#")){
					notes[i] = "C";
				}
				else if(notes[i].equals("Cb")) {
					notes[i] = "B";
				}
				else if(notes[i].equals("Db")) {
					notes[i] = "C#";
				}
				else if(notes[i].equals("Eb")) {
					notes[i] = "D#";
				}
				else if(notes[i].equals("E#")) {
					notes[i] = "F";
				}
				else if(notes[i].equals("Fb")) {
					notes[i] = "E";
				}
			}
			int change = sc.nextInt();
			sc.nextLine();
			int cnt = 0;
			for(int j = 0; j < notes.length; j++) {
				for(int k = 0; k < arr.length; k++) {
					if(notes[j].equals(arr[k])) {
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