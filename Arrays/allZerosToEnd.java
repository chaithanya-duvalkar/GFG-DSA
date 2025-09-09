// You are given an array arr[] of non-negative integers. You have to move all the zeros in the array 
//to the right end while maintaining the relative order of the non-zero elements. 
//The operation must be performed in place, meaning you should not use extra space for another array.

// Examples:

// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.
// Input: arr[] = [10, 20, 30]
// Output: [10, 20, 30]
// Explanation: No change in array as there are no 0s.
// Input: arr[] = [0, 0]
// Output: [0, 0]
// Explanation: No change in array as there are all 0s.

public class allZerosToEnd {
    void pushZerosToEnd(int[] arr)
    {
        int pos=0;
        for(int i=0;i<arr.length;i++) //assign zeros to end
        {
            if(arr[i]!=0)
            {
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length) //assign zeros to the remaining space of the array
        {
            arr[pos]=0;
            pos++;
        }
    }
    
}
