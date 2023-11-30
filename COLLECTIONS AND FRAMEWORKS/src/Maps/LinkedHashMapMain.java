package Maps;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain
{
	public static void main(String [] args) 
	{
		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
		linkedhashmap.put(10, "Harsha");
		linkedhashmap.put(12, "Sirisha");
		linkedhashmap.put(67, "Vaibu");
		linkedhashmap.put(78, "Sindhu");
		linkedhashmap.put(65, "Jaanu");
		linkedhashmap.put(13, "Vaishu");
		
		System.out.println(linkedhashmap);
		
		for(Map.Entry<Integer,String> m : linkedhashmap.entrySet()) 
		{
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
	}
}