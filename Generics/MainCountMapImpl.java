package Generics;

import java.util.*;

public class MainCountMapImpl {
    public static void main(String[] args) {
        CountMapImpl<String> map = new CountMapImpl<>();
        CountMapImpl<String> mapNew = new CountMapImpl<>();

        map.add("3");
        map.add("4");

        mapNew.add("4");
        mapNew.add("1");

        mapNew.addAll(map);

        System.out.println(mapNew.getCount("4"));
        System.out.println(mapNew.getCount("3"));
        System.out.println(mapNew.getCount("1"));

    }
}

