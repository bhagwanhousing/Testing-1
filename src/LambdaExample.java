import com.sun.nio.sctp.AbstractNotificationHandler;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface StringLength{
    int len(String s);
}

public class LambdaExample {
    public static void main(String[] args) {
//        Thread myThread =  new Thread(()-> System.out.println("Printed Inside Thread Class"));
//        myThread.start();
//        myThread.run();
//        Thread myThread =  new Thread(LambdaExample::printMessage);
//        myThread.start();

        List<String> s = new ArrayList<>();

        s.add("This is First String");
        s.add("This is Second String");
        s.add("This is third String");
        s.add("This is third String");

        System.out.println(s);

//        StringLength stringLength = (String s1) -> s1.length();
//        List<Integer> Strlen = s.stream().map(x->x.length()).collect(Collectors.toList());
//        s.stream().filter()  // it will take a predicate/lambda function as paramter and used to filter based on any condition.
//        System.out.println(s.stream().distinct().collect(Collectors.toList()));

//        System.out.println(Strlen);


//        for(String s1:s){
//            System.out.println(stringLength.len(s1));
//        }
//        s.forEach(s1->System.out.println(s1));
//        s.forEach(System.out::println);

//        s.forEach(s1->System.out.println(stringLength.len(s1)));

//        System.out.println(s.stream().mapToInt(String::length).max().orElse(0)); //max
//        System.out.println(s.stream().mapToInt(String::length).min().orElse(0)); //min
//        System.out.println(s.stream().mapToInt(String::toLowerCase).min().orElse(0)); //lowercase
//        System.out.println(s.stream().mapToInt(String::toUpperCase).min().orElse(0)); //uppercase

//        s.stream().forEach(p1->System.out.println(p1));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();
        int even = numbers.stream().filter(n->n%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);

        System.out.println("Sum of even numbers doubled: " + sum);

        List<Integer> number = Arrays.asList(1, 3, 5, 2, 7);

        boolean containsEven = number.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("Contains even number: " + containsEven);

    }
//    public static void printMessage(){
//        System.out.println("Printed from external Function");
//    }
}
