package CollectionsTask;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) {

    }
    public static void task11(HashSet set1,HashSet set2){
        set1.retainAll(set2);
        System.out.println("Common elements of sets "+ set1);

    }
    public static void task10(HashSet set1,HashSet set2){
        if (set1.equals(set2)){
            System.out.println("Sets are equal");
        }else{
            System.out.println("Sets are not equal");
        }
        if (set1.containsAll(set2)) {
            System.out.println("Set1 contains all elements of Set2.");
        } else {
            System.out.println("Set1 does not contain all elements of Set2.");
        }

        if (set2.containsAll(set1)) {
            System.out.println("Set2 contains all elements of Set1.");
        } else {
            System.out.println("Set2 does not contain all elements of Set1.");
        }

    }
    public static TreeSet task8(HashSet hashSet){
        TreeSet treeSet = new TreeSet(hashSet);
        System.out.println("Hashset converted to treeset");
        return treeSet;
    }
    public static void task9(TreeSet<Integer> set){
        for(Integer i : set){
            if(i<7){
                System.out.println(i);
            }else{
                break;
            }
        }

    }
//    public static  ArrayList task7(HashSet set){
//        System.out.println("Hashset is converted ");
//        return (String) set.toArray(String[0]);
//    }
    public static HashSet task6(HashSet set){
        return (HashSet) set.clone();
    }
}
