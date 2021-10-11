import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int sum = 0;
		int sequenceNum = 1;
		int sequence[] = new int[1001];
		for (int i = 0; i < 1001;) {
			for (int j = 0; j < sequenceNum; j++) {
				i++;
                if(i==1001)
                    break;
                sequence[i] = sequenceNum;               
			}
			sequenceNum++;
		}
		for(int k = A ; k < B+1 ; k++){
			sum+= sequence[k];
		}
		System.out.println(sum);
	}
}