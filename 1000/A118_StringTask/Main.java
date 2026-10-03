import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer st = new StringBuffer();
        String s = sc.next();
        s = s.toLowerCase();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i) == 'u' || s.charAt(i) == 'y'){
                continue;
            }else{
                st.append(".");
                st.append(s.charAt(i));
            }
        }
        System.out.println(st.toString());
        sc.close();
    }
}