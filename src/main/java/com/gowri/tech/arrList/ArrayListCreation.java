package com.gowri.tech.arrList;

/*
 * @author NaveenWodeyar
 * @date 28-01-2025
 */

import java.util.ArrayList;

public class ArrayListCreation {

    public static void main(String[] args) {
        System.out.println("\n## ArrayList ##\n");

        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> intArrayList = new ArrayList<>(20);
        ArrayList<String> arrayList = new ArrayList<>(stringArrayList);

        //ensureCapacity() method is used to increase the current capacity of an ArrayList,
        intArrayList.ensureCapacity(40);
        System.out.println(intArrayList.size());
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        System.out.println(intArrayList);
        intArrayList.set(0, 0);

        //trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList,
        intArrayList.trimToSize();
        System.out.println(intArrayList.size());


        // toArray() method of ArrayList class. toArray() method returns an array containing all elements of the ArrayList. This method acts as a bridge between normal arrays and collection framework in java.
        Object[] array = intArrayList.toArray();
        for (int i = 0; i < array.length;i++){
            System.out.println("\n"+array[i]);
        }
    }
}
