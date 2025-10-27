import java.util.Scanner;

public class addTwoString {
    public static String addtwobinary(String s1,String s2)
    {
        StringBuilder result=new StringBuilder();
        int a=s1.length()-1,b=s2.length()-1,carry=0;

        while(a>=0 || b>=0 || carry>0)
        {
            int sum=carry;
            if(a>=0)
            {
                sum+=s1.charAt(a--)-'0';
            }
            if(b>=0)
            {
                sum+=s2.charAt(b--)-'0';
            }
            result.append(sum%2);
            carry=sum/2;
        }

        String ans=result.reverse().toString();

        int i=0;
        while(i<ans.length()-1 && ans.charAt(i)=='0')
        {
            i++;
        }
        return ans.substring(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first binary string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second binary string:");
        String s2 = sc.nextLine();

        addTwoString obj = new addTwoString();
        String sum = obj.addtwobinary(s1, s2);

        System.out.println("Binary Sum: " + sum);
        sc.close();
    }
}
