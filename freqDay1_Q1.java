/* • Write a JAVA Program that will read an array of elements and display the following, • Duplicate elements present in the array with their frequency • The duplicate element with highest frequency of occurrence • For example, Input: 1 2 1 3 4 3 4 3 Output: 1 is duplicate with 2 frequency …3 having highest frequency */
/*Time Complexity = O(n)*/
import java.util.Scanner;
class freqDay1_Q1
{
    
    static void arr_assign_random(int arr[] ,int lower, int upper)
    {
        for(int i=lower;i<=upper;i++)
        {
            arr[i]=((int)(Math.random()*1000)%(upper-lower+1));
            //System.out.println(arr[i]+"....");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input no.s range in which the no.s should be generated:");
        System.out.println("Input lower range");
        int lower=sc.nextInt();
        System.out.println("Input upper range");
        int upper=sc.nextInt();
        int array[]=new int[upper+1];
        int freq[]=new int[upper+1];
        arr_assign_random(array,lower,upper);
        int max=0,max_f_ele=0;
        for(int i=0; i<=upper-lower;i++)
        {
            freq[array[i]]++;
        }
        for(int i=0; i<=upper-lower;i++)
        {
            if(freq[i]>0)
            {
                System.out.println("frequency of "+ i+"="+freq[i]);
                if(max<freq[i])
                {   
                    max=freq[i];
                    max_f_ele=i;
                }
            }
        }
        System.out.println(max_f_ele+" is the element with max freq = "+freq[max_f_ele]);
    }
}