
import java.util.NavigableMap;
import java.util.TreeMap;

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

public class Conversion2 {

	public String solution(int n) {
		// TreeMap sorted RB-BST Map
		// https://www.javatpoint.com/java-treemap
		// NavigableMap is the Interface
		NavigableMap<Integer, String> rns = new TreeMap<>();
		rns.put(1, "I");
		rns.put(4, "IV");
		rns.put(5, "V");
		rns.put(9, "IX");
		rns.put(10, "X");
		rns.put(40, "XL");
		rns.put(50, "L");

		StringBuilder convertedNum = new StringBuilder();

		if (rns.containsKey(n)) {
			return rns.get(n);
		}

		// append the floorKey
		convertedNum.append(rns.get(rns.floorKey(n)));

		int digitsLeft = n - rns.floorKey(n); // get the digits left
		System.out.println("digitsLeft after first append: " + digitsLeft);

		// have the digits left now.

		// if the digits left are present in the map then append else loop
		if (rns.containsKey(digitsLeft)) {
			convertedNum.append(rns.get(digitsLeft));
		}

		else {
			convertedNum.append(rns.get(rns.floorKey(digitsLeft)).repeat(digitsLeft)); //seems complicated
			digitsLeft = digitsLeft - rns.floorKey(digitsLeft);
			System.out.println(digitsLeft + " after next");
		}

//		else {
//			System.out.println(rns.get(rns.floorKey(digitsLeft)));
//
//			for (int i = 0; i < digitsLeft; i++) {
//				convertedNum.append(rns.get(rns.floorKey(digitsLeft)));
//			}
//		}
		return convertedNum.toString();
	}

	public static void main(String[] args) {
		Conversion2 c = new Conversion2();

		System.out.println(c.solution(16));
	}

}