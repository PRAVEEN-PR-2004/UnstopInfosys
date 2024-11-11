
import java.util.*;

class Directions {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String instructions = sc.next();
        int countF = 0, countB = 0, countL = 0, countR = 0;
        for (char ch : instructions.toCharArray()) {
            switch (ch) {
                case 'F':
                    countF++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'L':
                    countL++;
                    break;
                case 'R':
                    countR++;
                    break;
            }
        }

        // Calculate the net movements
        int vertical = Math.abs(countF - countB);
        int horizontal = Math.abs(countL - countR);

        // Calculate the maximum deletions possible
        int deletions = instructions.length() - (vertical + horizontal);
        System.out.print(deletions);
    }

}