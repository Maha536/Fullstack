package co.cts.training.collections;


import java.util.*;

public class ArrToColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[] {"first","second","third","four"};
		System.out.println(str);
		System.out.println(Arrays.toString(str));
		
		List<String> l = Arrays.asList(str);
		System.out.println(l);
		
 	}

}
