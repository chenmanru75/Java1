package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> list= object.get("value");
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            for(String str:list){
                if(str == entry.getKey()){
                    Integer mins = entry.getValue()/3;
                    collectionA.put(str,entry.getValue()-mins);
                }
            }
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        return collectionA;
    }
}
