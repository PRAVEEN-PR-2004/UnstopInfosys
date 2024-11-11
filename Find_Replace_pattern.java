import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Find_Replace_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer input

        String str = sc.nextLine();
        String[] words = str.split(" ");

        String pattern = sc.next();

        List<String> al = new ArrayList<>();

        for (String s : words) {
            boolean toAdd = true;
            Map<Character, Character> hs1 = new HashMap<>();
            Set<Character> used = new HashSet<>(); // Set to track characters used in pattern

            if (s.length() != pattern.length()) {
                toAdd = false;
            }

            for (int i = 0; i < s.length() && toAdd; i++) {
                char c1 = s.charAt(i);
                char c2 = pattern.charAt(i);

                if (hs1.containsKey(c1)) {
                    if (hs1.get(c1) != c2) {
                        toAdd = false;
                        break;
                    }
                } else {
                    if (used.contains(c2)) { // Check if `c2` is already mapped to another `c1`
                        toAdd = false;
                        break;
                    }
                    hs1.put(c1, c2);
                    used.add(c2);
                }
            }

            if (toAdd) {
                al.add(s);
            }
        }

        System.out.println(al.size());
        for (String ss : al) {
            System.out.print(ss + " ");
        }
    }
}
