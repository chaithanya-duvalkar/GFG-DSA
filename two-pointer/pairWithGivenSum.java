// You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
// Note: pairs should have elements of distinct indexes. 

// Examples :

// Input: arr[] = [-1, 1, 5, 5, 7], target = 6
// Output: 3
// Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
// Input: arr[] = [1, 1, 1, 1], target = 2
// Output: 6
// Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
// Input: arr[] = [-1, 10, 10, 12, 15], target = 125
// Output: 0
// Explanation: There is no such pair which sums up to 125.

import java.util.Arrays;

public class pairWithGivenSum {
    int countPairs(int arr[], int target) {
        // Complete the function
        Arrays.sort(arr);
        int count=0;
        int result=0;
        int left=0;
        int right=arr.length-1;
        
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum>target)
            {
                right--;
            }
            else if(sum<target)
            {
                left++;
            }
            else{
                int ele1=arr[left];
                int ele2=arr[right];
                int cnt1=0;
                int cnt2=0;
                
                while(left<=right && arr[left]==ele1)
                {
                    left++;
                    cnt1++;
                }
                while(left<=right && arr[right]==ele2)
                {
                    right--;
                    cnt2++;
                }
                if(ele1==ele2)
                {
                    result+=(cnt1*(cnt1-1))/2;
                }
                else{
                    result+=(cnt1*cnt2);
                }
            }
        }
        return result;
    }
     public static void main(String[] args) {
        pairWithGivenSum obj = new pairWithGivenSum();
        
        int[] arr1 = {-1, 1, 5, 5, 7};
        int target1 = 6;
        System.out.println("Count of pairs = " + obj.countPairs(arr1, target1)); 
        // Expected: 3  → {1,5}, {1,5}, {-1,7}

        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 6;
        System.out.println("Count of pairs = " + obj.countPairs(arr2, target2)); 
        // Expected: 2  → {1,5}, {2,4}

        int[] arr3 = {2, 2, 2, 2};
        int target3 = 4;
        System.out.println("Count of pairs = " + obj.countPairs(arr3, target3)); 
        // Expected: 6  → all pairs (4 choose 2)
    }
}
