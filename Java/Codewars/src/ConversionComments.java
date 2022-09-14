import java.util.NavigableMap;
import java.util.TreeMap;

public class ConversionComments {

	// TreeMap sorted RB-BST Map
	// https://www.javatpoint.com/java-treemap
	// NavigableMap is the Interface
	NavigableMap<Integer, String> rns = new TreeMap<>();
	{
		rns.put(1, "I");
		rns.put(4, "IV");
		rns.put(5, "V");
		rns.put(9, "IX");
		rns.put(10, "X");
		rns.put(40, "XL");
		rns.put(50, "L");
		rns.put(90, "XC");
		rns.put(100, "C");
		rns.put(400, "CD");
		rns.put(500, "D");
		rns.put(900, "CM");
		rns.put(1000, "M");
	}

	public String solution(int n) {

		StringBuilder convertedNum = new StringBuilder();

		int digitsLeft = -1; // get the digits left from floor
		int currentFloorKey = -1; // the current int that is below digitsLeft
		String currentFloorValue = ""; // the value of the current floor

		/*
		 * Doing this problem I inevitably always wanted a way where I could get to the
		 * closest value of the parameter int. i.e. if n was 15, I wanted to find 10 ->
		 * X Likewise, if it was 25, still find 10. The TreeMap with NavgableMap has the
		 * method floorKey to do this so it made it much easier to accomplish this..
		 */
		/*
		 * This was my first time using and learning about this data structure. It's
		 * very neat. I think we spoke about it when we spoke about it implementation as
		 * a red black BST
		 */
		while (digitsLeft != 0) {
			digitsLeft = n - rns.floorKey(n);
			currentFloorKey = rns.floorKey(n);
			currentFloorValue = rns.get(rns.floorKey(n));
			n = digitsLeft; // update n

			convertedNum.append(currentFloorValue);
		}
		return convertedNum.toString();
	}

	public static void main(String[] args) {
		ConversionComments c = new ConversionComments();
		System.out.println(c.solution(950));
	}

}
