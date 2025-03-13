package Week_17;
import java.util.ArrayList;
public class Week_17_Workshop_ArrayList_Store_Object {
    String name;
    int age;
    double rollNumber;
    Week_17_Workshop_ArrayList_Store_Object(String name, int age, double rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    public static void main(String[] args) {
        ArrayList<Week_17_Workshop_ArrayList_Store_Object> objectList = new ArrayList<>();
        Week_17_Workshop_ArrayList_Store_Object obj1 = new Week_17_Workshop_ArrayList_Store_Object("Bibek", 18, 1);
        objectList.add(obj1);

        System.out.println(objectList);

        for (Week_17_Workshop_ArrayList_Store_Object object : objectList) {
            System.out.println(object.name);
            System.out.println(object.age);
            System.out.println(object.rollNumber);
        }
    }
}
