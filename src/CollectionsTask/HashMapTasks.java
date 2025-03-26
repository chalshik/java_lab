package CollectionsTask;

import java.util.*;

public class HashMapTasks {
    public static void main(String[] args) {

    }
    public static void task12(HashMap hashMap){
        Collection<Object> col = hashMap.values();
        System.out.println(col);
    }
    public static void task11(HashMap hashMap){
        Set<String> set = hashMap.keySet();
        System.out.println(set);
    }
    public static void task10(HashMap hashMap,String key){
        System.out.println(hashMap.get(key));
    }
    public static  void task9(HashMap hashMap){
        Set<Map.Entry<String,Object>> set = hashMap.entrySet();
        System.out.println(set);
    }
    public static void task8(HashMap hashMap,String key,Object value){
        if(hashMap.get(key)==value){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void task7(HashMap hashMap,String key){
        if(hashMap.containsKey(key)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
