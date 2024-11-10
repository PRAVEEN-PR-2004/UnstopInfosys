import java.util.Scanner;

public class Replace_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            String s = sc.next();
            s = s.replace("nancy", "sanvi");
            System.out.println(s);
        }
    }
}
