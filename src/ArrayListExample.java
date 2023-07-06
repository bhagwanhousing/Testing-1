import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){

        ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("hello");
        namesList.add("Brina");
        namesList.add("charles");
        namesList.set(1,"world");
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Vlaue to be added : ");
        String val1 = input.nextLine();
        namesList.add(val1);
//        namesList.clear(); //to clear the whole array
//        namesList.remove(0); // to remove the value based on its index;
        Collections.sort(namesList); // to sort the arrylist.

        for(int i = 0; i < namesList.size(); i++)
        {
            System.out.println(namesList.get(i));
        }
        System.out.println("--------Another Way to iterate---------");
        for(String val : namesList){
            System.out.println(val);
        }
    }
}
