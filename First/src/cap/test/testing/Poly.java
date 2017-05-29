package cap.test.testing;

import java.util.SortedSet;
import java.util.TreeSet;

public class Poly{
	
	public int add(int x,int y)
	{
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Test t1=new Test(){};
		t1.show()*/;
		short s=9;
		Poly p=new Poly();
		int j=p.add(s, 3);
		System.out.println(j);
		int l=010;
		
		System.out.println(l);
		
		SortedSet sorted=new TreeSet();
		sorted.add("a");
		sorted.add("c");
		sorted.add("b");
		sorted.add("g");
		sorted.add("d");
		sorted.add("w");
		sorted.add("p");
		
		System.out.println(sorted);
		
	}

}
