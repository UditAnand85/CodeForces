import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[26];
        String name = sc.next();
        for(char ch : name.toCharArray()){
            freq[ch - 'a']++;
        }
        int count = 0;
        for(int i = 0;i<26;i++){
            if(freq[i] > 0){
                count++;
            }
        }
        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}