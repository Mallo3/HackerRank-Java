import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int alen= A.length();
        int blen= B.length();
        System.out.println(alen+blen);
        String arr[]={A,B};
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER );
        if(arr[0].equals(B) && !A.equals(B))
            System.out.println("Yes");
        else
            System.out.println("No");
        String fA=(A.substring(0,1));
        String fB=(B.substring(0,1));
        String rA=(A.substring(1,alen));
        String rB=(B.substring(1,blen));
        System.out.println(fA.toUpperCase()+rA+" "+fB.toUpperCase()+rB);
    }
}



