// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// Note: You need to solve this problem without utilizing the built-in sort function.

// Examples:

// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order.
// Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order

public class zerosonestwos {
    void sort012(int arr[],int n)
    {
        int low=0,mid=0,high=n-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    void swap(int arr[],int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}
