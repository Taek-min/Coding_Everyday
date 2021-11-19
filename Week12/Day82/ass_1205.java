import java.util.*;

public class Main{ ////굳굳굳 b :2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int taesuPoint = sc.nextInt();
        int rankNum = sc.nextInt();
        int rankPoint[] = new int[N];
        int taesuRank = 1; //// 이런것들 띄어쓰기 taesuRank = 1; 이런식으로 해주면 가독성이 오를거같아요
        int cnt = 0;
        
        for (int i = 0; i < N; i++){
            rankPoint[i] = sc.nextInt();
        }
        
        if(N==0){
            System.out.println("1");
            return;
        }

        for (int i = 0; i < N; i++){
            if(rankPoint[i] > taesuPoint){
                taesuRank+=1;
            }else if(rankPoint[i]==taesuPoint){
                taesuRank = taesuRank;
            }else{
                break;
            }cnt++;
        }

        if(cnt==rankNum){
            System.out.println("-1");
            return;
        }
        System.out.println(taesuRank);
	}
}