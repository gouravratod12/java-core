import java.util.Scanner;

class Arraymerge {
     public static void main(String k[])
     {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of first array:");
         int number=sc.nextInt();
         System.out.println("Enter first array elements:");
         int first[]=new int[number];
         int count=0;
        for(int index=0;index<number;index++)
        {
           first[count]=sc.nextInt();
           count++;
        }
        System.out.println("Enter the size of second  array:");
         int m=sc.nextInt();
        int second[]=new int[m+number];
        for(int index=0;index<m;index++)
        {
           second[count]=sc.nextInt();
           count++;
        }
        int merge[]=new int[number+m];
        for(int index=0;index<number+m;index++)
        {
            if(index<number)
            {
               merge[index]=first[index];
            }
            else{
               merge[index]=second[index];
            }
        }
        System.out.println("array after merging:");
        for(int index=0;index<number+m;index++)
        {
            System.out.print(merge[index]+" ");
        
        }

     }    
}
