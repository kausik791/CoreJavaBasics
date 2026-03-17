package test.basics.Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNames {
    public static void main(String[] args) {
        String str = "kausik my name kausik babu maity kausik babu maity";
        Set<String> duplicateNames = new HashSet<String>();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    duplicateNames.add(words[i]);
                    break;
                }
            }
        }
        //System.out.println("Duplicate names in the string are: "+duplicateNames);
        System.out.println("Duplicate names in the string are: ");
        //Using Iterator to print duplicate names
        /*Iterator<String> itr = duplicateNames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        //Using for-each loop to print duplicate names
       /* for(String s:duplicateNames){
            System.out.println(s);
        }*/
        //Using forEach method with lambda expression to print duplicate names
        //duplicateNames.forEach(name -> System.out.println(name));
        //Using method reference to print duplicate names
       duplicateNames.forEach(System.out::println);


        }

    }

