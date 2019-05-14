package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> list= object.get("value");
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            for(String str:list){
                if(str == entry.getKey()){
                    collectionA.put(str,entry.getValue()-1);
                }
            }
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        return collectionA;
    }
}
