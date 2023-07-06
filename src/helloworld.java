import java.util.Scanner;
class Person{
    String name;
    int age;
    int pNo;

    void fun(){
        System.out.println("hello : " + name + " Age : " + age + " Phone Number : " + pNo);
    }
}
public class helloworld{
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter text");
//
//        int value = input.nextInt();
//
//        System.out.println("Entered text : " + value);
//
//       String[] fruits = new String[3];
//
//        fruits[0] = "2";
//        fruits[1] = "hello world";
//        for(String fruit : fruits)
//            System.out.println(fruituit);
        Person person1 = new Person();

        person1.name = "bhagwan";
        person1.age = 22;
        person1.pNo = 99145;

        person1.fun();
    }
}