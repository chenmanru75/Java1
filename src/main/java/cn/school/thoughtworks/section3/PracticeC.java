package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> res = new HashMap<>();
        List<String> list= object.get("value");
        for(String str:collectionA){
            Integer num = res.get(str);
            res.put(str, num == null ? 1: num+1);
        }
        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            for(String str:list){
                if(str == entry.getKey()){
                    Integer mins = entry.getValue()/3;
                    res.put(str,entry.getValue()-mins);
                }
            }
        }
        return res;
    }
}
