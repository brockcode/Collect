package brockCollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class brockCollection {

	
	List<Integer> brock = Arrays.asList((new Integer[] {1,2,3,4,5})) ;
	
	
	brockCollection(){
		
	
	
	
	
	HashMap<String, Integer> yes = new HashMap<String, Integer>();
	
	yes.put("bbb", 0);
	yes.put("ddd", 2);
	yes.put("aaa", 3);
	yes.put("ccc", 5);
	yes.put("eee", 1);
	
	//Will print without any comparing: prints by hash order 
	TreeMap<String, Integer> inOrder = new TreeMap<String, Integer>();
	
	inOrder.put("bbb", 0);
	inOrder.put("ddd", 2);
	inOrder.put("aaa", 3);
	inOrder.put("ccc", 5);
	inOrder.put("eee", 1);
	//Will print with Comparator: prints by key order
	System.out.println(yes + " " +  inOrder);
	
	Set<?> set = inOrder.entrySet();
	Iterator<?> it = set.iterator();
	while(it.hasNext()) {
		Map.Entry<?, ?> m = (Map.Entry<?, ?>)it.next();
		System.out.println(m.getKey() + ":" + m.getValue());
		//Better to Use TreeMap if you need things in key order
		
	}
	
	
	}
	
	public static void main(String[] args) {
		
		brockCollection b = new brockCollection();
		
		
		
	}

	
	
	
	
}
