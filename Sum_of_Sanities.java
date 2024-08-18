
import java.util.*;

public class Sum_of_Sanities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print(0);
            return;
        }
        int[] arr = new int[n];
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);

    
        HashMap<Integer, Integer> lastOccurrenceMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            lastOccurrenceMap.put(sorted[i], i);
        }

       
        long sum = 0;
        long MOD = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = lastOccurrenceMap.get(arr[i]);
            sum = (sum + lastIndex + i) % MOD;
        }
        
       
        System.out.print(sum);
    }
}
