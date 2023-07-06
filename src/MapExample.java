import java.util.*;

public class MapExample {
    public static void main(String args[]){
//     SortedMap<Integer,String> sm = new TreeMap<>();
//        sm.put(1,"hello");
//        sm.put(2,"world");
//        sm.put(3,"Bhagwan");
//
//        for(Integer i:sm.keySet())
//        {
//            System.out.println(sm.get(i));
//        }
        Map<Integer,String> m = new LinkedHashMap<>();
        m.put(2,"hello");
        m.put(1,"world");
        m.put(3,"bhagwan");
        m.remove(2);
        System.out.println(m.size());

//
//        for(String i:m.values()){
//            System.out.println(i);
//        }

        for(Integer i:m.keySet()){
            System.out.println(m.get(i));
        }
    }
}

