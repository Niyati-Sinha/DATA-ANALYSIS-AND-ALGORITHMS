/*Write a JAVA Program that will generate random numbers within a value and store the values in an array. Display the second maximum in the array as output. Input: 12, 3, 27,9,6 Output: 12*/
/*Time Complexity= O(n)*/
import java.util.Scanner;
class ArrayDay1_Q3
{
    static void gen_random(int arr[], int size, int upper)
    {
        System.out.print("ARRAY ELEMENTS : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=((int)(Math.random()*1000))%(upper);
            System.out.print(arr[i]+"  ");
        }
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("no. of entry in array");
            int entry=sc.nextInt();
            int array[]=new int[entry];
            System.out.println("upper bound for the entry");
            int upper=sc.nextInt();
            gen_random(array ,entry, upper);
            int max1=array[0];
            int max2=array[0];
            for(int i=0;i<entry;i++)
            {
                if(array[i]>max2)
                {
                    if(array[i]>max1)
                    {
                        max2=max1;
                        max1=array[i];
                    }
                    else if(array[i]!=max1)
                        max2=array[i];
                }
            }
            System.out.println("SECOND MAX= "+max2); 
        }
}    
        
        
    