public class countInversion {
    public static InversionCount(int[] arr)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                count++;
            }
        }
        return count;
    }
}
