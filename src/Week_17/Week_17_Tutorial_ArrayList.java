package Week_17;
import java.util.ArrayList;

public class Week_17_Tutorial_ArrayList {
    int groceryId;
    String groceryName;
    int Qty;
    public static void main(String[] args) {
        ArrayList groceryList = new ArrayList();
        Week_17_Tutorial_ArrayList grocery = new Week_17_Tutorial_ArrayList();
        grocery.groceryId = 1;
        grocery.groceryName = "Apple";
        grocery.Qty = 10;
        // adding on array list as obj
        groceryList.add(grocery);

        Week_17_Tutorial_ArrayList grocery2 = new Week_17_Tutorial_ArrayList();
        grocery2.groceryId = 2;
        grocery2.groceryName = "Banana";
        grocery2.Qty = 10;
        groceryList.add(grocery2);
        Week_17_Tutorial_ArrayList grocery3 = new Week_17_Tutorial_ArrayList();
        grocery3.groceryId = 3;
        grocery3.groceryName = "Orange";
        grocery3.Qty = 10;
        groceryList.add(grocery3);
        Week_17_Tutorial_ArrayList grocery4 = new Week_17_Tutorial_ArrayList();
        grocery4.groceryId = 4;
        grocery4.groceryName = "Apple";

        System.out.println(groceryList);
        Week_17_Tutorial_ArrayList g=(Week_17_Tutorial_ArrayList) groceryList.get(0);
        System.out.println(g.groceryName);
    }
}
