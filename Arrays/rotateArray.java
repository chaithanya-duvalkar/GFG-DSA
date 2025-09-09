
public class rotateArray {
    static void reverseArray(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static void rotateArray(int[] arr,int d)
    {
        int n=arr.length;
        d=d%n;

        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }
    
}
