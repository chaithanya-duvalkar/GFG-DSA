// Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

// Examples:

// Input: arr[] = [3, 0, 1, 0, 4, 0 2]
// Output: 10
// Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.
// Input: arr[] = [3, 0, 2, 0, 4]
// Output: 7
// Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.
// Input: arr[] = [1, 2, 3, 4]
// Output: 0
// Explanation: We cannot trap water as there is no height bound on both sides.
// Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
// Output: 9
// Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.

public class trappingRainWater {
    public int maxWater(int arr[]) 
    {
        // code here
        int n=arr.length;
        int left_max[]=new int[n];
        left_max[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }
        
        int right_max[]=new int[n];
        right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }
        
        int trappedwater=0;
        
        for(int i=0;i<n;i++)
        {
            int watercontainer=Math.min(right_max[i],left_max[i]);
            
            trappedwater+=watercontainer-arr[i];
        }
        return trappedwater;
    }

     public static void main(String[] args) {
        trappingRainWater obj = new trappingRainWater();

        int[] arr1 = {3, 0, 2, 0, 4};
        System.out.println("Trapped Water = " + obj.maxWater(arr1)); 
        // Expected output: 7

        int[] arr2 = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        System.out.println("Trapped Water = " + obj.maxWater(arr2)); 
        // Expected output: 8

        int[] arr3 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped Water = " + obj.maxWater(arr3)); 
        // Expected output: 9
    }
}
