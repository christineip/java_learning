package animal_interface;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();
        System.out.println(cat.Sound());
        System.out.println(dog.Sound());
        System.out.println(duck.Sound());
    }
}
