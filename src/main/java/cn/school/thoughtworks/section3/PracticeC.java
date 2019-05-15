package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {


    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        List<String> list= object.get("value");
//        PracticeA.countSameElements(collectionA);
        PracticeA practiceA=new PracticeA();
        Map<String, Integer> res = practiceA.countSameElements(collectionA);
        PracticeB practiceB = new PracticeB();
        Map<String, Integer> res2 = practiceB.createUpdatedCollection(res,object);
//        for (Map.Entry<String, Integer> entry : res.entrySet()) {
//            for(String str:list){
//                if(str == entry.getKey()){
//                    Integer mins = entry.getValue()/3;
//                    res.put(str,entry.getValue()-mins);
//                }
//            }
//        }
        return res2;
    }
}
