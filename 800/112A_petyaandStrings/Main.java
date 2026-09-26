import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st1 = sc.next();
        String output = "0";
        st = st.toLowerCase();
        st1 = st1.toLowerCase();
        for(int i = 0;i<st.length();i++){
            if(st.charAt(i) > st1.charAt(i)){
                output = "1";
                break;
            }else if(st.charAt(i) < st1.charAt(i)){
                output = "-1";
                break;
            }
        }
        System.out.println(output);

        sc.close();
    }
}
