import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []needPrey = new int[6];
		
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
		

