package Generics;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T>{

    Map<T, Integer> container = new HashMap<>();

    @Override
    public void add(T o) {
        boolean trig = false;
        for (Map.Entry<T, Integer> entry : container.entrySet()) {
            if (entry.getKey().equals(o)) {
                Integer numOfThisElements = container.get(o);
                ++numOfThisElements;
                container.put(o, numOfThisElements);
                trig = true;
            }
        }
        if (!trig) {
            Integer init = 1;
            container.put(o, init);
        }
    }

    @Override
    public int getCount(T o) {
        return container.get(o);
    }

    @Override
    public int remove(T o) {
        Integer currentNumber = container.get(o);
        container.put(o, null);
        return currentNumber;
    }

    @Override
    public int size() {
       return container.size();
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        boolean trig = false;
        for (Map.Entry<T, Integer> entryC : container.entrySet()) {
            for (Map.Entry<T, Integer> entryD : destination.entrySet()) {
                if (entryC.getKey() != null) {
                    if (entryC.getKey().equals(entryD.getKey())) {
                        Integer numC = entryC.getValue();
                        Integer numD = entryD.getValue();
                        numD += numC;
                        this.container.put(entryD.getKey(), numD);
                        trig = true;
                    }
                }
            }
            if (!trig) {
                this.container.put(entryC.getKey(), entryC.getValue());
            }
        }
    }

    @Override
    public void addAll(CountMapImpl<T> source) {
        Map<T, Integer> transfer = source.toMap();
        boolean trig = false;
        for (Map.Entry<T, Integer> entryS : transfer.entrySet()) {
            for (Map.Entry<T, Integer> entryC : this.container.entrySet()){
                if (entryS.getKey() != null) {
                    if (entryS.getKey().equals(entryC.getKey())){
                        Integer numS = entryS.getValue();
                        Integer numC = entryC.getValue();
                        numC += numS;
                        this.container.put(entryC.getKey(), numC);
                        trig = true;
                    }
                }
            }
            if (!trig){
                this.container.put(entryS.getKey(), entryS.getValue());
            }
        }
    }

    @Override
    public Map toMap() {
        Map<T, Integer> hashMap = new HashMap<>();
        for (Map.Entry<T, Integer> entry : container.entrySet())
            hashMap.put(entry.getKey(), container.get(entry.getKey()));
        return hashMap;
    }
}