package ChatGPT_Questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Anagram_checker {
	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
		}
		if (count == str1.length()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		try (BufferedReader Buff = new BufferedReader(new InputStreamReader(System.in))) {
			
			System.out.println("Enter two Strings to Check for Anagram");
			String s1 = Buff.readLine();
			String s2 = Buff.readLine();

			System.out.println(isAnagram(s1, s2));

		} catch (IOException e) {
			System.out.println("Unable to read");
		}
	}
}
