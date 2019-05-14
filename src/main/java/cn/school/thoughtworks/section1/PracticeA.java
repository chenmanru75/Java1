package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> res = new ArrayList<String>();
        for(Object object1:collection1){
            for(Object object2:collection2){
                if(object1 == object2){
                    res.add(object1.toString());
                }
            }
        }
        return res;
    }
}
