import java.util.Scanner;

class Main{
	public static void main(String[] args) { ////깔끔하게 잘 짜셨네요 규칙 굳 : 2S
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//// needPrey나 requirePrey나 똑같은 뜻으로 읽힙니다.
		//// 두 변수의 용도 차이가 이름에서 명확히 드러나면 더 좋을 것 같습니다
		int []needPrey = new int[6];
		
		//// 탭을 왜 두번씩 하신거죠 : 2
		//// 코드 정리하기 정 귀찮으면 이클립스에서 https://red2brook.tistory.com/38 따라하면 저장할때마다 자동으로 코드 정리됩니다. 탭 정리 피드백 하는거 이제 질려요 택민씨..
		for(int j = 0; j < N; j++){
		    	int day = 1;
		    	int requirePrey = 0;
		    	int havePrey = sc.nextInt();
		    
		    	for(int i = 0; i < needPrey.length; i++){
		        		needPrey[i] = sc.nextInt();
		        		requirePrey += needPrey[i];
		    	}
		    
		    	while(requirePrey <= havePrey){
		        		requirePrey *= 4;
		        		day++;
		    	}
		    	System.out.println(day);
		}
	}
}
		

