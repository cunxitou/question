package com.heu.commom.utils;

import java.util.List;
import java.util.Random;

/**
 * 数据的随机排序
 */
public class RandomOrder {
    public static  void  knuth(List list){
        Random random = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            int anInt = random.nextInt(i);
            swap(list, i, anInt);
        }
    }

    /**
     * 交换数组两个索引位置
     * @param list
     * @param i
     * @param index
     * @param <T>
     */
    private static <T> void swap(List<T> list, int i, int index){
        T temp;
        temp = list.get(i);
        list.set(i, list.get(index));
        list.set(index, temp);
    }
}
