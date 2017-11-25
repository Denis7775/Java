package Generics;

import java.util.*;

public class CollectionUtils {

    public static<T> void addAll(List<? extends T> sourse, List<? super T> destination){
        destination.addAll(sourse);
    }

    public static<T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static<T> int indexOf(List<? extends T> source, T o){
        return source.indexOf(o);
    }

    public static<T> List limit(List<? extends T> source, int size) {
        return new ArrayList<>(source.subList(0 ,size));
    }

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        for (T t : c2)
            removeFrom.remove(t);
    }

    public static<T> boolean containsAll(List<T> c1, List<T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<T> c1, List<T> c2) {
        for (T t : c2){
            if(c1.contains(t))
                return true;
        }
        return false;
    }

    public static<T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        Collections.sort(list);
        return new ArrayList<>(list.subList(list.indexOf(min), list.indexOf(max) + 1));
    }

    public static<T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        list.sort(comparator);
        return new ArrayList<>(list.subList(list.indexOf(min), list.indexOf(max) + 1));
    }

}