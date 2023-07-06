import java.util.*;

public class SetExample {
    public static void main(String[] args){

        Set<String> s = new LinkedHashSet<>();

        s.add("ghi");
        s.add("def");
        s.add("abc");

        for(String val:s){
            System.out.println(val);
        }
        System.out.println("Using Git");
    }
}
