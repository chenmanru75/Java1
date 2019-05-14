package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> res = new ArrayList<>();
        List<String> list= collection2.get("value");
        for (String str:collection1) {
            for (String str1:list ) {
                if (str.equals(str1)){
                    res.add(str);
                }
            }
        }
        return  res;
    }
}
