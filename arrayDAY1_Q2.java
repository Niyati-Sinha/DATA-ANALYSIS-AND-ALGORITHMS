/*Write a C Program that will read an array arr of elements in sorted manner and display the elements at I,j,k index such that arr[i]+arr[j]+arr[k]=key, where key element is given as input.*/
/*Time complexity=O(n)*/

import java.util.Scanner;
class arrayDAY1_Q2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER SORTED ARRAY SIZE");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int z=0;z<size; z++)
            arr[z]=sc.nextInt();
        System.out.println("ENTER KEY VALUE");
        int key=sc.nextInt ();
        
        int i=0, j=1;
        for (int k=0;k<size;k++)
        {
            if(i!=j && j!=k && k!=1)
            {
                if(arr[i]+arr[j]+arr[k]==key)
                {
                    System.out.println( "i="+i+" j="+j+" k="+k); 
                    System.out.println("arr[i]="+arr[i]+", arr[j]="+arr[j]+", arr[k]="+arr[k]);
                }
            }
            if (k==size-1 && j!=size-2)
            {
                j++;
                k=1+1;
            }
            if (k== size-2 && k==size-1)
            {
                i++;
                k=j+1;
            }
        }
    }
}
