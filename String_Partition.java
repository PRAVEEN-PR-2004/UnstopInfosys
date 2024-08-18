import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class String_Partition 
{
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            hs.put(str.charAt(i),i);
        }
        int end = 0;
        int c = 0;
        List<Integer> al  = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            end = Math.max(end,hs.get(str.charAt(i)));
            c++;
            if(i==end)
            {
                al.add(c);
                end = 0;
                c=0;
            }
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
    
}
