package Week_24.UpDownCast;
import static Week_24.UpDownCast.Animal.animals;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        animals.add(dog);
        Dog  dog2;
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
