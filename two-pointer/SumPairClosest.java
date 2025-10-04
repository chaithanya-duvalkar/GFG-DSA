// Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a ≤ b whose sum is closest to target.
// Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

// Examples:

// Input: arr[] = [10, 30, 20, 5], target = 25
// Output: [5, 20]
// Explanation: As 5 + 20 = 25 is closest to 25.
// Input: arr[] = [5, 2, 7, 1, 4], target = 10
// Output: [2, 7]
// Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of (4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
// Input: arr[] = [10], target = 10
// Output: []
// Explanation: As the input array has only 1 element, return an empty array.
import java.util.*;

public class SumPairClosest {
    public ArrayList<Integer> sumClosest(int[] arr,int target)
    {
        int n=arr.length;
        if(n<2)
        {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        int closestSum=arr[0]+arr[1];
        int left=0;
        int right=n-1;
        int num1=arr[0];
        int num2=arr[1];

        while(left<right)
        {
            int currentSum=arr[left]+arr[right];
            int currentDiff=Math.abs(currentSum-target);
            int closestDiff=Math.abs(closestSum-target);

            if(currentDiff<closestDiff || (currentDiff==closestDiff && (Math.abs(arr[left]-arr[right]) > Math.abs(num1-num2))))
            {
                closestSum=currentSum;
                num1=arr[left];
                num2=arr[right];
            }
            if(currentSum<target)
            {
                left++;
            }
            else if(currentSum>target)
            {
                right--;
            }
            else 
            {
                return new ArrayList<>(Arrays.asList(arr[left],arr[right]));
            }

        }
        return new ArrayList<>(Arrays.asList(num1,num2));
    }
     public static void main(String[] args) {
        SumPairClosest sol = new SumPairClosest();

        int[] arr1 = {10, 30, 20, 5};
        int target1 = 25;
        System.out.println(sol.sumClosest(arr1, target1)); // Output: [5, 20]

        int[] arr2 = {5, 2, 7, 1, 4};
        int target2 = 10;
        System.out.println(sol.sumClosest(arr2, target2)); // Output: [2, 7]
    }
}
