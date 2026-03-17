package newfeature.lamdaFunctionalInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map= new TreeMap<>();
		map.put(2, "z");
		map.put(1, "f");
		map.put(5, "y");
		map.put(99, "c");
		System.out.println(map);
		
		Map<Integer,String> map2= new TreeMap<>((a,b)->b-a);
		map2.put(2, "z");
		map2.put(1, "f");
		map2.put(5, "y");
		map2.put(99, "c");
		System.out.println(map2);
		
		Map<String,Integer> map3= new TreeMap<>((a,b)-> a.compareTo(b));
		map3.put("z",2 );
		map3.put("f",1 );
		map3.put("y",5 );
		map3.put("c",99 );
		System.out.println(map3);
		
		Map<String,Integer> map4= new TreeMap<>((a,b)->b.compareTo(a));
		map4.put("z",2 );
		map4.put("f",1 );
		map4.put("y",5 );
		map4.put("c",99 );
		System.out.println(map4);
		map4.forEach((name,id)  ->System.out.println(name+" "+id));


	}

}
