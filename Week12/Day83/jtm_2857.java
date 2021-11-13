import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String agent[] = new String[5];
        int cnt = 0;

        for(int i = 0; i < agent.length;i++)
        {
        	agent[i] = sc.next();
        }

        for(int i=0;i<agent.length;i++)
        {
        	if(agent[i].contains("FBI")) {
        		System.out.print(i+1 + " ");
        		cnt++;
        	}
        }

        if(cnt == 0) {
            System.out.print("HE GOT AWAY!");
        }
    }
}
