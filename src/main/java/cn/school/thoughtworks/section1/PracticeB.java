package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> obj2 = new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        for(List obj:collection2){
            for(Object obj1:obj){
                obj2.add(obj1.toString());
            }
        }
        for(Object object1:collection1){
            for(Object object2:obj2){
                if(object1 == object2){
                    res.add(object1.toString());
                }
            }
        }
        return res;
    }
}
