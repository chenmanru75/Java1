package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> res = new HashMap<>();
        List<String> list= object.get("value");
        for(String str:collectionA){
            Integer num = res.get(str);
            if(str.length() == 1){
                res.put(str, num == null ? 1: num+1);
            }else{
                String[] buff = str.split("-");
                res.put(buff[0],Integer.parseInt(buff[1]));
            }
        }
        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            for(String str:list){
                if(str.equals(entry.getKey())){
                    Integer mins = entry.getValue()/3;
                    res.put(str,entry.getValue()-mins);
                }
            }
        }
        return res;
    }
}
