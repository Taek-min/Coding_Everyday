import java.util.*;

public class Main {
    public static void main(String[] args) { //성수 : 오버라이딩 재밋네요 하나 배웠어요!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name[][] = new String[num][4];
        sc.nextLine();
        for (int i = 0; i < num; i++){
            name[i] = sc.nextLine().split(" ");
        }

        Arrays.sort(name, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                        return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                    } else
                        return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
                return Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
            }
        });

        System.out.println(name[num-1][0]);
        System.out.println(name[0][0]);
    }
}