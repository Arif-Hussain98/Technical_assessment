import java.util.*;
import java.lang.*;
import java.io.*;


public class QuestionNo2
{
    public static void main(String[] args)
    {
        int array[] = {1,3,5,2,2};
        int arr_size = array.length;
        int result = equilibriumPoint(array, arr_size);
        System.out.println("The Equilibrium Point is: "+result);
    }
    
	static int equilibriumPoint(int array[], int n)
    {
        int total = 0;
        int leftsum = 0;

        for (int i = 0; i < n; ++i)
            total += array[i];
  
        for (int i = 0; i < n; ++i) {
            total -= array[i];
            if (leftsum == total)
                return ++i;
            leftsum += array[i];
        }
        return -1;
    }
}
