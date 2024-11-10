import java.util.Scanner;

public class Sum_Of_Digit_In_Base_K {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            int rem = n % k;
            sum += rem;
            n = n / k;
        }
        System.out.print(sum);
    }
}
