package List;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(9);
//		System.out.println(intList);
		for (int i = 0; i < intList.size(); i++)
		{
			System.out.println(intList.get(i));
		}
		
		for (Integer i : intList) 
		{
			System.out.println(i);
		}
	}

}
