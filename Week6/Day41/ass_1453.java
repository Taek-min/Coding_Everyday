import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int allGuest = scan.nextInt();
		int []space = new int [100];
		int []spaceChick = new int[100];
		int refuse = 0;
		
		for(int i = 0 ; i<allGuest ; i++){
		    space[i] = scan.nextInt();
		    for(int k = 0 ; k<100 ; k++){
		        if(space[i]==spaceChick[k]){
		            refuse++;
		            break;
		        }else if(k==99){
		            spaceChick[i]=space[i];
		            break;
		        }
		    }
		}
		System.out.println(refuse);
	}
}
