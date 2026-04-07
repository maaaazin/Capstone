package Day1.Inheritance;

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks bhow bhow");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}
