package DavideScrivano.ProvaIngSw206785;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class TestClass {
	
	private static MyListUtil mlu = new MyListUtil();
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass OK");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass OK");
	}

	@After
	public void after() {
		System.out.print("After Test - Time: ");
		DateTime dt = new DateTime();
		System.out.println(dt);
	}

	@Before
	public void before() {
		System.out.print("Before Test - Time: ");
		DateTime dt = new DateTime();
		System.out.println(dt);
	}
	
	@Test
	public void ascendenteWorks() {
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
        List<Integer> mysortedlist = mlu.sort(mylist, 0); // Ascendente
        Integer a = 1, b = 5, c = 10;
        assertEquals(a, mysortedlist.get(0));
        assertEquals(b, mysortedlist.get(4));
        assertEquals(c, mysortedlist.get(9));
	}

	@Test
	public void discendenteWorks() {
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
        List<Integer> mysortedlist = mlu.sort(mylist, 1); // Discendete
        Integer a = 10, b = 5, c = 1;
        assertEquals(a, mysortedlist.get(0));
        assertEquals(b, mysortedlist.get(5));
        assertEquals(c, mysortedlist.get(9));
	}

}
