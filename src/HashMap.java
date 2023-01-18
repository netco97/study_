import java.util.*;

public class HashMap {

    public static void main(String[] args)
    {
        //Map 정리
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        //1
        for(Integer key : map.keySet()){
            System.out.println("key: "+key+" values: "+map.get(key));
        }

        //2 entrySet
        for(Map.Entry<Integer, String> elem : map.entrySet()){
            System.out.println("key: "+elem.getKey()+" values: "+elem.getValue());
        }
    }

}
