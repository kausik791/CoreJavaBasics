package newfeature.lamdaFunctionalInterface;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLamda {

	public static void main(String[] args) {
	Set<Integer> s= new TreeSet<>();
	s.add(5);
	s.add(1);
	s.add(99);
	s.add(76);
	s.add(555);
	s.add(109);
	System.out.println(s);//default sorting
	Set<Integer> ss= new HashSet<>();
	s.add(5);
	s.add(1);
	s.add(99);
	s.add(76);
	s.add(555);
	s.add(109);
	
	//Collections.sort(ss, (a,b)->b-a);// for set sort()  is not applicable even for Treeset
	
	//Treeset is having one constructor wich can take comparator
	
	Set<Integer> st= new TreeSet<>((a,b)->b-a);
	st.add(5);
	st.add(1);
	st.add(99);
	st.add(76);
	st.add(555);
	st.add(109);
	System.out.println("for reverse"+st);
	}

}
