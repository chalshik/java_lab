import java.util.ArrayList;

public class GenericAssignment {
    public static class Storage<T>{
        ArrayList<T> arrayList = new ArrayList<>();
        public void add(T t){
            arrayList.add(t);
        }
        public void remove(T t){
            arrayList.remove(t);
        }
        public void display(){
            for(T item:arrayList){
                System.out.println(item);
            }
        }
        public void size(){
            System.out.println(arrayList);
        }
        public String toString() {
            return " array"+ arrayList;
        }
    }

    public static void main(String[] args) {
        Storage<String> s = new Storage();
        s.add("String");
        s.display();
        s.remove("String");
        System.out.println(s);

    }

}
