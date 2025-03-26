package CollectionsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    static ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Banan","Alma","Grapes"));
    public static void main(String[] args) {
    task17(arrayList);
    System.out.println(arrayList);

    }
    public static void task22(){
        for(int i = 0;i<arrayList.size();i++){
            System.out.println("Index at "+i+" " + arrayList.get(i));
        }
    }
    public static void task21(String s){
        arrayList.set(1,s);
        System.out.println("Element at index 2 replaced with "+s);
    }
    public static  void task20(){
        System.out.println("Original size of ArrayList "+ arrayList.size());
        arrayList.add("Orange");
        System.out.println("Increased size of ArrayList "+arrayList.size());
    }
    public static void task19(){
        System.out.println("Original arraylist "+ arrayList + " "+ arrayList.size() );
        arrayList.add(2,"hello");
        System.out.println("Updated arraylist "+ arrayList+ ' '+ arrayList.size());
        arrayList.trimToSize();
        arrayList.remove(2);
        System.out.println("Trimed arraylist "+ arrayList+" "+ arrayList.size());
    }
    public static  void task18(ArrayList arrayList){
        System.out.println("Array list status "+ (arrayList.isEmpty()? "empty":"not empty"));
    }
    public static  void task17(ArrayList arrayList){
        for(int i =arrayList.size()-1;i>-1;i--){
            arrayList.remove(i);}
        System.out.println("List is empty");
    }

}
