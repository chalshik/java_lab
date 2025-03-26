package CollectionsTask;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTasks {
    public static void main(String[] args) {

    }
    public static ArrayList task23(LinkedList list ){
        ArrayList arrayList = new ArrayList();
        for(int i = 0;i<list.size();i++){
            arrayList.add(list.get(i));
        }
        System.out.println("LinkedList converted to Arraylist");
        return arrayList;
    }
    public static void task22(LinkedList<String> list,String s){
        System.out.println("Linked list "+(list.contains(s)? "contain"+s:"doesnt contain"+s));
    }
    public static void task21(LinkedList list){
        System.out.println("Last element of linkedlist "+ list.peekLast());

    }
    public static void task20(LinkedList list){
        System.out.println("First element of linkedlist "+ list.peekFirst());
    }
    public static void task19(LinkedList list){
        System.out.println("First removed element of linkedlist "+ list.pollFirst());
    }
    public static void task17(LinkedList list,LinkedList list2){
        LinkedList joinedlist = new LinkedList();

        list.addAll(list2);
        joinedlist.addAll(list);
    }

}
