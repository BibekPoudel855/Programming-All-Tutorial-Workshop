package Week_23.UpDownCast;

import java.util.ArrayList;

public class Animal {
    public static ArrayList<Animal> animals = new ArrayList<Animal>();
    public static void main(String[] args) {

    }
    public void eat(){
        System.out.println("animal eat");
    }
    public Animal() {
        System.out.println("Cons Animal");
    }
}
