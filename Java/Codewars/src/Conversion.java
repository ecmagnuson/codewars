import java.util.NavigableMap;
import java.util.TreeMap;

public class Conversion {

	public String solution(int n) {
		NavigableMap<Integer, String> rns = new TreeMap<>();
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

		StringBuilder convertedNum = new StringBuilder();
		
		int digitsLeft = -1;
		int currentFloorKey = -1;
		String currentFloorValue = "";

		while (digitsLeft != 0) {
			digitsLeft = n - rns.floorKey(n);
			currentFloorKey = rns.floorKey(n);
			currentFloorValue = rns.get(rns.floorKey(n));
			n = digitsLeft;
			convertedNum.append(currentFloorValue);
		}
		return convertedNum.toString();
	}

}
