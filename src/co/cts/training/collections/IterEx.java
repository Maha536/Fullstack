package co.cts.training.collections;

import java.util.*;

public class IterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> strlst = new ArrayList<String>();
		
		strlst.add("a");
		strlst.add("b");
		strlst.add("c");
		strlst.add("d");
		strlst.add("e");
		strlst.add("f");
		
		Iterator i = strlst.iterator();
		System.out.println(strlst);
		
		Object ob= strlst.toArray();
		String sarr[]=strlst.toArray(new String[0]);
		
		System.out.println(ob);
		
		System.out.println(Arrays.toString(sarr));
		
		//for(String s:sarr) {
		//	System.out.println(s);
		//}
		
		
		
		
		/*while(i.hasNext()) {
			String str= i.next();
			System.out.println(str);
			if(str.equals("c")) {
				i.remove();
			}
			
		}
		
		for(String s:strlst) {
			System.out.println(s);
		}*/
	}

}
