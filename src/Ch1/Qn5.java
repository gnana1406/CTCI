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
public class Qn5 {
    static void edit(char[] str1,char[] str2)
    {
        int len1,len2,ind,itr,count=0;
        len1=str1.length;
        len2=str2.length;
        if(len1>len2)
        {
             if(str1[len1-1]==str2[len2-1])
            {
            for(ind=0,itr=0;ind<len1;)
            {
               
                if(str1[ind]==str2[itr])
                {         
                    ind++;
                    itr++;
                }
                else
                {
                    count++;
                    ind++;
                }
            }
                
            }
             else
                {
                    for(ind=0,itr=0;ind<len2;)
                    {
                      if(str1[ind]==str2[itr])
                      {
                          ind++;
                          itr++;
                      }
                    }
                      count=len1-ind;
                }
        }
        if(count==1)
            System.out.println("One edit");
        else
            System.out.println("More than one edit");
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        char[] str1=new char[100];
         char[] str2=new char[100];
        str1=sc.nextLine().toCharArray();
         str2=sc.nextLine().toCharArray();
         edit(str1,str2);
    }
}
