import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int n = str.length();
		int cnt = 0;
		int tmp = 1;
		for (int i = 0; i < n - 1; i++){
			if(str.charAt(i) == str.charAt(i+1)) {
				tmp++;
			}
			else{
				cnt = max(cnt, tmp);
				tmp = 1;
			}
		}
		if(tmp != 1) cnt = max(cnt, tmp);
		return cnt; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param
	 * @return blown up string
	 */
	public static String blowup(String s) {
		char[] str = s.toCharArray();
		StringBuilder res = new StringBuilder();
		int tmp = 0;
		for(char c : str){
			if(!Character.isDigit(c)){
				res.append(c);
				for(int i = 0; i < tmp; i++){
					res.append(c);
				}
				tmp = 0;
			} else{
				tmp = (int) (c - '0');
			}
		}
		return res.toString(); // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		int n = a.length();
		for (int i = 0; i < n; i++) {
			String tmp = a.substring(i, i + len);
			if(b.contains(tmp)) return true;
		}
		return false; // YOUR CODE HERE
	}
}
