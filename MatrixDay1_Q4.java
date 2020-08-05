/*Write a Java Program WAP that will produce random numbers in any range and store it in a martix. Convert it to a tri-diagonal matrix and display the new matrix as output.*/

import java.util.Scanner;
class MatrixDay1_Q4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array greater or equal to 4");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        int count=0;
        for(int i=0; i<size; i++)
        {
            arr[count][i]=(int)(Math.random()*100);
            //arr[count][i]=10*count+i;
            System.out.print(arr[count][i]+"    ");
            if(i==size-1 && count!=size-1)
            {
             i=-1; count++;
             System.out.println();
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        count=0;
        for(int i=0; i<size; i++)
        {
            if(i==count||count-i==1||i-count==1)
            {
                System.out.print(arr[count][i]+"  ");
            }
            else
            {
                arr[count][i]=0;
                System.out.print("0"+"  ");
            }
                if(i==size-1 && count!=size-1)
            {
             i=-1; count++;
             System.out.println();
            }
        } 
    }
}