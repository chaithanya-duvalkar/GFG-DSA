public class findrepetitive {
    public int findDuplicate(int[] arr) {
        // code here
        int duplicate=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            duplicate=duplicate^i;
        }
        for(int i=0;i<n;i++)
        {
            duplicate=duplicate^arr[i];
        }
        return duplicate;
    }
}