import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//// needPrey나 requirePrey나 똑같은 뜻으로 읽힙니다.
		//// 두 변수의 용도 차이가 이름에서 명확히 드러나면 더 좋을 것 같습니다
		int []needPrey = new int[6];
		
		//// 탭을 왜 두번씩 하신거죠
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
		

