public class sortedAndRotated {
    public int findMin(int[] arr) {
        // complete the function here
        int n=arr.length;
        Arrays.sort(arr);
        return arr[0];
    }
}
