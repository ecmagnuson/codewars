import java.util.Map;

/*
* Create a function taking a positive integer as its 
* parameter and returning a string containing the Roman Numeral 
* representation of that integer.
*
*	Modern Roman numerals are written by expressing 
*	each digit separately starting with the left most digit and 
* 	skipping any digit with a value of zero. In Roman numerals 
*	1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 
*	2008 is written as 2000=MM, 8=VIII; or MMVIII. 
*	1666 uses each Roman symbol in descending order: MDCLXVI.
*
*	Example:
*
*	conversion.solution(1000); //should return "M"
*
*	Help:
*
*	Symbol    Value
*	I          1
*	V          5
*	X          10
*	L          50
*	C          100
*	D          500
*	M          1,000
*
*	Remember that there can't be more than 3 identical symbols in a row.
*	More about Roman numerals - http://en.wikipedia.org/wiki/Roman_numerals
*/

public class Conversion {

	public String solution(int n) {
		String numeral = "";
		Map<Integer, String> rns = Map.of(1, "I", 4, "IV", 5, "V", 9, "IX", 10, "X", 50, "L", 100, "C", 500, "D", 1000, "M");

		// determine how many digits the int passed in is
		int digitLen = String.valueOf(n).length();
		
		for (int i = 0; i < rns.size(); i++) {
			System.out.println(rns.get(i));
		}

//		if (digitLen == 1) {
//			if (n == 5) {
//				return "V";
//			}
//			if (n < 5) {
//				if (n == 4) {
//					return "IV";
//				} else {
//					return rns.get(1).repeat(n);
//				}
//			}
//			if (n == 9) {
//				return "IX";
//			} else {
//				return "V" + rns.get(1).repeat(n - 5);
//			}
//		}
		
		
		
		
		

		if (digitLen == 2) {

		}

		if (digitLen == 3) {

		}

		if (digitLen == 4) {

		}
		return numeral.toString();
	}

	public static void main(String[] args) {
		Conversion c = new Conversion();
		System.out.println(c.solution(5));
	}

	// continually check the digit length and remove from the int and add to the
	// string

	// create the actual numbers themselves for the digit.

	// determine if the digit is closer in value to the higher or lower value
	// then remove the values from the digit
	// cant have more than 3 digits appear as well
	// have to build the string while removing the digits

	// while the value is

}