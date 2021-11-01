import java.util.*;

public class Main { //// List 잘쓰는 챙뮌이한테 나중에 배워야지 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = 1;
		int deadCount = 0;
		List<String> result = new ArrayList<String>();

		for(int i = 0; i < testCase; i++) {
			int properWeight = in.nextInt();
			int weight = in.nextInt();
			
			if(properWeight == 0 && weight == 0) {
				break;
			}
			
			while(true) {
				String event[] = in.nextLine().split(" ");
				if(event[0].equals("E")) {
					weight -= Integer.parseInt(event[1]);
					if(weight <= 0) {
						deadCount++;
					}
				}
				else if(event[0].equals("F")) {
					weight += Integer.parseInt(event[1]);
				}
				else if(event[0].equals("#")) {
					if(deadCount > 0) {
						result.add("RIP");	
					}
					else {
						if(properWeight / 2 < weight && properWeight *2 > weight) {
							result.add(":-)");
						}
						else {
							result.add(":-(");
						}
					}
					testCase++; //이거로 for문 돌리는건 생각 못했네
					break;
				}
			}
		}
		
		for(int k = 0; k < result.size(); k++) {
			System.out.println(k+1 + " " + result.get(k));
		}
	}
}
 //잘해~~
