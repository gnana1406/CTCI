
package Ch1;
import java.io.*;
import java.util.*;
public class Qn3 {
    static void URLify(char[] str)
    {
        int ind,itr,new_len,len,space=0;
        char[] url=new char[100];
        len=str.length;
        for(ind=0;ind<len;ind++)
        {
            if(str[ind]==' ')
            {
                space++;
            }
        }
        new_len=len+2*space;
        for(ind=new_len-1,itr=len-1;ind>=0;ind--,itr--)
        {
            if(str[itr]==' ')
            {
               url[ind]='0';
               url[ind-1]='2';
               url[ind-2]='%';
               ind=ind-2;
            }
            else
            {
                url[ind]=str[itr];
            }
        }
        System.out.println(url);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char[] str=new char[100];
        str=sc.nextLine().toCharArray();
        URLify(str);
    }
}
