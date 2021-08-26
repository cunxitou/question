package com.heu.commom.utils;

import java.util.List;
import java.util.Random;

public class RandomOrder {
    public static  void  knuth(List list){
        Random random = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            int anInt = random.nextInt(i);
            swap(list, i, anInt);
        }
    }

    private static <T> void swap(List<T> list, int i, int index){
        T temp;
        temp = list.get(i);
        list.set(i, list.get(index));
        list.set(index, temp);
    }
}
