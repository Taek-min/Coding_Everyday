import java.util.*;

//// 로직 깔끔:@2
public class Main//// 피드백 반영하는 모습이 보기 좋네요 ^^
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[][] Num = new int [9][9]; //// 변수명 첫글자는 소문자로
      
      int max=0;
	  int row=0;
	  int column=0;
	  
      for(int j=0;j<9;j++){
	    for(int i=0;i<9;i++){
	      Num[j][i]+=scan.nextInt();
	      
          if(Num[j][i]>max){
	        max=Num[j][i];
	        row=j+1;
	        column=i+1;
          }
//지워버려 이 줄 
	    }    
	  }
	  
      System.out.println(max);
	  System.out.printf("%d %d",row,column);
      // 얘도 지워
      } /// 얘 왜 튀어나와 있어 :2 : 3
}