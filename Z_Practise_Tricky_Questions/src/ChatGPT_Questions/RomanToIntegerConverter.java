package ChatGPT_Questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToIntegerConverter 
{
	public static void main(String[] args) 
	{
		String roman = "MCMXCIV";
		System.out.println(romanTointeger(roman));
	}

	public static int romanTointeger(String s) {
		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "LXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "DCCCC");

		Map<Character, Integer> map = new LinkedHashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		ArrayList<Character> list = new ArrayList<>();

		char[] c = s.toCharArray();
		for (Character ch : c) {
			list.add(ch);
		}
		int total = 0;
		for (Character key : list) {
			if (map.containsKey(key)) {
				total += map.get(key);
			}
		}
		return total;
	}
}
