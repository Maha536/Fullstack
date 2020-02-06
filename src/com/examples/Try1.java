package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> strList = new ArrayList<String>();
		
		strList.add("First");
		strList.add("Second");
		strList.add("Third");
		strList.add("Fourth");
		strList.add("Fifth");
		
		System.out.println(strList);
		
		// need to convert into array (returns a copy)
		Object arr[] = strList.toArray();
		String sarr[] = strList.toArray(new String[0]);
		
		// System.out.println(sarr);
		System.out.println(Arrays.toString(sarr));
		
		strList.set(2, "NewValue"); // Third replaced by NewValue (list)
		sarr[3] = "Check"; // Fourth Replaced by Check (array)
		
		System.out.println("LIST : " + strList);
		System.out.println("ARRAY : " + Arrays.toString(sarr));
	}

}
