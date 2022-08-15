import java.util.HashMap;
import java.util.Map;

public class HashSandbox {


		

	

	public static void main(String[] args) {
		Map<Integer, String> rns = Map.of(1, "I", 4, "IV", 5, "V", 9, "IX", 10, "X", 50, "L", 100, "C", 500, "D", 1000,
				"M");

		for (Map.Entry<Integer, String> v : rns.entrySet()) {
			System.out.println(v.getValue());
		}
	}

}
