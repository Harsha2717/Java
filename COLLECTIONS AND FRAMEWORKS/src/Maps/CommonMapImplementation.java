package Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class CommonMapImplementation {
	public static void main(String[] args) 
	{
		Map<Integer,String>hashMap = new HashMap<Integer,String>();
		Map<Integer,String>linkedhashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String>treeMap = new TreeMap<Integer,String>();
		
		System.out.println("HashMap : Stores Elements without any Specific Order");
		disp(hashMap);
		System.out.println();
		
		System.out.println("LinkedHashMap : Stores Elements in the Order they have Inserted");
		disp(linkedhashMap);
		System.out.println();
		
		System.out.println("TreeMap : Stores Elements sorted Natural Order");
		disp(treeMap);
		System.out.println();
	}
	public static void disp(Map<Integer,String> map) 
	{
		map.put(10, "Dog");
		map.put(5, "Cat");
		map.put(9, "Rat");
		map.put(12, "Pig");
		map.put(15, "Squirrel");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) 
		{
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}

}
