package Reflection;

public class MainTest {
    public static void main(String[] args) {
        From from = new From(12,"Preston","Ivanov",34.3,244,true,false);
        To to = new To(32, "Pin","Shivalov","67kg", 43,false,true);

        System.out.println("From:");
        System.out.println(from.toString());
        System.out.println();
        System.out.println("To before:");
        System.out.println(to.toString());

        BeanUtils.assign(from,to);

        System.out.println();
        System.out.println("To after:");
        System.out.println(to.toString());
    }
}
