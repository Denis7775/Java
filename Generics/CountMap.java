package Generics;

import java.util.*;

public interface CountMap<T> {

    void add(T o);

    int getCount(T o);

    int remove(T o);

    int size();

    void addAll(CountMapImpl<T> source);

    Map toMap();

    void toMap(Map<T, Integer> destination);

}
