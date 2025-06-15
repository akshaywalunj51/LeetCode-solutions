public class p_1480 {
	
	public static int[] runningSum(int[] nums) {
		
		int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            result[i] = nums[i] + result[i - 1];
        }
        return result;

	}
	
	public static void main(String[] args) {
		int[] nums = {21,45,24,40};
		System.out.println(runningSum(nums));
	}
}

// time complexity - O(n)
// space complexity - O(n)