// Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

// Examples :

// Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
// Output: 4
// Explanation: target = 2 occurs 4 times in the given array so the output is 4.
// Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
// Output: 0
// Explanation: target = 4 is not present in the given array so the output is 0.
// Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
// Output: 3
// Explanation: target = 12 occurs 3 times in the given array so the output is 3.

public class noOfOccurence {
    public int countFreq(int[] arr,int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }
    
}
