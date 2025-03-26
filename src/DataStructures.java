import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
      HashMap<String,String> hashMap = new HashMap<>();
      hashMap.put("Str","Red");
      hashMap.put("Ter","Ger");
      for(Map.Entry<String,String> map :hashMap.entrySet()){
          System.out.println(  map.getKey()+map.getValue());
      }

    }
}
