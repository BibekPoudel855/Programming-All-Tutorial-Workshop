import java.util.ArrayList;
import java.util.Iterator;

public class Week_17_Tutorial1 {
    public static void main(String[] args) {
        ArrayList fruitList = new ArrayList();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        System.out.println(fruitList);


        System.out.println(fruitList.contains("apple"));
        System.out.println(fruitList.contains("banana"));
        System.out.println(fruitList.contains("orange"));


        ArrayList <String> stringList = new ArrayList<>();
        Iterator iterator = fruitList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}