package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> res = new HashMap<>();
        for(String str:collection1){
            if(str.length() == 1){
                Integer num = res.get(str);
                res.put(str, num == null ? 1: num+1);
            }else{
                Integer num = res.get(Character.toString(str.charAt(0)));
                if(str.charAt(1) == '-'){
                    String[] buff = str.split("-");
                    res.put(buff[0], num == null ? Integer.parseInt(buff[1]) : Integer.parseInt(buff[1]) + num);
                }
                if(str.charAt(1) == ':'){
                    String[] buff = str.split(":");
                    res.put(buff[0], num == null ? Integer.parseInt(buff[1]) : Integer.parseInt(buff[1]) + num);
                }
                if(str.charAt(1) == '['){
                    String buff = str.substring(2,str.length()-1);
                    String[] buff2 = str.split("\\[");
                    res.put(buff2[0], num == null ? Integer.parseInt(buff) : Integer.parseInt(buff) + num);
                }
            }
        }
        return res;
    }
}
