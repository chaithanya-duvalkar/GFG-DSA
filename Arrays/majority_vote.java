// Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.

// Note: The returned array of majority elements should be sorted.

// Examples:

// Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
// Output: [1, 2]
// Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
// Input:  arr[] = [-5, 3, -5]
// Output: [-5]
// Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).
// Input:  arr[] = [3, 2, 2, 4, 1, 4]
// Output: []
// Explanation: There is no majority element.
import java.util.*;
class majority_vote {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        int c1=0,c2=0;
        Integer a=null,b=null;
        
        for(int num:arr)
        {
            if(a!=null&&a==num)
            {
                c1++;
            }
            else if(b!=null&&b==num)
            {
                c2++;
            }
            else if(c1==0)
            {
                a=num;
                c1=1;
            }
            else if(c2==0)a
            {
                b=num;
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:arr)
        {
            if(a!=null&&num==a) c1++;
            else if(b!=null&&num==b) c2++;
        }
        ArrayList<Integer> result=new ArrayList<>();
        if (c1>n/3) result.add(a);
        if (c2>n/3) result.add(b);
        
        Collections.sort(result);
        return result;
    }
}
