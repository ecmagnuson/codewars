import java.util.Arrays;

public class Kata {

	public static String highAndLow(String numbers) {
		int[] nums = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(nums);
		return String.valueOf(nums[nums.length - 1]) +  " " + String.valueOf(nums[0]);
	}

}
