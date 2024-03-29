public class Test {    
    public static void main(String[] args) {
        // Test case 1
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(numbers1, target1);
        System.out.println("Test Case 1: Expected: [1, 2], Actual: [" + result1[0] + ", " + result1[1] + "]");

        // Test case 2
        int[] numbers2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 8;
        int[] result2 = twoSum(numbers2, target2);
        System.out.println("Test Case 2: Expected: [4, 5], Actual: [" + result2[0] + ", " + result2[1] + "]");

    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            }
            
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}
