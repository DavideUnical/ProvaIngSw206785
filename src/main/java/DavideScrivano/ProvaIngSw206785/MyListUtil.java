package DavideScrivano.ProvaIngSw206785;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListUtil {
	
	/*      order = 0 //Ascendente
	 * 		order = 1 //Dicendente
	 */
	
	public MyListUtil() {}
	
	public List<Integer> sort(List<Integer> list, int order) {
		 List<Integer> sortedList = new ArrayList<Integer>();
		 for (int i=0; i<list.size(); i++) {
			 sortedList.add(list.get(i));
		 }
		 Collections.sort(sortedList);
		 if (order==1) Collections.reverse(sortedList);
		 return sortedList;
	}
}
