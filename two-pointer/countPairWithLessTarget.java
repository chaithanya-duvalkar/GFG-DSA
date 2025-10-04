// Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.

// Examples:

// Input: arr[] = [7, 2, 5, 3], target = 8
// Output: 2
// Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3). 
// Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
// Output: 4
// Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).
// Input: arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
// Output: 6
// Explanation: There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).
import java.util.*;
public class countPairWithLessTarget {
    public static int countPairs(int[] arr,int target)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int count=0;

        while(left<right)
        {
            if(arr[left]+arr[right]>=target)
            {
                right--;
            }
            else{
                count+=right-left;
                left++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int[] arr1={7, 2, 5, 3};
        System.out.println("Count of Pairs with less than target:"+countPairs(arr1,8));

        int[] arr2={5, 2, 3, 2, 4, 1};
        System.out.println("Count of Pairs with less than target:"+countPairs(arr2,5));

        int[] arr3={2, 1, 8, 3, 4, 7, 6, 5};
        System.out.println("Count of Pairs with less than target:"+countPairs(arr3,7));
    }
    
}
