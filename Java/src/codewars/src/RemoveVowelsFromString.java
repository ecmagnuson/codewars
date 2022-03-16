import java.util.Arrays;

public class RemoveVowelsFromString {

	public static String getString(String s) {
		char[] sCharArray = s.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		StringBuilder builder = new StringBuilder(sCharArray.length);

		for (int i = 0; i < sCharArray.length; i++) {
			for (char vowel : vowels) {
				if (sCharArray[i] == vowel) {
					sCharArray[i] = '0';
				}
			}
		}

		for (char ch : sCharArray) {
			if (ch != '0') {
				builder.append(ch);
			}
		}

		System.out.println(builder);

		System.out.print(Arrays.toString(sCharArray));
		return "";
	}

	public static void main(String[] args) {
		String s = "This website is for losers LOL!";
		getString(s);
	}
}
