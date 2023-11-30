package Maps;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapMain {
	public static void main(String [] args) 
	{
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(52, "Apple");
		treeMap.put(34, "Banana");
		treeMap.put(15, "Guava");
		treeMap.put(68, "Pomegranate");
		treeMap.put(26, "PineApple");
		
		System.out.println(treeMap);
		
		System.out.println();
		
		for(Map.Entry<Integer,String> a : treeMap.entrySet()) 
		{
			System.out.println(a.getKey() + " : " + a.getValue());
		}
	}
}
