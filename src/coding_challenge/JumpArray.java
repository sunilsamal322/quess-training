/*
You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0,
which makes it impossible to reach the last index.

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105

* */

import java.util.Scanner;

public class JumpArray {

    static boolean checkCanJump(int[] nums)
    {
        int i= 0, max=0;
        while(i<nums.length)
        {
            if(i>max)
            {
                return false;
            }
            max = Math.max(i + nums[i], max);
            i++;
        }
        if(i == nums.length)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size= scan.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter elements");
        for(int index=0;index< nums.length;index++)
        {
            nums[index]=scan.nextInt();
        }
        System.out.println(checkCanJump(nums));
    }
}
