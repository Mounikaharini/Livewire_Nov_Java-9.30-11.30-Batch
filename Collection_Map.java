package CollectionsTopic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTypes {

	public static void main(String[] args) {
		
		 // 1. HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(4, "B");
        System.out.println("HashMap: " + hashMap);

//        // 2. LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        System.out.println("LinkedHashMap: " + linkedHashMap);

//        // 3. TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "A");
        treeMap.put(1, "B");
        treeMap.put(2, "C");
        System.out.println("TreeMap: " + treeMap);
        
        TreeMap<String ,Integer> t1 = new TreeMap<>();
        t1.put("A",1);
        t1.put("X", 2);
        t1.put("B",4);
        System.out.println(t1);
        t1.remove("A");
        System.out.println(t1);
        System.out.println(t1.containsKey("X"));
       


	}

}
