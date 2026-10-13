import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();
        int ans = 0;
        ArrayList<String> list = new ArrayList<>();
        
        while(start.charAt(0) != end.charAt(0) && start.charAt(1) != end.charAt(1)){
            if(start.charAt(0) > end.charAt(0) && start.charAt(1) > end.charAt(1)){
                list.add("LD");
                start = (char)(start.charAt(0) - 1) + start.substring(1);
                start = start.charAt(0) + "" + (char)(start.charAt(1) - 1);
            }
            else if(start.charAt(0) < end.charAt(0) && start.charAt(1) > end.charAt(1)){
                list.add("RD");
                start = (char)(start.charAt(0) + 1) + start.substring(1);
                start = start.charAt(0) + "" + (char)(start.charAt(1) - 1);
            }
            else if(start.charAt(0) < end.charAt(0) && start.charAt(1) < end.charAt(1)){
                list.add("RU");
                start = (char)(start.charAt(0) + 1) + start.substring(1);
                start = start.charAt(0) + "" + (char)(start.charAt(1) + 1);
            }
            else if(start.charAt(0) > end.charAt(0) && start.charAt(1) < end.charAt(1)){
                list.add("LU");
                start = (char)(start.charAt(0) - 1) + start.substring(1);
                start = start.charAt(0) + "" + (char)(start.charAt(1) + 1);
            }
        }
        while(start.charAt(0) > end.charAt(0)){
            list.add("L");
            start = (char)(start.charAt(0) - 1) + start.substring(1);
        }
        while(start.charAt(0) < end.charAt(0)){
            list.add("R");
            start = (char)(start.charAt(0) + 1) + start.substring(1);
        }
        while(start.charAt(1) > end.charAt(1)){
            list.add("D");
            start = start.charAt(0) + "" + (char)(start.charAt(1) - 1); 
}
        while(start.charAt(1) < end.charAt(1)){
            list.add("U");
            start = start.charAt(0) + "" + (char)(start.charAt(1) + 1); 
        }
        System.out.println(list.size());
        for(String st: list){
            System.out.println(st);
        }

        sc.close();
    }
}
