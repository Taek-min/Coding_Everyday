import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int allGuest = scan.nextInt();
		//// int 배열 하나만으로도 충분히 구현 가능합니다
		int []space = new int [100]; ////무조건 100이하로 잡은게 아쉽네요 :22 :-1-1 시간효율과 공간효율 중 뭘 추구하느냐의 차이라고 생각합니다 : 22
		int []spaceChick = new int[100]; //// chick은 무슨뜻?
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
