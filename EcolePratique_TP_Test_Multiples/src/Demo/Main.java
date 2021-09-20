package Demo;

import java.util.List;
import com.tld.exercices.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> myList = Exo6.initIntList(100);
		for(int i=0; i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		/*List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(7);
		myList.add(9);
		myList.add(4);
		myList.add(3);
		myList.add(2);*/
		
		System.out.println("****" + Exo6.doubleCount(myList));

	}

}
