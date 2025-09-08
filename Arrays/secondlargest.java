// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

// Note: The second largest element should not be equal to the largest element.

// Examples:

// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.
// Input: arr[] = [10, 10, 10]
// Output: -1
// Explanation: The largest element of the array is 10 and the second largest element does not exist.
import java.util.*;
class secondlargest{
    public static int secondLargest(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                second=largest;
                largest=arr[i];
            }
            else if(second<arr[i]&&arr[i]!=largest)
            {
                second=arr[i];
            }
        }
        return (second==Integer.MIN_VALUE)?-1:second;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

    }
}
