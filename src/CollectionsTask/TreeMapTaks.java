package CollectionsTask;

import java.util.*;

public class TreeMapTaks {
    public static void main(String[] args) {

    }

    public static void task5(TreeMap treeMap) {
        Set<String> set = treeMap.keySet();
        System.out.println(set);
    }

    public static void task7(TreeMap<String, Integer> treeMap) {

        TreeMap<String, Integer> treeMap1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o2.compareTo(o1);
            }
        });
        System.out.println(treeMap1);
    }
    public static void task8(TreeMap treeMap){
        Map.Entry smallentry  =  treeMap.firstEntry();
        Map.Entry biggestentry = treeMap.lastEntry();
        System.out.println( smallentry);
        System.out.println(biggestentry);
    }
    public static void task9(TreeMap treeMap){
        Object lowestkey = treeMap.firstKey();
        Object highestkey = treeMap.lastKey();
        System.out.println(lowestkey);
        System.out.println(highestkey);
    }
    public static void task10(TreeMap treeMap){
        Set<Map.Entry> descending = treeMap.descendingKeySet();
        System.out.println(descending);
    }
    public static void task12(TreeMap treeMap,Object s){
        Object higherkey = treeMap.floorKey(s);
    }
    public static void task13(TreeMap treeMap,Object key){
        SortedMap portion = treeMap.headMap(key);
        System.out.println(portion);
    }
    public static void task14(TreeMap treeMap,Object key,boolean b)
    {
        SortedMap portion = treeMap.headMap(key,b);
        System.out.println(portion);
    }}
