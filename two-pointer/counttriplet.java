// Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, 
// such that arr[i] + arr[j] + arr[k] = target and i < j < k.
// Examples:
// Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
// Output: 4
// Explanation: Four triplets that add up to -2 are:
// arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
// arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
// arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
// arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
// Input: arr[] = [-2, 0, 1, 1, 5], target = 1
// Output: 0
// Explanation: There is no triplet whose sum is equal to 1. 


import java.util.*;
public class counttriplet {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        Arrays.sort(arr);
        int result=0;
     
        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
            {
                while(left<right)
                {
                    int sum=arr[left]+arr[right]+arr[i];
                    if(sum<target)
                    {
                        left++;
                    }
                    else if(sum>target)
                    {
                        right--;
                    }
                    else
                    {
                        int cnt1=0;
                        int cnt2=0;
                        int element1=arr[left];
                        int element2=arr[right];
                        
                        while(left<=right && arr[left]==element1)
                        {
                            left++;
                            cnt1++;
                        }
                        while(left<=right && arr[right]==element2)
                        {
                            cnt2++;
                            right--;
                            
                        }
                        if(element1==element2)
                        {
                            result+=(cnt1*(cnt1-1))/2;
                        }
                        else
                        {
                            result+=(cnt1*cnt2);
                        }
                        
                    }
                }
            }
        }
        return result;
    }
}

