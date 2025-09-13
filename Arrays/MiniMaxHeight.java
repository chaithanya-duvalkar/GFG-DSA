
import java.util.*;
public class MiniMaxHeight {
    public static int minmaxheight(int arr[],int k)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int result=arr[n-1]-arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0) continue;
            int minH=Math.min(arr[0]+k,arr[i]-k);
            int maxH=Math.min(arr[i-1]+k,arr[n-1]-k);

            result=Math.min(result,maxH-minH);
        }

        return result;
    }
}
