package general_tasks;

public class FindDistinctNumber {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 4, 8};

        int uniqueNumber = findUniqueNumber(nums);
        System.out.println("The unique number is: " + uniqueNumber);
    }

    public static int findUniqueNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
