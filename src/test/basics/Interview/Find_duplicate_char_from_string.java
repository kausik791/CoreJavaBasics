package test.basics.Interview;

import java.util.HashMap;
import java.util.Map;

public class Find_duplicate_char_from_string {
    public static void main(String[] args) {
        String str = "kausikbabu kkmbabu babu";
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : charArray) {
            if(c==' '){
                continue;
            }
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println(c + " :repeated :" + map.get(c) + " times");
            }

        }

    }
}