import java.text.SimpleDateFormat;
import java.util.*;

public class Main {   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int N = in.nextInt();
      String minAgeName = "";
      String MaxAgeName = "";
      int min = 99999999;
      int max = 0;  
      SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
      Calendar date = Calendar.getInstance();
      String today = format.format(date.getTime());
      in.nextLine();
      
      for(int i = 0; i < N; i++) {
         String student = in.nextLine();
         String age = student.split(" ")[3] 
                  + (student.split(" ")[2].length() == 1 ? "0" + student.split(" ")[2] : student.split(" ")[2]) 
                  + (student.split(" ")[1].length() == 1 ? "0" + student.split(" ")[1] : student.split(" ")[1]);
         if(Integer.parseInt(today) - Integer.parseInt(age) < min) {
            minAgeName = student.split(" ")[0];
            min = Integer.parseInt(today) - Integer.parseInt(age);
         }
         if(Integer.parseInt(today) - Integer.parseInt(age) > max) {
            MaxAgeName = student.split(" ")[0];
            max = Integer.parseInt(today) - Integer.parseInt(age);
         }
      }
      
      System.out.println(minAgeName + "\n" + MaxAgeName);
   }
}