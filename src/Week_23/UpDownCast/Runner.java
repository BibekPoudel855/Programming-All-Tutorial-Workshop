package Week_23.UpDownCast;
import static Week_23.UpDownCast.Animal.animals;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        animals.add(dog);
        animals.add(cat);
        for (Animal animal : animals){
            if(animal instanceof Dog){
                System.out.println("dog");
                animal.eat();
            }else if(animal instanceof Cat){
                System.out.println("cat");
                animal.eat();

            } else{
                System.out.println("unknown");
            }
        }
    }
}
