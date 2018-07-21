package Ch1;
import java.util.*;
import java.io.*;
public class Qn1 {
    public static void main(String args[])
    {
        int ind,itr,len,flag=0;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        str=sc.nextLine();
        len=str.length();
        for(ind=0;ind<len;ind++)
        {
            for(itr=ind+1;itr<len;itr++)
            {
                if(str.charAt(ind)==str.charAt(itr))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
            System.out.println("Unique");
        else
            System.out.println("Not unique");
        
    }
}
