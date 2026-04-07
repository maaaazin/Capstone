package Day1.Inheritance;

public class Puppy extends Dog{
    void weep() {
        System.out.println("Puppy weeps uwwwuwuwu");
    }

    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.weep();
        obj.bark();
        obj.eat();
    }
    
}
