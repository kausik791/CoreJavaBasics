package test.basics.Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateNamesCount {
    public  static void main(String[] args) {
        String str = "kausik my name kausik babu maity kausik babu maity";
        String[] words = str.split(" ");
        Map<String, Integer> maps = new HashMap<String, Integer>();

/*        for (int i = 0; i < words.length; i++) {
            if (maps.get(words[i]) != null) {
                maps.put(words[i], maps.get(words[i]) + 1);
            } else {
                maps.put(words[i], 1);
            }
        }*/

        for (String word : words) {
            if (maps.get(word) != null) {
                maps.put(word, maps.get(word) + 1);
            } else {
                maps.put(word, 1);
            }
        }
        Set<String> names = maps.keySet();
        for (String name : names) {
            if (maps.get(name) > 1) {
                System.out.println(name + "  :repeated :" + maps.get(name) + " times");
            }

        }
    }
}
