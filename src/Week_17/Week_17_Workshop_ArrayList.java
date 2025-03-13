package Week_17;
import java.util.ArrayList;
import java.util.Iterator;

public class Week_17_Workshop_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("apple");
        nameList.add("banana");
        nameList.add("orange");

        for(String name : nameList){
            System.out.println(name);
        }

        Iterator<String> iterator = nameList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(nameList.get(0));
        nameList.remove("orange");
        nameList.remove(0);
        nameList.clear();

    }
}
