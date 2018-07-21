
package Ch1;
import java.util.*;
import java.io.*;
public class Qn2 {
    static boolean permutation(String str1,String str2)
    {
        int len1,len2,ind;
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        len1=str1.length();
        len2=str2.length();
        if(len1!=len2)
        {
            return false;
        }
        for(ind=0;ind<len1;ind++)
        {
            freq1[str1.charAt(ind)]++;
        }
        for(ind=0;ind<len2;ind++)
        {
            freq2[str2.charAt(ind)]++;
        }
        for(ind=0;ind<256;ind++)
        {
            if(freq1[ind]!=freq2[ind])
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        str1=sc.nextLine();
        str2=sc.nextLine();
        if(permutation(str1,str2))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
