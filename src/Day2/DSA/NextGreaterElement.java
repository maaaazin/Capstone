package Day2.DSA;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();  
            }
            if (stack.isEmpty()) {
                result[i] = -1;  
            } 
            else {
                result[i] = stack.peek();  
            }
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] result = nextGreaterElement(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();  
    }
    
}
