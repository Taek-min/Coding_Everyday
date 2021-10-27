import java.util.*;

public class Main
{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[][] num = new int [9][9];
      
      int max=0;
	  int row=0;
	  int column=0;
	  
      for(int j=0;j<9;j++){
	    for(int i=0;i<9;i++){
	      Num[j][i]+=scan.nextInt();
	      
          if(num[j][i]>max){
	        max=num[j][i];
	        row=j+1;
	        column=i+1;
          }
	    }    
	  }  
      System.out.println(max);
      System.out.printf("%d %d",row,column);
      }
}
