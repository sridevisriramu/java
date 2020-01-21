package JAVA;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		
		// arrays allows duplicates
		List<String> listTest= Arrays.asList("test1", "test2", "test1", "ftgg4", "t", "t");
	
		java.util.Iterator<String> itr = listTest.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
