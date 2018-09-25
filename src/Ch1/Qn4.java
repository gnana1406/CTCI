/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Pavan
 */
public class Qn4 {
    static void palindrome(char[] str)
    {
        int[] freq=new int[26];
        int ind,val,count=0,itr=0;
        for(ind=0;ind<str.length;ind++)
        {
            val=str[ind];
            //System.out.println(val);
            if(str[ind]>='a'&&str[ind]<='z')
            {
                //freq[val-97]++;
                itr=val-97;
            }
            else if(str[ind]>='A'&&str[ind]<='Z')
            {
              // freq[val-65]++;
                itr=val-65;
            }
            freq[itr]++;
        }
        for(ind=0;ind<26;ind++)
        {
            if(freq[ind]%2!=0)
                count++;
        }
        if(count>1)
            System.out.println("Not a palindrome");
        else
            System.out.println("Palindrome");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char[] str=new char[100];
        str=sc.nextLine().toCharArray();
        palindrome(str);
    }
}
