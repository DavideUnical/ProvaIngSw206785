package DavideScrivano.ProvaIngSw206785;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	// Main di debug: IGNORARE
	
    public static void main( String[] args ) {
        System.out.println( "Esecuzione...\n" );
        MyListUtil mlu = new MyListUtil();
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(8);
        mylist.add(10);
        mylist.add(1);
        mylist.add(4);
        mylist.add(3);
        mylist.add(2);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);
        mylist.add(9);
        List<Integer> mysortedlist = mlu.sort(mylist, 1);
		for (int i=0; i<mylist.size(); i++) {
			System.out.println(mysortedlist.get(i));
		}
    }
}
