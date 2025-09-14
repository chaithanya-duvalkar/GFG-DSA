// In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

// Examples:

// Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
// Output: 22
// Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
// Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
// Output: 23
// Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].
// Input: arr[] = [5, -2, 3, 4]
// Output: 12
// Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.

public class maxCircularSubArray {
    public int maxCircular(int[] arr)
    {
        int n=arr.length;
        int max_Sum=kadane(arr);

        if(max_Sum<0)
        {
            return max_Sum;
        }

        int total_Sum=0;
        for(int i=0;i<n;i++)
        {
            total_Sum+=arr[i];
        }

        

    }

    private int kadane(int[] arr)
    {
        int n=arr.length;
        int max_sum=arr[0];
        int current_sum=arr[0];

        for(int i=1;i<n;i++)
        {
            current_sum=Math.max(arr[i],current_sum+arr[i]);
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
}
