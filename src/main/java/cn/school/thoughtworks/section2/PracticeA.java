package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    public  Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> res = new HashMap<>();
        for(String str:collection1){
            Integer num = res.get(str);
            res.put(str, num == null ? 1: num+1);
        }
        return res;
    }
}
