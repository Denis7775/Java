package Java_2_Person;

public class Test {
    public static void main(String[] args) {
        Person m1 = new Person(true, "Peter");
        Person w1 = new Person(false, "Lora");
        Person m2 = new Person(false, "Alex");
        Person w2 = new Person(true, "Lily");

        System.out.println(m1.marry(w1));
        System.out.println(m2.marry(w2));
        System.out.println(m1.marry(m2));
        System.out.println(w2.marry(m1));
    }
}
