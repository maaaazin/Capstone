package Day1.Inheritance;

public class Cat extends Animal {
    void meows() {
        System.out.println("Cat meows meow meow");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.meows();
        c1.eat();
    }
}
