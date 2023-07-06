import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>();

        l.add("First");
        l.add("Second");
        l.add("third");
        l.addFirst("Before First");
        l.addLast("Last");
        l.add("four");

        for(String val:l){
            System.out.println(val);
        }
//        l.removeFirst();
//        l.removeLast();
        for(String val:l){
            System.out.println(val);
        }
    }
}
