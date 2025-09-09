
public class rotateArray {
    static void reverse(int[] arr,int left,int right)
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

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
}
