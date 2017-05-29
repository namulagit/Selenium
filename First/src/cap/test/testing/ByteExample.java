package cap.test.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ByteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int i=Integer.parseInt(str);
		
		ArrayList<Integer> arlst=new ArrayList<Integer>();
		ArrayList<Integer> arlst2=new ArrayList<Integer>();
		int l=i;
		while(l>0)
		{
		int j=i%2;
		arlst.add(j);
		l=i/2;
		i=l;
		
		}
		//System.out.println(arlst);
		
		System.out.println(arlst);
		ListIterator<Integer> itr=arlst.listIterator();
		while(itr.hasPrevious())
		{
			arlst2.add(itr.previous());
			int[] ar=new int[arlst2.size()];
			
					
			
			
		}
		
		
		
	}

}
