package CollectionsTask;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class TreeSetTask {
    public static void main(String[] args) {

    }
    public static void task16(TreeSet treeSet, Object o ){
        if(treeSet.remove(o)){
            System.out.println("Element removed");
        };

    }
    public static void task15(TreeSet treeSet){
        System.out.println("Last removed element "+ treeSet.pollLast());
    }
    public static  void task14(TreeSet treeSet){
        System.out.println("FIrst removed element "+ treeSet.pollFirst());
    }
    public static void task13(TreeSet<Integer> treeSet, Integer o) {
        System.out.println("Lower value than " + o + ": " + treeSet.lower(o));
    }
    public static void task12(TreeSet treeSet,Object o){
        System.out.println("Greater or equal value for "+o+" "+treeSet.ceiling(o));
    }
    public static void task11(TreeSet treeSet,Object o){
        System.out.println("Lower or equal value in treeset for "+o+" "+treeSet.floor(o));
    }
    public static void taks10(TreeSet treeSet,Object o){
        System.out.println("Greater or equal for "+o+treeSet.ceiling(o));
    }
}
