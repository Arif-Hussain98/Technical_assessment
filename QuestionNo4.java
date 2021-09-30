import java.util.*;
import java.lang.*;
import java.io.*;


public class QuestionNo4
{
    public static void main(String[] args)
    {
        int n = 6;
        int s[] = {1,3,0,5,8,5};
        int f[] = {2,4,6,7,9,9};
        int meetings = maxMeetings(s,f,n);
        System.out.println(meetings);
    }
    
   public static int maxMeetings(int s[], int f[], int n)
   {
       int k=0, countMeeting=0;
       int [][] arr2d =new int [n][2];
       
       for(int i=0;i<n;i++){
           arr2d[i][0]=s[i];
           arr2d[i][1]=f[i];
       }
       Arrays.sort(arr2d,(x,y)->Double.compare(x[1],y[1]));
       
       for(int i=0;i<s.length;i++){
           if(arr2d[i][0]>k){
               k=arr2d[i][1];
               countMeeting++;
           }
       }
       
       return countMeeting;
   }
}
