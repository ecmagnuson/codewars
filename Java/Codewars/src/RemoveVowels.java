import java.util.ArrayList;

public class RemoveVowels {

	public static String getStringRepresentation(ArrayList<Character> list) {
		StringBuilder builder = new StringBuilder(list.size());
		for (Character ch : list) {
			builder.append(ch);
		}
		return builder.toString();
	}

	public static String disemvowel(String str) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		str = str.toLowerCase();
		char[] strChars = str.toCharArray();
		ArrayList<Character> strCharsList = new ArrayList<Character>();

		// add to list when not in vowel.
		for (int i = 0; i < strChars.length; i++) {
			if (strChars[i] != 'o') {   //if not in
				strCharsList.add(strChars[i]);
			}
		}
		String returnStr = getStringRepresentation(strCharsList);
		return returnStr;
	}

	public static void main(String[] args) {
		String s = "This website is for losers LOL!";
		System.out.println(disemvowel(s));
	}
}
